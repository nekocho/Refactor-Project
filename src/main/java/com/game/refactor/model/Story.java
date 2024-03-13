package com.game.refactor.model;

public class Story {

    public static Object story;

    public static void main(String[] args){
        String simpleString = story();
        System.out.println(simpleString);
    }

    public static String story(){
        return "test";
    }

}
