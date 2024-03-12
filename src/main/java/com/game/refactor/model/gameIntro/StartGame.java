package gameIntro;

import textLogic.TextTyping;

import java.util.Scanner;

public class StartGame {
    public static void promptToStartGame() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            String promptMessage = "So you want to become a Software Engineer right? (y/n): ";
            TextTyping.printWithDelays(promptMessage, true);
            input = scanner.nextLine().trim().toLowerCase();
        } while (!input.equals("y"));

        // If the user selects 'y', you can proceed with the rest of your game initialization or logic.
    }
}
