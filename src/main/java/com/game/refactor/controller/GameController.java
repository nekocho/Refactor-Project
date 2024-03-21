package com.game.refactor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.game.refactor.model.Story;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    // Create the story
    private Story story = new Story();

    // Declare animationsEnabled as a class-level field
    private boolean animationsEnabled;

    @Autowired
    public GameController(Story story) {
        this.story = story;
    }

    @GetMapping("/start")
    public String handleStart(@RequestParam(name = "animationsEnabled", required = false) String animationsEnabled, Model model) {
        // Initialize the game and pass initial data to Thymeleaf
        story.selectPosition("intro"); // Start the story
        model.addAttribute("imagePath", story.getImagePath());
        model.addAttribute("mainTextArea", story.getMainText());
        model.addAttribute("choices", story.getCurrentChoices());
        model.addAttribute("secretButton", story.getSecretButton());

        this.animationsEnabled = "on".equals(animationsEnabled);

        if (this.animationsEnabled) {
            model.addAttribute("animationsEnabled", true);
        } else {
            model.addAttribute("animationsEnabled", false);
        }

        return "game";
    }


    @PostMapping("/choice")
    public String handleChoice(@RequestParam("choice") String choice, Model model) {
        // Handle user choice and update the story
        String nextPage = story.selectPosition(choice);
        if (nextPage.equals("redirect:/")) {
            return nextPage; // Redirect to start page (index.html)
        }
        // Update UI data based on story progression
        model.addAttribute("imagePath", story.getImagePath());
        model.addAttribute("mainTextArea", story.getMainText());
        model.addAttribute("choices", story.getCurrentChoices());

        // Retrieve the animation state and pass it to the view
        model.addAttribute("animationsEnabled", this.animationsEnabled);

        return "game"; // Display the game page
    }
}
