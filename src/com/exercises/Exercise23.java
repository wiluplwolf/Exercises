package com.exercises;

import java.util.Scanner;

//Area of n-side polygon
public class Exercise23 {
    public void exercise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the n-side of the polygon: ");
        double nSide = sc.nextDouble();
        System.out.print("Input the length of a side of the polygon: ");
        double side = sc.nextDouble();
        System.out.println("The area of the polygon is: " + polygonArea(nSide,side));
    }
    static double polygonArea(double n, double s){
        return ((n*Math.pow(s,2))/(4*Math.tan(Math.PI/n)));
    }
}
