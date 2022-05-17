package com.exercises;

public class Exercise12 {
    public void exercise(){
        int target = 0, x = 1;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = x;
                x++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
                if (j == 2) System.out.println();
            }
        }

        System.out.println(searchMatrich(matrix,target));
    }
    public static boolean searchMatrich(int[][] m, int target){
        if (m[0].length == 0 || m.length == 0) return false;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(m[i][j] == target) return true;
            }
        }
        return false;
    }
}
