package com.exercises;

import java.util.Scanner;

/*Sum of digits in provided number
 623 -> 6 + 2 + 3 = 11
 */
public class Exercise21 {
    public void exercise() {
        System.out.println("**** Sum of the digits of an integer ****");
        System.out.print("Input number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), sum = 0;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        System.out.println("Result: " + sum);
    }
}
