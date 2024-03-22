package com.game.refactor.model;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class Story {

    // Access set up mainText value
    private String mainText;

    // Display choices as a list
    private List<String> choices;

    private String secretButton;

    private String imagePath;

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

    public void setSecretButton(String secretButton){ this.secretButton = secretButton;}

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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

    public String getSecretButton() { return secretButton; }

    public String getImagePath() {
        return imagePath;
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
            case "Enter Lift A": // Lift Option A
                personA();
                break;
            case "Enter Lift B": // Lift Option B
                personB();
                break;
            case "Enter Lift C": // Lift Option C
                personC();
                break;
            case "Order Sushi": // Sushi Death
                gameOverSushi();
                break;
            case "Order Pizza": // Sushi Death
                pizza();
                break;
            case "Enter Lift D": // Lift Option D
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

            case "Look at View":
                lookAtView();
                break;
            case "Have Picnic":
                havePicnic();
                break;

            case "See Professor Liam", "Next": // Final Boss
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
            case "1974", "1977", "1979":
                secretGameOver();
                break;
            case "1976":
                keys();
                break;
            case "Start Again":
                // Handle any necessary tasks before redirecting
                return "redirect:/"; // Special return value indicating a redirect
            case "Hidden Button":
                secretButton();

        }
        return nextPosition;
    }

    public void intro(){
        setImagePath("banana-inc-logo.png");

        setMainText("As the sun rises over the sprawling campus of Banana Inc., a new day dawns and a new journey begins. You find yourself standing at the gates of innovation, nerves tingling with anticipation as you take your first steps into the iconic headquarters.\n\nYou walk through the sleek, glass-fronted lobby, and your heart races as you approach the reception desk, where a friendly face welcomes you with a warm smile.\n\nMAC: Welcome to Banana Inc.! We'll have you doing presentations in no time!\n\nMAC hands you your I.D. and ushers you through the gates to the lifts.\n\nWelcome to Banana Inc. Your adventure starts now...");

        setChoices(Arrays.asList("Start Your Adventure"));
        setSecretButton("Hidden Button");
    }

    public void lifts(){
        setImagePath("lifts.png");
        setMainText("You're standing by a set of very confusing lifts. You notice a variety of other people entering each lift, with no idea where to go, which person do you follow? \n\nA) Someone is discussing an EC2 instance on the phone\nB) A person is dressed in full running gear\nC) Someone seems to be browsing a food menu on their phone\nD) Another person is wearing headphones and appears excited for the day");
        setChoices(Arrays.asList("Enter Lift A", "Enter Lift B", "Enter Lift C", "Enter Lift D" ));
    }

    public void personA(){
        setImagePath(null);
        setMainText("Sabirah: Excuse me, are you the new apprentice?\n\nProfessor Liam asked me to keep an eye out for you. He's been expecting you.\n\nProfessor Liam is quite influential around here. You're in for a treat.");
        setChoices(Arrays.asList("See Professor Liam"));
    }

    public void personB(){
        setImagePath("game-over-skull-and-crossbones.png");
        setMainText("Matt: Hey there! You heading down to the bike sheds, too? Follow me!\n\nYou get into a conversation with Matt in the lifts and he regales you with stories of his marathon training. You die of boredom.\n\n\nGAME OVER.");
        setChoices(Arrays.asList("Restart Game"));
    }

    public void personC(){
        setImagePath(null);
        setMainText("Yusur: Hey, I am feeling real hungry, do you know what you're having for lunch? The pizza is really good, but apparently there are rumors of some discounted sushi.\n\nWhat will you order?\n\nA) Order pizza\nB) Order sushi");
        setChoices(Arrays.asList("Order Pizza", "Order Sushi"));
    }

    public void pizza(){
        setImagePath(null);
        setMainText("While waiting for your pizza you meet Mohamed who tells you he has been networking all morning. One of the people he met was Professor Liam, kind of a big deal. He recommends that you meet him as well.");
        setChoices(Arrays.asList("See Professor Liam"));
    }

    public void personD(){
        setImagePath(null);
        setMainText("Zoe: Hey! You look new around here. Let me show you some of the best spots in the building!\n\nWhere would you like to go?\n\nA) Sit on couches\nB) Go outside");
        setChoices(Arrays.asList("Sit on Couches", "Go Outside"));
    }
    public void couches(){
        setImagePath(null);
        setMainText("As you settle onto the couch, you find yourself next to Callum, whose hair seems to shift between hues of pink and blonde with remarkable speed. He immediately turns to you and inquires, 'Are you a Star Wars fan? Quick, tell me, what's the color of Luke Skywalker's lightsaber in Return of the Jedi?'");
        setChoices(Arrays.asList("Green", "Blue"));
    }

    public void lightsaberGreen(){
        setImagePath(null);
        setMainText("Callum: That's the correct answer, I like you. I'd like to introduce you to another nerd, his name is Professor Liam.");
        setChoices(Arrays.asList("See Professor Liam"));
    }
    public void lightsaberBlue(){
        setImagePath("game-over-skull-and-crossbones.png");
        setMainText("Callum: Wrong, call yourself a nerd? Go home.\n\nGAME OVER.");
        setChoices(Arrays.asList("Restart Game"));
    }
    public void outside(){
        setImagePath(null);
        setMainText("You walk outside and come across another Banana apprentice who introduces herself as Jocelyn.\n\nWith a broad smile, Jocelyn mentions that she's been meaning to check out the view across the Thames and asks if you'd like to take a look at the view with her. Do you:\n\nA) Check out the view with Jocelyn\nB) Politely decline as you're starting to feel a bit peckish and your Boots Meal Deal picnic is calling your name");
        setChoices(Arrays.asList("Look at View", "Have Picnic"));
    }

    public void lookAtView(){
        setImagePath("game-over-skull-and-crossbones.png");
        setMainText("As you gaze across the breathtaking landscapes to the Knightsgate office, your moment of awe is abruptly interrupted as a flock of birds decides to drop their digested lunch over you. Feeling less than lucky, you decide to go home.\n\nGAME OVER.");
        setChoices(Arrays.asList("Restart Game"));
    }
    public void havePicnic(){
        setImagePath(null);
        setMainText("You head over to the grassy area and sit down to eat your picnic. Just as you've finished laying out your Boots Meal Deal, someone rushes over to you.\n\nIason: Oh! There you are! We've been looking for you, Professor Liam has been expecting you. Come with me!");
        setChoices(Arrays.asList("See Professor Liam"));
    }

    public void bossOne(){
        setImagePath(null);
        setMainText("Professor Liam: Ah, there you are! Alreet pet. Been waiting for ya.\n\nNow, let's quiz you on Engineering to see if you're cut out for this Apprenticeship.\n\nWhich of the following is NOT a fundamental data type in Python?\n\nA) Integer\nB) String\nC) Boolean\nD) Array\n\nChoose the correct answer.");
        setChoices(Arrays.asList("A) Integer", "B) String", "C) Boolean", "D) Array"));
    }

    public void bossTwo(){
        setImagePath(null);
        setMainText("Well done, that's correct!\n\nLet's move onto your next question shall we?\n\nWhich Amazon Web Service is used for scalable computing capacity in the cloud?\n\nA) Amazon S3\nB) Amazon EC2\nC) Amazon RDS\nD) Amazon Lambda\n\nChoose the correct answer.");
        setChoices(Arrays.asList("A) Amazon S3", "B) Amazon EC2", "C) Amazon RDS", "D) Amazon Lambda"));
    }

    public void gameOverLiam(){
        setImagePath("game-over-skull-and-crossbones.png");
        setMainText("You look up at Professor Liam; he doesn't look mad, just disappointed. By this, you guess that wasn't the right answer.\n\nYou leave with your shoulders slumped and your head hung low, trying to hide the tears.\n\nGAME OVER.");
        setChoices(Arrays.asList("Restart Game"));
    }

    public void gameOverSushi(){
        setImagePath("game-over-skull-and-crossbones.png");
        setMainText("Oh No!\n\nThe discounted sushi was a terrible idea.\n\nYou spend the rest of the day in the bathroom.\n\nGAME OVER.");
        setChoices(Arrays.asList("Restart Game"));
    }

    public void win(){
        setImagePath("winners-medal.png");
        setMainText("That's correct! You seem to have what it takes to be an apprentice here at Banana Inc.! Welcome to your first day...");
        setChoices(Arrays.asList("Start Again"));
    }

    public void secretButton(){
        setImagePath(null);
        setMainText("You walk through a tiny, imperceptible hole in the brickwork into a large office, where a white-haired man appears to be pensively gazing out of a window. He turns to you, surprised, as you walk in. Unexpectedly, he asks you: 'What year was Banana Inc. founded?'");
        setChoices(Arrays.asList("1974","1976", "1977", "1979"));
    }

    public void secretGameOver(){
        setImagePath("game-over-skull-and-crossbones.png");
        setMainText("You don't even know the simplest of things about this company. You should be ashamed of yourself.\n\nYou leave with your shoulders slumped and your head hung low, trying to hide the tears.\n\nGAME OVER.");
        setChoices(Arrays.asList("Start Again"));
    }

    public void keys(){
        setImagePath("keys-to-banana-inc.png");
        setMainText("CONGRATULATIONS, YOU FOUND THE SECRET BUTTON AND PASSED THE TEST. Kim Took hands you the keys to Banana Inc. and the deeds to his name. YOU NOW OWN THE WORLD.");
        setChoices(Arrays.asList("Start Again"));
    }
}
