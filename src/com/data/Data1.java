package com.data;

import java.util.Scanner;

/* Celsius to Fahrenheit and Fahrenheit to Celsius
    1C = 33.8F
    1F = -17.2222222C
 */
public class Data1 {
    public static void data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input temperature in Celsius: ");
        double celsius1 = sc.nextDouble();
        double fahrenheit1 = (9 * celsius1 + (32 * 5)) / 5;
        System.out.println("Your temperature in Fahrenheit: " + fahrenheit1);
        System.out.print("Input temperature in Fahrenheit: ");
        double fahrenheit2 = sc.nextDouble();
        double celsius2 = (5.0 * (fahrenheit2 - 32.0)) / 9.0;
        System.out.println("Your temperature in Celsius: " + celsius2);
    }
}
