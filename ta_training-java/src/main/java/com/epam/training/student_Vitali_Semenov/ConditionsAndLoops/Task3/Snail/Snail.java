package com.epam.training.student_Vitali_Semenov.ConditionsAndLoops.Task3.Snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);
        int wayUp = scanner.nextInt();
        int wayDown = scanner.nextInt();
        int treeHeight = scanner.nextInt();
        int daysOnTheRoad = 1;
        if (wayUp <= wayDown && wayUp < treeHeight){
            System.out.println("Impossible");
        } else {
            int way = 0;
            while (way < treeHeight){
                way += wayUp;
                if (way >= treeHeight){
                    break;
                }
                way -= wayDown;
                daysOnTheRoad++;
            }
            System.out.println(daysOnTheRoad);
        }
    }
}
