package com.exercises;

import java.util.Scanner;

//Divide two numbers
public class Exercise3 {
    public void exercise() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type first number: ");
        int a = input.nextInt();
        System.out.print("Please type second number: ");
        int b = input.nextInt();
        if(a == 0 || b == 0){
            System.out.println("One of number is zero!");
        }else{
            System.out.println("Divide: " + (a/b));
        }
    }
}
