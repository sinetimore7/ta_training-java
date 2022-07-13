package com.epam.training.student_Vitali_Semenov.DataTypes.Task1.ElectronicWatch;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        LocalTime lt = LocalTime.of(0,0,0);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:mm:ss");
        lt = lt.plusSeconds(seconds);
        System.out.println(lt.format(dtf));
    }
}
