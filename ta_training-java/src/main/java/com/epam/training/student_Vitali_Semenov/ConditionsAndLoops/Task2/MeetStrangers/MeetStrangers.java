package com.epam.training.student_Vitali_Semenov.ConditionsAndLoops.Task2.MeetStrangers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeetStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scan = new Scanner(System.in);
        int quantityOfPeople = scan.nextInt();
        if (quantityOfPeople == 0){
            System.out.println("Oh, it looks like there is no one here");
        } else if (quantityOfPeople < 0) {
            System.out.println("Seriously? Why so negative?");
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= quantityOfPeople; i++){
            list.add(scan.nextLine());
        }
        for (int i = 1; i < list.size(); i++){
            System.out.println("Hello, " + list.get(i));
        }
    }
}
