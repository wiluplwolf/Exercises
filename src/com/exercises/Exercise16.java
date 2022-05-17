package com.exercises;

public class Exercise16 {
    public void exercise() {
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
        System.out.println();

        String[] array = new String[5];
        array[0] = " +\"\"\"\"\"+";
        array[1] = "[| o o |]";
        array[2] = " |  ^  |";
        array[3] = " | '-' |";
        array[4] = " +-----+";

        for (String i : array ) {
            System.out.println(i);
        }
    }
}
