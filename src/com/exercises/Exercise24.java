package com.exercises;

import java.util.Scanner;

//Distance between two point on earth
public class Exercise24 {
    public static final double radius = 6371.01;
    public void exercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius of the earth r = 6371.01 Kilometers");
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double long1 = sc.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double long2 = sc.nextDouble();

        System.out.println("The distance between those points is: " + distance(lat1, long1, lat2, long2) + " km");
    }
    static double distance(double lat1, double long1, double lat2, double long2){
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        long1 = Math.toRadians(long1);
        long2 = Math.toRadians(long2);
        return (radius * Math.acos((Math.sin(lat1) * Math.sin(lat2)) + ((Math.cos(lat1) * Math.cos(lat2)) * Math.cos(long1-long2))));
    }
}
