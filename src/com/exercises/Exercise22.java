package com.exercises;

import java.util.Scanner;

// Area of haxagon
public class Exercise22 {
    public void exercise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the length of a side of the haxagon: ");
        double side = sc.nextDouble();
        System.out.println("The area of the haxagon is: " + area(side));
    }
    static double area(double s){
        return ((6*Math.pow(s,2))/(4*Math.tan(Math.PI/6)));
    }
}
