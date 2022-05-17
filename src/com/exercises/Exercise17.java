package com.exercises;

//Addition of two binaries
public class Exercise17 {
    public void exercise() {
        long binary1, binary2;
        binary1 = 10101;
        binary2 = 11100;
        int i = 0, remainder = 0;
        int[] sum = new int[20];

        while(binary1 != 0 || binary2 != 0){
            sum[i++]=(int)((binary1 % 2 + binary2 % 2 + remainder) % 2);
            remainder = (int)((binary1 % 2 + binary2 % 2 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if(remainder!=0){
            sum[i] = remainder;
        }

        while(i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println("\n");

    }
}
