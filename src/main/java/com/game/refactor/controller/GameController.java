package com.game.refactor.controller;

import com.nekocho.adventuregame.model.Story;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @GetMapping("/start")
    public String startGame(Model model) {
        // Logic to start the game and initialize model attributes
        // For example:
        // Text for story:
        model.addAttribute("gameText", Story.story);
        // option buttons:
        model.addAttribute("choice1Label", "Choice 1");
        model.addAttribute("choice1Value", "c1");

        model.addAttribute("choice2Label", "Choice 2");
        model.addAttribute("choice2Value", "c2");

        model.addAttribute("choice3Label", "Choice 3");
        model.addAttribute("choice3Value", "c3");

        model.addAttribute("choice4Label", "Choice 4");
        model.addAttribute("choice4Value", "c4");
        return "game"; // This will render game.html
    }

    @PostMapping("/choice")
    public String handleChoice(@RequestParam("choice") String choice, Model model) {
        // Logic to handle the player's choice
        // Update game state and player stats
        // Return the updated game page template
        return "game"; // This will render game.html
    }
}
