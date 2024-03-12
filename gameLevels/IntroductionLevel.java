package gameLevels;

import textLogic.TextTyping;

import java.util.Scanner;

public class IntroductionLevel {
    public static void start() throws InterruptedException {
        // Introductory text with delays
        String introText =
                "As the sun rises over the sprawling campus of Banana Inc, a new day dawns and a new journey begins. You find yourself standing at the gates of innovation, nerves tingling with anticipation as you take your first steps into the iconic headquarters."
                + "\n"
                + "You walk through the sleek, glass-fronted lobby, and your heart races as you approach the reception desk, "
                + "where a friendly face welcomes you with a warm smile. He introduces himself as Professor Liam and asks your name.";
        TextTyping.printWithDelays(introText, true);

        // Ask user what their name is?
        String promptMessage = "So what is your name?: ";
        TextTyping.printWithDelays(promptMessage, true);

        // This takes the user input.
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        // Greeting with delays
        String greetingText = "Hello, " + playerName + "! Let's start the game...";
        TextTyping.printWithDelays(greetingText, true);
    }
}
