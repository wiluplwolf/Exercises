package com.exercises;

import java.util.Scanner;

// Comparing of two numbers
public class Exercise20 {
    public void exercise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();

        if(a != b) {
            System.out.println(a + " != " + b);
        }
        if(a == b){
            System.out.println(a + " = " + b);
        }
        if(a > b){
            System.out.println(a + " > " + b);
        }
        if(a < b){
            System.out.println(a + " < " + b);
        }
        if(a <= b){
            System.out.println(a + " <= " + b);
        }
        if(a >= b){
            System.out.println(a + " >= " + b);
        }

    }
}
