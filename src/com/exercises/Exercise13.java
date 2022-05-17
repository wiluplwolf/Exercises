package com.exercises;

import java.util.Scanner;

public class Exercise13 {
    private static final double width = 5.5;
    private static final double height = 8.5;

    public void exercise() {
        System.out.println("Area = " + (width*height));
        System.out.println("Perimeter = " + 2*(width+height));

        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease input width: ");
        double uWidth = sc.nextDouble();
        System.out.print("Please input height: ");
        double uHeight = sc.nextDouble();

        System.out.println("Area = " + (uWidth*uHeight));
        System.out.println("Perimeter = " + 2*(uWidth+uHeight));
    }
}
