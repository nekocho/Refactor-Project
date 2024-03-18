package com.game.refactor.model;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class Story {

    // Access set up mainText value
    private String mainText;

    // Display choices as a list
    private List<String> choices;

    //SETTERS

    // Construct the Story
    public Story() {
        this.choices = new ArrayList<>();
    }

    // Method to set the main text
    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    // Method to set choices
    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    // GETTERS

    // Method to get the main text
    public String getMainText(){
        return mainText;
    }

    // Method to get the current choices
    public List<String> getCurrentChoices(){
        return choices;
    }

    // Method to map choices to methods
    public String selectPosition(String nextPosition) {
        switch (nextPosition) {
            case "intro", "Restart Game": //Intro
                intro();
                break;
            case "Start Your Adventure": //Lift section
                lifts();
                break;
            case "A) The tired person": // Lift Option A
                personA();
                break;
            case "B) The friendly person": // Lift Option B
                personB();
                break;
            case "C) Yusur": // Lift Option C
                personC();
                break;
            case "Sushi": // Sushi Death
                gameOverSushi();
                break;
            case "Pizza": // Sushi Death
                pizza();
                break;
            case "D) Zoe": // Lift Option D
                personD();
                break;
            case "Sit on Couches": // Couches - takes you to Callum
                couches();
                break;
            case "Go Outside": // Outside - take you to Jocelyn
                outside();
                break;
            case "Green": // Lightsaber question - correct answer
                lightsaberGreen();
                break;
            case "Blue": // Lightsaber question - incorrect answer
                lightsaberBlue();
                break;
            case "See Professor Liam": // Final Boss
                bossOne();
                break;
            case "D) Array": // Question 1 Correct Answer
                bossTwo();
                break;
            case "A) Integer", "B) String", "C) Boolean", "A) Amazon S3", "C) Amazon RDS", "D) Amazon Lambda": // Incorrect Answers
                gameOverLiam();
                break;
            case "B) Amazon EC2": // Question 2 Correct Answer
                win();
                break;
            case "Start Again": // Start again
                // Handle any necessary tasks before redirecting
                return "redirect:/"; // Special return value indicating a redirect
        }
        return nextPosition;
    }

    public void intro(){
        setMainText("As the sun rises over the sprawling campus of Banana Inc., A new day dawns and a new journey begins. You find yourself standing at the gates of innovation, nerves tingling with anticipation as you take your first steps into the iconic headquarters.\n\nYou walk through the sleek, glass-fronted lobby, and your heart races as you approach the reception desk, where a friendly face welcomes you with a warm smile. He hands you your ID and ushers you through the gates to the lifts.\n\nWith determination in your eyes and ambition in your heart, you embark on your journey as an Banana apprentice. The road ahead may be challenging, but with perseverance and passion, you know that you have the opportunity to make a difference in the world of technology.\n\nWelcome to Banana Inc. Your adventure starts now...");
        setChoices(Arrays.asList("Start Your Adventure"));
    }

    public void lifts(){
        setMainText("You're standing by a set of very confusing lifts. Do you choose to follow: \n\nA) The tired person to your left? \nB) The friendly person to your right?");
        setChoices(Arrays.asList("A) The tired person", "B) The friendly person", "C) Yusur", "D) Zoe" ));
    }

    public void personA(){
        setMainText("Sabirah: Excuse me, are you the new apprentice?\n\nProfessor Liam asked me to keep an eye out for you. He's been expecting you.\n\nProfessor Liam is quite influential around here. You're in for a treat.");
        setChoices(Arrays.asList("See Professor Liam"));
    }

    public void personB(){
        setMainText("Matt: Hey there! You heading down to the bike sheds, too? Follow me!\n\nYou get into a conversation with Matt in the lifts and he regales you with stories of his marathon training. You die of boredom.\n\n\nGAME OVER");
        setChoices(Arrays.asList("Restart Game"));
    }

    public void personC(){
        setMainText("Yusur - Cafeteria with pizza or sushi");
        setChoices(Arrays.asList("Pizza", "Sushi"));
    }

    public void pizza(){
        setMainText("Mohamed - Networking; Takes you to Liam");
        setChoices(Arrays.asList("See Professor Liam"));
    }

    public void personD(){
        setMainText("Zoe - Welcome us into Lobby and show her favourite two spots - the couches and the roof garden. Which would you like to visit?");
        setChoices(Arrays.asList("Sit on Couches", "Go Outside"));
    }
    public void couches(){
        setMainText("Take a seat on the couch - Callum sits next to you and introduces himself. Star Wars question?");
        setChoices(Arrays.asList("Green", "Blue"));
    }
    public void outside(){
        setMainText("Jocelyn - Asks if you'd like to take a look at the view or sit on the grass");
        setChoices(Arrays.asList("View", "Grass"));
    }
    public void lightsaberGreen(){
        setMainText("Correct answer, i like you. I'll take to Liam");
        setChoices(Arrays.asList("See Professor Liam"));
    }
    public void lightsaberBlue(){
        setMainText("Wrong, call yourself a nerd? Go home.");
        setChoices(Arrays.asList("Restart Game"));
    }
    public void bossOne(){
        setMainText("Professor Liam: Ah, there you are! Alreet pet. Been waiting for ya.\n\nNow, let's quiz you on Engineering to see if you're cut out for this Apprenticeship.\n\nWhich of the following is NOT a fundamental data type in Python?\n\nA) Integer\nB) String\nC) Boolean\nD) Array\n\nChoose the correct answer.");
        setChoices(Arrays.asList("A) Integer", "B) String", "C) Boolean", "D) Array"));
    }

    public void bossTwo(){
        setMainText("Well done, that's correct!\n\nLet's move onto your next question shall we?\n\nWhich AWS service is used for scalable computing capacity in the cloud?\n\nA) Amazon S3\nB) Amazon EC2\nC) Amazon RDS\nD) Amazon Lambda\n\nChoose the correct answer.");
        setChoices(Arrays.asList("A) Amazon S3", "B) Amazon EC2", "C) Amazon RDS", "D) Amazon Lambda"));
    }

    public void gameOverLiam(){
        setMainText("You look up at Professor Liam; he doesn't look mad, just disappointed. By this I'm guessing that wasn't the right answer.\n\nYou leave with your shoulders slumped and your head hung low, trying to hide the tears.\n\nGAME OVER");
        setChoices(Arrays.asList("Restart Game"));
    }

    public void gameOverSushi(){
        setMainText("You poop your pants and throw up at the same time- bad sushi, go home.");
        setChoices(Arrays.asList("Restart Game"));
    }



    public void win(){
        setMainText("That's correct! You seem to have what it takes to be an apprentice here at Banana Inc! Welcome to your first day...");
        setChoices(Arrays.asList("Start Again"));
    }
}
