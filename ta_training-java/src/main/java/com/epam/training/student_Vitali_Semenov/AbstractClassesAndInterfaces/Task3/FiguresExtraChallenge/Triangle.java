package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task3.FiguresExtraChallenge;

class Triangle extends Figure{
    final double aX, aY, bX, bY, cX, cY;

    Triangle(Point a, Point b, Point c){
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException();
        } else if (length(a, b) + length(b, c) < length(a, c) || isEqual(length(a, b) + length(b, c), length(a, c)) ||
                length(a, b) + length(a, c) < length(b, c) || isEqual(length(a, b) + length(a, c), length(b, c)) ||
                length(b, c) + length(a, c) < length(a, b) || isEqual(length(b, c) + length(a, c), length(a, b))){
            throw new IllegalArgumentException();
        } else {
            this.aX = a.getX();
            this.aY = a.getY();
            this.bX = b.getX();
            this.bY = b.getY();
            this.cX = c.getX();
            this.cY = c.getY();
        }
    }

    @Override
    public Point centroid() {
        return new Point((aX + bX + cX) / 3, (aY + bY + cY) / 3);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure == null || getClass() != figure.getClass()) return false;
        if (isEqual(this.aX, ((Triangle) figure).aX) && isEqual(this.aY, ((Triangle) figure).aY) ||
                isEqual(this.aX, ((Triangle) figure).bX) && isEqual(this.aY, ((Triangle) figure).bY) ||
                isEqual(this.aX, ((Triangle) figure).cX) && isEqual(this.aY, ((Triangle) figure).cY)) {
            if (isEqual(this.bX, ((Triangle) figure).aX) && isEqual(this.bY, ((Triangle) figure).aY) ||
                    isEqual(this.bX, ((Triangle) figure).bX) && isEqual(this.bY, ((Triangle) figure).bY) ||
                    isEqual(this.bX, ((Triangle) figure).cX) && isEqual(this.bY, ((Triangle) figure).cY)){
                if (isEqual(this.cX, ((Triangle) figure).aX) && isEqual(this.cY, ((Triangle) figure).aY) ||
                        isEqual(this.cX, ((Triangle) figure).bX) && isEqual(this.cY, ((Triangle) figure).bY) ||
                        isEqual(this.cX, ((Triangle) figure).cX) && isEqual(this.cY, ((Triangle) figure).cY)){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
