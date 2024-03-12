package com.game.refactor.model.gameIntro;

import com.game.refactor.model.textLogic.TextTyping;

public class IntroText {
    public static String displayGameName() {
        StringBuilder stringBuilder = new StringBuilder();
        // Print each line of the game name with no delay between lines
        stringBuilder.append("██████  ███████ ███████  █████   ██████ ████████  ██████  ██████ ");
        stringBuilder.append("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██");
        stringBuilder.append("██████  █████   █████   ███████ ██         ██    ██    ██ ██████  ");
        stringBuilder.append("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██ ");
        stringBuilder.append("██   ██ ███████ ██      ██   ██  ██████    ██     ██████  ██   ██");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String gameName = displayGameName();
        System.out.println(gameName);
    }

    public static String displayAuthorName() throws InterruptedException {
        return "A game by, Callum, Matt, Sabirah & Zoe. Enjoy!";
    }

}
