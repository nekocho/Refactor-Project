package gameIntro;

import textLogic.LinePrinter;
import textLogic.TextTyping;

public class IntroText {
    public static void displayGameName() throws InterruptedException {
        // Print each line of the game name with no delay between lines
        LinePrinter.printLine("██████  ███████ ███████  █████   ██████ ████████  ██████  ██████ ");
        LinePrinter.printLine("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██");
        LinePrinter.printLine("██████  █████   █████   ███████ ██         ██    ██    ██ ██████  ");
        LinePrinter.printLine("██   ██ ██      ██      ██   ██ ██         ██    ██    ██ ██   ██ ");
        LinePrinter.printLine("██   ██ ███████ ██      ██   ██  ██████    ██     ██████  ██   ██");
    }

    public static void displayAuthorName() throws InterruptedException {
        TextTyping.printWithDelays("A game by, Callum, Matt, Sabirah & Zoe", true);
    }

}
