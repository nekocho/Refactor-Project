package com.game.refactor.model;

public class BossOne {
    public static void main(String[] args){
        String simpleString = text();
        System.out.println(simpleString);
    }

    public static String text(){
        return "Professor Liam: Ah, there you are! Welcome, pet. Been waiting for ya.\n" +
                "\n" +
                "Now, let's quiz you on Engineering to see if you're cut out for this Apprenticeship." +
                "\n" +
                "Which of the following is NOT a fundamental data type in Python?\n" +
                "\n" +
                "A) Integer\n" +
                "B) String\n" +
                "C) Boolean\n" +
                "D) Array\n" +
                "\n" +
                "Choose the correct answer.";

    }
}