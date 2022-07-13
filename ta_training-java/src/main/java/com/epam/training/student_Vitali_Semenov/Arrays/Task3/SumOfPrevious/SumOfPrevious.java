package com.epam.training.student_Vitali_Semenov.Arrays.Task3.SumOfPrevious;

import java.util.Arrays;

public class SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        //put your code here
        boolean[] logicalArray = new boolean[array.length];
        logicalArray[0] = false;
        logicalArray[1] = false;
        for (int i = 2; i < array.length; i++){
            if (array[i] == array[i - 1] + array[i - 2]){
                logicalArray[i] = true;
            } else {
                logicalArray[i] = false;
            }
        }
        return logicalArray;
    }
}
