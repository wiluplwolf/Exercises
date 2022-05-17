package com.exercises;

import java.util.Scanner;

//Bubble sort - input 10 numbers and sort them
public class Exercise9 {
    public void exercise() {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[10];
        int i = 0;
        while(i<10){
            System.out.print("Input number " + (i+1) + ": ");
            tab[i] = sc.nextInt();
            i++;
        }
        for (int k : tab) {
            System.out.print(k + " ");
        }
        System.out.println("\n");
        bubbleSort(tab);
        for (int k : tab) {
            System.out.print(k + " ");
        }
    }

    void  bubbleSort(int[] t){
        for (int i = 0; i<t.length; i++){
            for(int j = 1; j<t.length; j++){
                if(t[j]<t[j-1]){
                    int x = t[j-1];
                    t[j-1]=t[j];
                    t[j] = x;
                }
            }
        }
    }

}
