package com.game.refactor.model.gameIntro;

import com.game.refactor.model.gameIntro.IntroText;
import com.game.refactor.model.gameIntro.StartGame;
import com.game.refactor.model.gameLevels.introLevel;
import com.game.refactor.model.textLogic.LoadingDots;

public class Main {
    public static void main(String[] args) {
        try {
            IntroText.displayGameName();
            IntroText.displayAuthorName();
            LoadingDots.printLoadingDots(6);
            StartGame.promptToStartGame();
            LoadingDots.printLoadingDots(6);
            introLevel.start();

        } catch (InterruptedException e) {
            System.err.println("An error occurred while running the game: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
