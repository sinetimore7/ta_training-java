package com.epam.training.student_Vitali_Semenov.Arrays.Task1.MaxMethod;

public class MaxMethod {
    public static int max(int[] values) {
        int maxValue = values[0];
        for (int elem : values){
            if (maxValue < elem){
                maxValue = elem;
            }
        }
        return maxValue;
    }
}
