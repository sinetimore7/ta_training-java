package com.epam.training.student_Vitali_Semenov.Classes.Task2.Segments;

public class Main {
    public static void main(String[] args) {
        Segment first = new Segment(new Point(0, 3), new Point(4, 0));
        Segment second = new Segment(new Point(-1, -3), new Point(1, 1));

        System.out.println(first.length());
        System.out.println(first.intersection(second));
    }
}
