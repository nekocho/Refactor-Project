package com.game.refactor.controller;


import com.game.refactor.model.BossOne;
import com.game.refactor.model.Intro;
import com.game.refactor.model.Matt;
import com.game.refactor.model.Sabirah;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    private boolean nextClicked = false;

    @GetMapping("/start")
    public String startGame(Model model) {
        // Add default text to model
        model.addAttribute("gameText", Intro.story());
        // Return the name of the Thymeleaf template
        return "intro";
    }

    @GetMapping("/lifts")
    public String next(Model model) {
            model.addAttribute("liftsText", Intro.lifts());
        return "lifts";
    }

    @GetMapping("/bikeSheds")
    public String sheds(Model model) {
        model.addAttribute("shedsText", Matt.text());
        return "matt";
    }

    @GetMapping("/sabirah")
    public String sabirah(Model model) {
        model.addAttribute("sabirahText", Sabirah.text());
        return "sabirah";
    }
    @GetMapping("/bossOne")
    public String bossOne(Model model) {
        model.addAttribute("bossOneText", BossOne.text());
        return "bossOne";
    }

}

//    @GetMapping("/start")
//    public String startGame(Model model) {
//        // Logic to start the game and initialize model attributes
//        // For example:
//        // Text for story:
//        model.addAttribute("gameText", "Story goes here.");
//        // option buttons:
//        model.addAttribute("choice1Label", "Choice 1");
//        model.addAttribute("choice1Value", "c1");
//
//        model.addAttribute("choice2Label", "Choice 2");
//        model.addAttribute("choice2Value", "c2");
//
//        return "game"; // This will render intro.html
//    }


