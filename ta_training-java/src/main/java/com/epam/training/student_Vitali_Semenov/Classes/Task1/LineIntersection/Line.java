package com.epam.training.student_Vitali_Semenov.Classes.Task1.LineIntersection;

public class Line {
    int k;
    int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {

        int k1 = k;
        int b1 = b;
        int k2 = other.k;
        int b2 = other.b;

        if (k1 == k2){
            return null;
        } else {
            int x = (b2 - b1) / (k1 - k2);
            int y = x * k1 + b1;
            return new Point(x, y);
        }
    }
}
