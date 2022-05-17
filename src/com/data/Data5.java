package com.data;

import java.util.Scanner;

//BMI calculator BMI = weight / height^2 [kg/m^2] | 1m = 100cm
public class Data5 {
    public static void data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input person's weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Input person's height in cm: ");
        double height = (sc.nextDouble())/100;

        System.out.printf("BMI: %.2f", bmiCalc(weight,height));

    }
    static double bmiCalc(double weight, double height) {
        return (weight/Math.pow(height,2));
    }
}
