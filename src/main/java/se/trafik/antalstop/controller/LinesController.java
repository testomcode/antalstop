package se.trafik.antalstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.trafik.antalstop.service.LinesService;

@Controller
public class LinesController {

    private static final int NUMBER_OF_LINES = 10;

    @Autowired
    private LinesService linesService;

    @GetMapping("/index")
    public String showLinesWithMostStops(Model model) {
        model.addAttribute("lines", linesService.getLinesWithMostStops(NUMBER_OF_LINES));
        return "index";
    }
}
