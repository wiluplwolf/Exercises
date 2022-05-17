package com.exercises;

import java.util.Scanner;

// Print the addition, subtraction, multiplication, division and the rest of division of two numbers.
public class Exercise5 {
    public void exercise() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type first number: ");
        int a = input.nextInt();
        System.out.print("Please type second number: ");
        int b = input.nextInt();
        if(a == 0 || b == 0){
            System.out.println(a + " + " + b + " = " + (a+b));
            System.out.println(a + " - " + b + " = " + (a-b));
        }else{
            System.out.println(a + " + " + b + " = " + (a+b));
            System.out.println(a + " - " + b + " = " + (a-b));
            System.out.println(a + " / " + b + " = " + (a/b));
            System.out.println(a + " * " + b + " = " + (a*b));
            System.out.println(a + " % " + b + " = " + (a%b));
        }
    }
}
