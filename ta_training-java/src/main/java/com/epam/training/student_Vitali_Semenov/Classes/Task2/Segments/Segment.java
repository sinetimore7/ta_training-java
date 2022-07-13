package com.epam.training.student_Vitali_Semenov.Classes.Task2.Segments;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Segment {
    private  final double x1;
    private final double x2;
    private final double y1;
    private final double y2;

    public Segment(Point start, Point end) throws IllegalArgumentException{
        this.x1 = start.getX();
        this.y1 = start.getY();
        this.x2 = end.getX();
        this.y2 = end.getY();
        if (x1 == x2 && y1 == y2){
            throw new IllegalArgumentException();
        }
        if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0){
            throw new IllegalArgumentException();
        }
        if (start == null || end == null){
            throw new IllegalArgumentException();
        }
    }

    double length() {
        return  sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }

    Point middle() {
        return new Point((x1 + x2) / 2, (y1 + y2) / 2);
    }

    Point intersection(Segment another) {
        double x3 = another.x1;
        double x4 = another.x2;
        double y3 = another.y1;
        double y4 = another.y2;

        double a1 = (y1 - y2) / (x1- x2);
        double b1 = y2 - x2 * a1;
        double a2 = (y3 - y4) / (x3 - x4);
        double b2 = y4 - x4 * a2;

        double pointX = 0;
        double pointY = 0;

        if (a1 != a2){
            pointX = (b1 - b2) / (a2 - a1);
            pointY = a1 * ((b1 - b2) / (a2 - a1)) + b1;
        }

        if (a1 == a2 && b1 == b2){
            return null;
        } else if (a1 == a2) {
            return null;
        } else if ( (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4) == 0) {
            return null;
        } else if ((pointX - x1) * (x2 - pointX) >= 0 && (pointX - x1) * (x2 - pointX) <= (x1 - x2) * (x1 - x2)
                && (pointY - y1) * (y2 - pointY) >= 0 && (pointY - y1) * (y2 - pointY) <= (y1 - y2) * (y1 - y2)
                && (pointX - x3) * (x4 - pointX) >= 0 && (pointX - x3) * (x4 - pointX) <= (x3 - x4) * (x3 - x4)
                && (pointY - y3) * (y4 - pointY) >= 0 && (pointY - y3) * (y4 - pointY) <= (y3 - y4) * (y3 - y4)){
            return new Point(pointX, pointY);
        }
        else {
            return null;
        }
    }
}
