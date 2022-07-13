package com.epam.training.student_Vitali_Semenov.Classes.Task3.Triangle;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Triangle {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    private final double x3;
    private final double y3;


    public Triangle(Point a, Point b, Point c) {
        this.x1 = a.getX();
        this.x2 = b.getX();
        this.x3 = c.getX();
        this.y1 = a.getY();
        this.y2 = b.getY();
        this.y3 = c.getY();

        if ( length(a, b) + length(b, c) <= length(a, c) || length(a, b) + length(a, c) <= length(b, c) || length(b, c) + length(a, c) <= length(a, b)){
            throw new IllegalArgumentException();
        }
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double a = length(x1, y1, x2, y2);
        double b = length(x2, y2, x3, y3);
        double c = length(x1, y1, x3, y3);

        return  (sqrt((a + b - c) * (a - b + c) * (- a + b + c) * (a + b + c))) / 4;
    }

    public Point centroid(){
        return new Point((x1 + x2 + x3) / 3, (y1 + y2 + y3) / 3);
    }

    double length(Point point1, Point point2) {
        return  sqrt(pow((point2.getX() - point1.getX()), 2) + pow((point2.getY() - point1.getY()), 2));
    }

    double length(double x1, double y1, double x2, double y2){
        return  sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }
}
