package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task3.FiguresExtraChallenge;

class Circle extends Figure{
    final double aX;
    final double aY;
    final double radius;

    Circle(Point a, double radius){
        if (radius <= 0 || a == null){
            throw new IllegalArgumentException();
        } else {
            this.aX = a.getX();
            this.aY = a.getY();
            this.radius = radius;
        }
    }

    @Override
    public Point centroid() {
        return new Point(aX, aY);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure == null || getClass() != figure.getClass()) return false;
        if (isEqual(this.radius, ((Circle) figure).radius) && isEqual(this.aX, ((Circle) figure).aX) && isEqual(this.aY, ((Circle) figure).aY)) {
            return true;
        } else {
            return false;
        }
    }
}
