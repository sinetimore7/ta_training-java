package com.epam.training.student_Vitali_Semenov.ConditionsAndLoops.Task4.GoDutch;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int billValue = scanner.nextInt();
        int quantityOfPeople = scanner.nextInt();

        if (quantityOfPeople <= 0){
            System.out.println("Number of friends cannot be negative or zero");
        }
        else if (billValue < 0) {
            System.out.println("Bill total amount cannot be negative");
        }
        else {
            int totalBill = billValue + (billValue / 100) * 10;
            System.out.println(totalBill / quantityOfPeople);
        }
    }
}
