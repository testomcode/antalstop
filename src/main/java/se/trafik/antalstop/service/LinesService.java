package se.trafik.antalstop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.trafik.antalstop.Line;
import se.trafik.antalstop.dto.JourneyPatternPointOnLineDto;
import se.trafik.antalstop.dto.StopPointDto;
import se.trafik.antalstop.repository.DataRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class LinesService {

    @Autowired
    DataRepository dataRepository;

    public List<Line> getLinesWithMostStops(int numberOfLines) {

        Map<Integer, List<Integer>> lineNumberStopNumbersMap = dataRepository.getJourneyPatternPointOnLineModelDto().getResponseData().getResult().stream()
                .collect(Collectors.groupingBy(JourneyPatternPointOnLineDto::getLineNumber,
                        Collectors.mapping(journeyPatternPointOnLineDto -> journeyPatternPointOnLineDto.getJourneyPatternPointNumber(), Collectors.toList())));

        Map<Integer, String> stopNumberStopNameMap = dataRepository.getStopPointModelDto().getResponseData().getResult().stream().collect(Collectors.toMap(
                StopPointDto::getStopPointNumber, StopPointDto::getStopPointName));

        List<Line> lines = new ArrayList<>();

        for (Map.Entry<Integer, List<Integer>> entry : lineNumberStopNumbersMap.entrySet()) {
            List<String> stopNames = new ArrayList<>();
            for (Integer integer : entry.getValue()) {
                stopNames.add(stopNumberStopNameMap.get(integer));
            }
            lines.add(new Line(entry.getKey(), stopNames));
        }

        lines.sort(Comparator.reverseOrder());

        return lines.subList(0, numberOfLines < lines.size() ? numberOfLines : lines.size());
    }
}
