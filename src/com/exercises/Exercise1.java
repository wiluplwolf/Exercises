package com.exercises;

import java.util.Scanner;

// Simple Hello with input full name from user
public class Exercise1 {
    public void exercise() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your first name: ");
        String fname = input.nextLine();
        System.out.println("Input your last name: ");
        String lname = input.nextLine();
        System.out.println("Hello " + fname + " " + lname);
    }
}
