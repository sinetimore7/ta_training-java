package com.epam.training.student_Vitali_Semenov.Arrays.Task6.Spiral;

public class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int value = 1;

        int x1 = 0;
        int x2 = columns - 1;
        int x3 = rows - 1;
        int x4 = 0;

        while (value <= rows * columns){
            // to right
            for (int i = 0; i < columns; i++){
                if (array[x1][i] == 0){
                    array[x1][i] = value;
                    value++;
                }
            }
            x1++;
            // to down
            for (int i = 0; i < rows; i++){
                if (array[i][x2] == 0){
                    array[i][x2] = value;
                    value++;
                }
            }
            x2--;
            // to left
            for (int i = columns - 1; i >= 0; i--){
                if (array[x3][i] == 0){
                    array[x3][i] = value;
                    value++;
                }
            }
            x3--;
            // to up
            for (int i = rows - 1; i >= 0; i--){
                if (array[i][x4] == 0){
                    array[i][x4] = value;
                    value++;
                }
            }
            x4++;
        }
        return array;
    }
}
