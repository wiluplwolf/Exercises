package com.exercises;

import java.util.Scanner;

public class Exercise15 {
    public void exercise() {
        int x,y,z;
        x = 15;
        y = 25;
        System.out.println("Before swap: x=" +x+" y="+y);
        z=x;
        x=y;
        y=z;
        System.out.println("After swap: x=" +x+" y="+y);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease input the first number: ");
        x = sc.nextInt();
        System.out.print("\nPlease input the second number: ");
        y = sc.nextInt();
        System.out.println("Before swap: x=" +x+" y="+y);
        z=x;
        x=y;
        y=z;
        System.out.println("After swap: x=" +x+" y="+y);
    }
}
