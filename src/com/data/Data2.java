package com.data;

import java.util.Scanner;

//Convert inches to meters, centimeters
public class Data2 {
    public static void data() {
        System.out.print("Please input number in inches: ");
        Scanner sc = new Scanner(System.in);
        double inchValue = sc.nextDouble();
        double meterValue = inchValue * 0.0254;
        double centyValue = inchValue * 2.54;
        System.out.println(inchValue + " inch is " + meterValue + " meters");
        System.out.println(inchValue + " inch is " + centyValue + " cm");
    }
}
