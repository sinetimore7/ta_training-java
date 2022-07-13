package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task2.Figures;

import static java.lang.Math.*;

public class Circle extends Figure{
    final double aX;
    final double aY;
    final double radius;

    Circle(Point point1, double radius){
        this.aX = point1.getX();
        this.aY = point1.getY();
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public String pointsToString() {
        return "(" + aX + "," + aY + ")";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(aX - radius, aY);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + radius + "]";
    }
}