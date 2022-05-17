package com.exercises;

import java.util.Scanner;

// Reverse sentence
public class Exercise25 {
    public void exercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        char[] letters = sc.nextLine().toCharArray();
        for (int i = letters.length-1; i >= 0; i--){
            System.out.print(letters[i]);
        }
        System.out.println("\n");
    }
}
