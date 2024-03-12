import gameIntro.IntroText;
import gameIntro.StartGame;
import gameLevels.introLevel;
import textLogic.LoadingDots;

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
