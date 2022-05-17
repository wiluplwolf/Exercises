package com.exercises;

import java.util.Scanner;

//Change char to ASCII value
public class Exercise7 {
    public void exercise(){
        System.out.print("Please input character to change in ASCII: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int i = (int)ch;
        System.out.println("The ASCII value for " + ch + " is " + i);
    }
}
