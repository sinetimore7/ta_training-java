package com.epam.training.student_Vitali_Semenov.Arrays.Task7.MatrixTransposition;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        //Put your code here
        int[][] newArray = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                newArray[j][i] = matrix[i][j];
            }
        }
        matrix = newArray;
        return matrix;

    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
