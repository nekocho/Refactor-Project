package textLogic;

public class LoadingDots {
    public static void printLoadingDots(int dots) throws InterruptedException {
        String loading = ".".repeat(dots);
        TextTyping.printWithDelays(loading, true);
        System.out.println(); // Print a newline after the loading dots
    }
}
