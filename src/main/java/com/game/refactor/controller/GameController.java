package com.game.refactor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @GetMapping("/start")
    public String startGame(Model model) {
        // Initialize default text
        String defaultText = "Choose an option:";
        // Add default text to model
        model.addAttribute("displayText", defaultText);
        // Return the name of the Thymeleaf template
        return "game";
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
//        return "game"; // This will render game.html
//    }

    @PostMapping("/choice")
    public String handleChoice(@RequestParam("choice") String choice, Model model) {
        // Logic to handle the player's choice
        // Update game state and player stats
        // Return the updated game page template
        return "game"; // This will render game.html
    }
}
