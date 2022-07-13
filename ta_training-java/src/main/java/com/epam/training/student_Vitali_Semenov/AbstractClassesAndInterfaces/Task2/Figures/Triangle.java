package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task2.Figures;

import static java.lang.Math.*;

public class Triangle extends Figure{
    final double aX, aY, bX, bY, cX, cY;

    Triangle(Point point1, Point point2, Point point3){
        this.aX = point1.getX();
        this.aY = point1.getY();
        this.bX = point2.getX();
        this.bY = point2.getY();
        this.cX = point3.getX();
        this.cY = point3.getY();
    }

    @Override
    public double area() {
        double a = length(aX, aY, bX, bY);
        double b = length(bX, bY, cX, cY);
        double c = length(aX, aY, cX, cY);

        return  (sqrt((a + b - c) * (a - b + c) * (- a + b + c) * (a + b + c))) / 4;
    }

    @Override
    public String pointsToString() {
        return "(" + aX + "," + aY + ")" + "(" + bX + "," + bY + ")" + "(" + cX + "," + cY + ")";
    }

    @Override
    public Point leftmostPoint() {
        if (aX <= bX && aX <= cX){
            return new Point(aX, aY);
        } else if (bX <= aX && bX <= cX){
            return new Point(bX, bY);
        } else {
            return new Point(cX, cY);
        }
    }
}
