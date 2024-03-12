import gameIntro.IntroText;
import gameIntro.StartGame;
import gameLevels.IntroductionLevel;
import textLogic.LoadingDots;

public class Main {
    public static void main(String[] args) {
        try {
            IntroText.displayGameName();
            IntroText.displayAuthorName();
            System.out.println();
            LoadingDots.printLoadingDots(6);
            StartGame.promptToStartGame();
            System.out.println();
            IntroductionLevel.start();
        } catch (InterruptedException e) {
            System.err.println("An error occurred while running the game: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
