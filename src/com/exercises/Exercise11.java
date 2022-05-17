package com.exercises;

import java.util.Scanner;

public class Exercise11 {
    public void exercise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the number you want to average: ");
        int n = sc.nextInt();
        double x = 1;
        double num = 0;
        while(x<=n){
            System.out.print("Input number ("+(int)x+"): ");
            num += sc.nextDouble();
            x++;
        }
        double average = num / n;

        System.out.println("Average = " + average);
    }
}
