package com.epam.training.student_Vitali_Semenov.Arrays.Task4.LocalMaximaRemove;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        //put your code here
        int[] newArray = new int[array.length];
        int arrayLength = array.length;
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (i == 0){
                if (array[i] > array[i + 1]){
                    arrayLength -= 1;
                } else {
                    newArray[j] = array[i];
                    j++;
                }
            } else if (i == array.length - 1){
                if (array[i] > array[i - 1]){
                    arrayLength -= 1;
                } else {
                    newArray[j] = array[i];
                    j++;
                }
            } else {
                if(array[i] > array[i + 1] && array[i] > array[i - 1]){
                    arrayLength -= 1;
                } else {
                    newArray[j] = array[i];
                    j++;
                }
            }
        }
        return Arrays.copyOf(newArray, arrayLength);
    }
}
