package com.exercises;

//Create and display three-digit number using 1, 2, 3, 4 and how many are.
public class Exercise6 {
    public void exercise() {
        int x = 0;
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != k && i != j && k != j) {
                        x++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total " + x);
    }
}
