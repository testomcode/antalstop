package se.trafik.antalstop.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import se.trafik.antalstop.Line;
import se.trafik.antalstop.dto.*;
import se.trafik.antalstop.repository.DataRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class LinesServiceTest {

    @MockBean
    DataRepository dataRepository;

    @Autowired
    LinesService linesService;

    @Test
    void getLinesWithMostStopsTest() {
        JourneyPatternPointOnLineDto journeyPatternPointOnLineDto1 = createJourneyPatternPointOnLineDto(1, 10);

        JourneyPatternPointOnLineDto journeyPatternPointOnLineDto2 = createJourneyPatternPointOnLineDto(1, 11);

        JourneyPatternPointOnLineDto journeyPatternPointOnLineDto3 = createJourneyPatternPointOnLineDto(1, 12);

        JourneyPatternPointOnLineDto journeyPatternPointOnLineDto4 = createJourneyPatternPointOnLineDto(2, 20);

        JourneyPatternPointOnLineDto journeyPatternPointOnLineDto5 = createJourneyPatternPointOnLineDto(2, 21);

        JourneyPatternPointOnLineDto journeyPatternPointOnLineDto6 = createJourneyPatternPointOnLineDto(3, 30);

        JourneyPatternPointOnLineResponseDataDto journeyPatternPointOnLineResponseDataDto = new JourneyPatternPointOnLineResponseDataDto();
        journeyPatternPointOnLineResponseDataDto.setResult(List.of(journeyPatternPointOnLineDto1,
                journeyPatternPointOnLineDto6,
                journeyPatternPointOnLineDto2,
                journeyPatternPointOnLineDto3,
                journeyPatternPointOnLineDto5,
                journeyPatternPointOnLineDto4));

        JourneyPatternPointOnLineModelDto journeyPatternPointOnLineModelDto = new JourneyPatternPointOnLineModelDto();
        journeyPatternPointOnLineModelDto.setResponseData(journeyPatternPointOnLineResponseDataDto);

        StopPointDto stopPointDto1 = createStopPointDto(10, "TEN");

        StopPointDto stopPointDto2 = createStopPointDto(11, "ELEVEN");

        StopPointDto stopPointDto3 = createStopPointDto(12, "TWELVE");

        StopPointDto stopPointDto4 = createStopPointDto(20, "TWENTY");

        StopPointDto stopPointDto5 = createStopPointDto(21, "TWENTY_ONE");

        StopPointDto stopPointDto6 = createStopPointDto(30, "THIRTY");

        StopPointResponseDataDto stopPointResponseDataDto = new StopPointResponseDataDto();
        stopPointResponseDataDto.setResult(List.of(stopPointDto6,
                stopPointDto3,
                stopPointDto5,
                stopPointDto4,
                stopPointDto1,
                stopPointDto2));

        StopPointModelDto stopPointModelDto = new StopPointModelDto();
        stopPointModelDto.setResponseData(stopPointResponseDataDto);

        when(dataRepository.getJourneyPatternPointOnLineModelDto()).thenReturn(journeyPatternPointOnLineModelDto);
        when(dataRepository.getStopPointModelDto()).thenReturn(stopPointModelDto);

        List<Line> lines = linesService.getLinesWithMostStops(10);

        assertEquals(3, lines.size());
        assertEquals(1,lines.get(0).getLineNumber());
        assertEquals(3,lines.get(0).getStopNames().size());
        assertEquals(2,lines.get(1).getLineNumber());
        assertEquals(2,lines.get(1).getStopNames().size());
        assertEquals(3,lines.get(2).getLineNumber());
        assertEquals(1,lines.get(2).getStopNames().size());
        assertEquals("THIRTY", lines.get(2).getStopNames().get(0));
    }

    private JourneyPatternPointOnLineDto createJourneyPatternPointOnLineDto(Integer lineNumber, Integer journeyPatternPointNumber) {
        JourneyPatternPointOnLineDto journeyPatternPointOnLineDto = new JourneyPatternPointOnLineDto();
        journeyPatternPointOnLineDto.setLineNumber(lineNumber);
        journeyPatternPointOnLineDto.setJourneyPatternPointNumber(journeyPatternPointNumber);
        return journeyPatternPointOnLineDto;
    }

    private StopPointDto createStopPointDto(Integer stopNumber, String stopName) {
        StopPointDto stopPointDto = new StopPointDto();
        stopPointDto.setStopPointName(stopName);
        stopPointDto.setStopPointNumber(stopNumber);
        return stopPointDto;
    }
}