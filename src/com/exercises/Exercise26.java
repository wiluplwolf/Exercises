package com.exercises;

import java.util.Scanner;

// Checking how many letters, spaces, numbers and special character are in string
public class Exercise26 {
    public void exercise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] ch = sc.nextLine().toCharArray();

        int letter = 0, space = 0, num = 0, other = 0;
        for(int i = 0; i < ch.length; i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else{
                other++;
            }
        }
        System.out.print("The string is : ");
        for (char c: ch) {
            System.out.print(c);
        }
        System.out.println("\n");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);

    }
}
