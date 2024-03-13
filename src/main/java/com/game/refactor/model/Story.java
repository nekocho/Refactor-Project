package com.game.refactor.model;

public class Story {

    public static Object story;

    public static void main(String[] args){
        String simpleString = story();
        System.out.println(simpleString);
    }

    public static String story(){
        return "As the sun rises over the sprawling campus of Banana Inc., a new day dawns and a new journey begins. You find yourself standing at the gates of innovation, nerves tingling with anticipation as you take your first steps into the iconic headquarters.\n" +
                "\n" +
                "You walk through the sleek, glass-fronted lobby, and your heart races as you approach the reception desk, where a friendly face welcomes you with a warm smile. He introduces himself as Professor Liam and asks your name.";
    }

}
