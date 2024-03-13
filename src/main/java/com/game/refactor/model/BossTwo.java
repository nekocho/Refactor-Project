package com.game.refactor.model;

public class BossTwo {
    public static void main(String[] args){
        String simpleString = text();
        System.out.println(simpleString);
    }

    public static String text(){
        return "Well done, that's correct!\n" +
                "\n" +
                "Which AWS service is used for scalable computing capacity in the cloud?\n" +
                "\n" +
                "A) Amazon S3\n" +
                "B) Amazon EC2\n" +
                "C) Amazon RDS\n" +
                "D) Amazon Lambda\n" +
                "\n" +
                "Choose the correct answer.";

    }
}