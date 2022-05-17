package com.data;

import java.util.Scanner;

//Convert minutes to hours, days and years
public class Data3 {
    public static void data() {
        System.out.print("Please input the number of minutes: ");
        Scanner sc = new Scanner(System.in);
        double min = sc.nextDouble();
        double minutesInYear = 60 * 24 * 365;
        long years = (long)(min/minutesInYear);
        long hours = (long)min/60;
        double days = (min/60)/24;

        System.out.println("It is ~: " + hours + " hours");
        System.out.printf("It is ~: %.2f days\n", days);
        System.out.printf("It is ~: %d years\n", years);
    }
}
