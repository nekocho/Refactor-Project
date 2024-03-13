package com.game.refactor.model;

public class Matt {
    public static void main(String[] args){
        String simpleString = text();
        System.out.println(simpleString);
    }

    public static String text(){
        return "Matt: Hey there! You heading down to the bike sheds, too? Follow me!\n" +
                "\n" +
                "You get into a conversation with Matt in the lifts and he regales you with stories of his marathon training. You die of boredom." +
                "\n" +
                "\n" +
                "GAME OVER";

    }
}
