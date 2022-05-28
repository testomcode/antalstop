package se.trafik.antalstop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import se.trafik.antalstop.dto.JourneyPatternPointOnLineDto;
import se.trafik.antalstop.dto.ModelDto;
import se.trafik.antalstop.dto.StopPointDto;

import javax.annotation.PostConstruct;

@Repository
public class DataRepository {

    @Value("${api.key}")
    private String apiKey;

    private static ModelDto<JourneyPatternPointOnLineDto> journeyPatternPointOnLineModelDto = null;

    private static ModelDto<StopPointDto> stopPointModelDto = null;

    @Autowired
    private WebClient webClient;

    @PostConstruct
    public void getDataFromSource() {
        journeyPatternPointOnLineModelDto = webClient
                .get()
                .uri("/LineData.json?model=jour&key=" + apiKey + "&DefaultTransportModeCode=BUS")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<ModelDto<JourneyPatternPointOnLineDto>>() {
                })
                .block();

        stopPointModelDto = webClient
                .get()
                .uri("/LineData.json?model=stop&key=" + apiKey + "&DefaultTransportModeCode=BUS")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<ModelDto<StopPointDto>>() {
                })
                .block();
    }

    public ModelDto<JourneyPatternPointOnLineDto> getJourneyPatternPointOnLineModelDto() {
        return journeyPatternPointOnLineModelDto;
    }

    public ModelDto<StopPointDto> getStopPointModelDto() {
        return stopPointModelDto;
    }

}
