package com.game.refactor.model;

public class Intro {

    public static Object story;

    public static void main(String[] args){
        String simpleString = story();
        System.out.println(simpleString);
    }

    public static String story(){
        return "As the sun rises over the sprawling campus of Banana Inc., a new day dawns and a new journey begins. You find yourself standing at the gates of innovation, nerves tingling with anticipation as you take your first steps into the iconic headquarters.\n" +
                "\n" +
                "You walk through the sleek, glass-fronted lobby, and your heart races as you approach the reception desk, where a friendly face welcomes you with a warm smile. He hands you your ID and ushers you through the gates to the lifts.\n" +
                "\n" +
                "With determination in your eyes and ambition in your heart, you embark on your journey as an Apple apprentice. The road ahead may be challenging, but with perseverance and passion, you know that you have the opportunity to make a difference in the world of technology.\n" +
                "\n" +
                "Welcome to Banana Inc., Your adventure starts now...";

    }



    public static String lifts(){
        return "You're standing by a set of very confusing lifts. Do you choose to follow A) the tired person to your right, or B) the friendly person to your left?\n";
    }

}
