package com.epam.training.student_Vitali_Semenov.ConditionsAndLoops.Task5.FindMaxInSeq;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            int value = scanner.nextInt();
            if (value == 0){
                break;
            }
            list.add(value);
        }
        int max = list.get(0);
        for (int i =1; i < list.size(); i++){
            if (max < list.get(i)){
                max = list.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code


        System.out.println(max());
    }
}
