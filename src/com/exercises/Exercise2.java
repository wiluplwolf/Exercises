package com.exercises;

import java.util.Scanner;

//Sum of two numbers
public class Exercise2 {
    public void exercise() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type first number: ");
        int a = input.nextInt();
        System.out.print("Please type second number: ");
        int b = input.nextInt();
        //System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " + " + b + " = " + sum(a,b));
    }

    private int sum(int a , int b){
        return (a+b);
    }
}
