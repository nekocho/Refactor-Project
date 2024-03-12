package textLogic;

public class LinePrinter {
    // Method to print a line with a slight delay
    public static void printLine(String line) throws InterruptedException {
        TextTyping.printWithDelays(line, false); // Print the line without delay
        Thread.sleep(1000); // Introduce a delay after printing the line
    }
}
