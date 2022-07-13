package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task2.Figures;

import static java.lang.Math.*;

public class Quadrilateral extends Figure{
    final double aX, aY, bX, bY, cX, cY, dX, dY;

    Quadrilateral(Point point1, Point point2, Point point3, Point point4){
        this.aX = point1.getX();
        this.aY = point1.getY();
        this.bX = point2.getX();
        this.bY = point2.getY();
        this.cX = point3.getX();
        this.cY = point3.getY();
        this.dX = point4.getX();
        this.dY = point4.getY();
    }
    @Override
    public double area() {
        double ab = length(aX, aY, bX, bY);
        double bc = length(bX, bY, cX, cY);
        double ac = length(aX, aY, cX, cY);
        double cd = length(cX, cY, dX, dY);
        double ad = length(aX, aY, dX, dY);
        double s1 = (sqrt((ab + bc - ac) * (ab - bc + ac) * (- ab + bc + ac) * (ab + bc + ac))) / 4;
        double s2 = (sqrt((ad + cd - ac) * (ad - cd + ac) * (- ad + cd + ac) * (ad + cd + ac))) / 4;

        return  s1 + s2;
    }

    @Override
    public String pointsToString() {
        return "(" + aX + "," + aY + ")" + "(" + bX + "," + bY + ")" + "(" + cX + "," + cY + ")"+ "(" + dX + "," + dY + ")";
    }

    @Override
    public Point leftmostPoint() {
        if (aX <= bX && aX <= cX && aX <= dX){
            return new Point(aX, aY);
        } else if (bX <= aX && bX <= cX && bX <= dX){
            return new Point(bX, bY);
        } else if (cX <= aX && cX <= bX && cX <= dX){
            return new Point(cX, cY);
        } else {
            return new Point(dX, dY);
        }
    }
}
