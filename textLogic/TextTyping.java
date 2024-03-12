package textLogic;

import java.util.concurrent.TimeUnit;

public class TextTyping {
    // Method bellow will print the text out with the required delay.
    // Added boolean appleDelay to function so we can override this when needed.
    public static void printWithDelays(String message, boolean applyDelay) throws InterruptedException {
        if (applyDelay) {
            // This for loop iterates over each char in the string.
            for (char c : message.toCharArray()) {
                System.out.print(c); // This then prints each char to the console.
                // If statement to check punctuation.
                if (c == '.' || c == ',' || c == '?' || c == '&') {
                    TimeUnit.MILLISECONDS.sleep(500);
                  // Else prints at the speed bellow
                } else {
                    TimeUnit.MILLISECONDS.sleep(50);
                }
            }
            System.out.println();
        } else {
            System.out.println(message);
        }
    }
}