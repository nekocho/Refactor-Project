package gameIntro;

import textLogic.introTextPrinter;
import textLogic.TextTyping;

public class IntroText {
    public static void displayGameName() throws InterruptedException {
        // Print each line of the game name with no delay between lines
        introTextPrinter.printLine("██████  ███████ ███████  █████   ██████ ████████  ██████  ██████ ");
        introTextPrinter.printLine("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██");
        introTextPrinter.printLine("██████  █████   █████   ███████ ██         ██    ██    ██ ██████  ");
        introTextPrinter.printLine("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██ ");
        introTextPrinter.printLine("██   ██ ███████ ██      ██   ██  ██████    ██     ██████  ██   ██");
    }

    public static void displayAuthorName() throws InterruptedException {
        TextTyping.printWithDelays("A game by, Callum, Matt, Sabirah & Zoe. Enjoy!", true);
    }

}
