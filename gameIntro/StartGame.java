package gameIntro;

import textLogic.TextTyping;

import java.util.Scanner;

public class StartGame {
    public static boolean promptToStartGame() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String promptMessage = "Do you want to start this epic adventure? (y/n): ";
        TextTyping.printWithDelays(promptMessage, true);
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
}