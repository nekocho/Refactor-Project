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
    public void selectPosition(String nextPosition) {
        switch (nextPosition) {
            case "intro":
                intro();
                break;
           // case "Start Your Adventure":

        }
    }

    public void intro(){
        setMainText("As the sun rises over the sprawling campus of Banana Inc., A new day dawns and a new journey begins. You find yourself standing at the gates of innovation, nerves tingling with anticipation as you take your first steps into the iconic headquarters.\nYou walk through the sleek, glass-fronted lobby, and your heart races as you approach the reception desk, where a friendly face welcomes you with a warm smile. He hands you your ID and ushers you through the gates to the lifts.\n\nWith determination in your eyes and ambition in your heart, you embark on your journey as an Banana apprentice. The road ahead may be challenging, but with perseverance and passion, you know that you have the opportunity to make a difference in the world of technology.\n\nWelcome to Banana Inc., Your adventure starts now...");
        setChoices(Arrays.asList("Start Your Adventure"));
    }

}
