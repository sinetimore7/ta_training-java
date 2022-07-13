package com.epam.training.student_Vitali_Semenov.Arrays.Task2.SumOfEvenNumbers;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sumEvenValue = 0;
        if (array == null || array.length == 0){
            return 0;
        } else {
            for (int elem: array){
                if (elem % 2 == 0){
                    sumEvenValue += elem;
                }
            }
            return sumEvenValue;
        }

        //put your code here


    }
}
