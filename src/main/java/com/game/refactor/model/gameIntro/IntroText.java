package com.game.refactor.model.gameIntro;

import com.game.refactor.model.textLogic.TextTyping;

import java.util.ArrayList;
import java.util.List;


public class IntroText {
    public static List<String> displayGameName() {
//        StringBuilder stringBuilder = new StringBuilder();
//        // Print each line of the game name with no delay between lines
//        stringBuilder.append("██████  ███████ ███████  █████   ██████ ████████  ██████  ██████ \n");
//        stringBuilder.append("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██\n");
//        stringBuilder.append("██████  █████   █████   ███████ ██         ██    ██    ██ ██████  \n");
//        stringBuilder.append("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██ \n");
//        stringBuilder.append("██   ██ ███████ ██      ██   ██  ██████    ██     ██████  ██   ██");
//        return stringBuilder.toString();
        List<String> strings = new ArrayList<>();
        strings.add("██████  ███████ ███████  █████   ██████ ████████  ██████  ██████ ");
        strings.add("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██");
        return strings;
    }

    public static void main(String[] args) {
        // Retrieve the list of strings
        List<String> multipleStrings = displayGameName();

        // Print each string on a new line
        for (String string : multipleStrings) {
            System.out.println(string);
        }
    }

    public static String displayAuthorName() throws InterruptedException {
        return "A game by, Callum, Matt, Sabirah & Zoe. Enjoy!";
    }

}
