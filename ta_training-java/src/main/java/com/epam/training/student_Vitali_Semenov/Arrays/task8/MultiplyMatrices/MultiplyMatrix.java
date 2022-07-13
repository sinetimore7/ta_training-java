package com.epam.training.student_Vitali_Semenov.Arrays.task8.MultiplyMatrices;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        // Put your code here
        int[][] resultArray = new int[matrix1.length][matrix1.length];
        if (matrix1.length == matrix2[0].length && matrix1[0].length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < matrix1[i].length; k++) {
                        sum = sum + (matrix1[i][k] * matrix2[k][j]);
                    }
                    resultArray[i][j] = sum;
                }
            }
            return resultArray;
        }
        return resultArray;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
