package com.epam.training.student_Vitali_Semenov.Arrays.Task5.CycleSwap;

public class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length != 0){
            int[] localArray = new int[array.length];
            localArray[0] = array[array.length - 1];
            System.arraycopy(array, 0, localArray, 1, array.length - 1);
            System.arraycopy(localArray, 0, array, 0, localArray.length);
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length != 0) {
            int[] localArray = new int[array.length];
            System.arraycopy(array, 0, localArray, shift, array.length - shift);
            System.arraycopy(array, array.length - shift, localArray, 0, shift);
            System.arraycopy(localArray, 0, array, 0, localArray.length);
        }
    }
}
