package se.trafik.antalstop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import se.trafik.antalstop.dto.JourneyPatternPointOnLineModelDto;
import se.trafik.antalstop.dto.StopPointModelDto;

import javax.annotation.PostConstruct;

@Repository
public class DataRepository {

    @Value("${api.key}")
    private String apiKey;

    private static JourneyPatternPointOnLineModelDto journeyPatternPointOnLineModelDto = null;

    private static StopPointModelDto stopPointModelDto = null;

    @Autowired
    private WebClient webClient;

    @PostConstruct
    public void getDataFromSource() {
        journeyPatternPointOnLineModelDto = webClient
                .get()
                .uri("/LineData.json?model=jour&key=" + apiKey + "&DefaultTransportModeCode=BUS")
                .retrieve()
                .bodyToMono(JourneyPatternPointOnLineModelDto.class)
                .block();

        stopPointModelDto = webClient
                .get()
                .uri("/LineData.json?model=stop&key=" + apiKey + "&DefaultTransportModeCode=BUS")
                .retrieve()
                .bodyToMono(StopPointModelDto.class)
                .block();
    }

    public JourneyPatternPointOnLineModelDto getJourneyPatternPointOnLineModelDto() {
        return journeyPatternPointOnLineModelDto;
    }

    public StopPointModelDto getStopPointModelDto() {
        return stopPointModelDto;
    }

}
