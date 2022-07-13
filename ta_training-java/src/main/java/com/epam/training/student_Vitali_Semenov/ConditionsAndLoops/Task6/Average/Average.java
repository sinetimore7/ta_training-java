package com.epam.training.student_Vitali_Semenov.ConditionsAndLoops.Task6.Average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int result = 0;
        int numberOfValues = 0;
        while (true){
            int value = scanner.nextInt();
            if (value == 0){
                break;
            }
            result += value;
            numberOfValues++;
        }
        System.out.println(result / numberOfValues);

    }
}
