package com.epam.training.student_Vitali_Semenov.ConditionsAndLoops.Task7.PizzaSplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        int quantityOfPeople = scanner.nextInt();
        int quantityOfSlices = scanner.nextInt();
        int quantityOfPizza = 1;
        while ((quantityOfPizza * quantityOfSlices) % quantityOfPeople != 0) {
            quantityOfPizza++;
        }
        System.out.println(quantityOfPizza);
    }
}
