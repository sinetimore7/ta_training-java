package com.epam.training.student_Vitali_Semenov.FirstProgramJava.Task2.MeetAStranger;

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        //Write a program, which read a String from System.in and print "Hello, <input string>"
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello, " + input);
    }
}
