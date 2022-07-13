package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task2.Figures;

import static java.lang.Math.*;

abstract class Figure {
    public double length(double x1, double y1, double x2, double y2){
        return  sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }
    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    public abstract Point leftmostPoint();
}
