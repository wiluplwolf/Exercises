package com.exercises;

import java.util.Scanner;

//Area and perimeter of circle
public class Exercise10 {
    private static final double radius = 7.5;

    public void exercise() {

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Radius = 7,5");
        System.out.println("Area of circle = " + area);
        System.out.println("Perimeter of circle = " + perimeter);

        Scanner sc = new Scanner(System.in);
        System.out.print("\n" + "Please input radius: ");
        double uRadius = sc.nextDouble();
        System.out.println("Area = " + (Math.PI*uRadius*uRadius));
        System.out.println("Perimeter = " + (2*Math.PI*uRadius));
    }
}
