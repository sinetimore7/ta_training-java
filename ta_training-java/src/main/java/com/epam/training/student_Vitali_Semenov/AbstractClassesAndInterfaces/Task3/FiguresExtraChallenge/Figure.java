package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task3.FiguresExtraChallenge;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

abstract class Figure {
    public final static double DELTA = 0.0001;

    public boolean isEqual(double a, double b){
        if (Math.abs(a - b) < DELTA){
            return true;
        } else return false;
    }
    public double length(Point a, Point b) {
        return  sqrt(pow((b.getX() - a.getX()), 2) + pow((b.getY() - a.getY()), 2));
    }
    public double length(double x1, double y1, double x2, double y2){
        return  sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }
    public abstract Point centroid();
    public abstract boolean isTheSame(Figure figure);
}
