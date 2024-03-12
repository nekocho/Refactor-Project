package com.game.refactor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.game.refactor.model.gameIntro.IntroText;


@Controller
public class GameController {
    @GetMapping("/game")
    public String gamePage(Model model) throws InterruptedException {
        model.addAttribute("gameAuthor", IntroText.displayAuthorName());
        return "game";
    }
}

