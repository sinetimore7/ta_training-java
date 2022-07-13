package com.epam.training.student_Vitali_Semenov.AbstractClassesAndInterfaces.Task3.FiguresExtraChallenge;

class Quadrilateral extends Figure{
    final double aX, aY, bX, bY, cX, cY, dX, dY;

    Quadrilateral(Point a, Point b, Point c, Point d) {
        if (a == null || b == null || c == null || d == null) {
            throw new IllegalArgumentException();
        } else if (isTriangleDegenerate(a, b, c) || isTriangleDegenerate(b, c, d) || isTriangleDegenerate(c, d, a) || isTriangleDegenerate(a, b, d)) {
            throw new IllegalArgumentException();
        } else if (!isSegmentsIntersection(a, c, b, d)) {
            throw new IllegalArgumentException();
        } else {
            this.aX = a.getX();
            this.aY = a.getY();
            this.bX = b.getX();
            this.bY = b.getY();
            this.cX = c.getX();
            this.cY = c.getY();
            this.dX = d.getX();
            this.dY = d.getY();
        }
    }

    public boolean isTriangleDegenerate(Point a, Point b, Point c) {
        return length(a, b) + length(b, c) < length(a, c) || isEqual(length(a, b) + length(b, c), length(a, c)) ||
                length(a, b) + length(a, c) < length(b, c) || isEqual(length(a, b) + length(a, c), length(b, c)) ||
                length(b, c) + length(a, c) < length(a, b) || isEqual(length(b, c) + length(a, c), length(a, b));
    }

    public Point getPointCrossingLines(Point a, Point b, Point c, Point d) {
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        double x4 = d.getX();
        double y4 = d.getY();

        double a1 = (y1 - y2) / (x1 - x2);
        double b1 = y2 - x2 * a1;
        double a2 = (y3 - y4) / (x3 - x4);
        double b2 = y4 - x4 * a2;
        double pointX = 0;
        double pointY = 0;
        if (a1 != a2) {
            pointX = (b1 - b2) / (a2 - a1);
            pointY = a1 * ((b1 - b2) / (a2 - a1)) + b1;
        }
        if (a1 == a2 && b1 == b2) {
            return null;
        } else if (a1 == a2) {
            return null;
        } else if ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4) == 0) {
            return null;
        } else if ((pointX - x1) * (x2 - pointX) >= 0 && (pointX - x1) * (x2 - pointX) <= (x1 - x2) * (x1 - x2)
                && (pointY - y1) * (y2 - pointY) >= 0 && (pointY - y1) * (y2 - pointY) <= (y1 - y2) * (y1 - y2)
                && (pointX - x3) * (x4 - pointX) >= 0 && (pointX - x3) * (x4 - pointX) <= (x3 - x4) * (x3 - x4)
                && (pointY - y3) * (y4 - pointY) >= 0 && (pointY - y3) * (y4 - pointY) <= (y3 - y4) * (y3 - y4)) {
            return new Point(pointX, pointY);
        } else return null;
    }

    public boolean isSegmentsIntersection(Point a, Point b, Point c, Point d) {
        Point point = getPointCrossingLines(a, b, c, d);
        return point != null;
    }

    @Override
    public Point centroid() {
        Triangle abc = new Triangle(new Point(aX, aY), new Point(bX, bY), new Point(cX, cY));
        Triangle adc = new Triangle(new Point(aX, aY), new Point(dX, dY), new Point(cX, cY));
        Triangle dab = new Triangle(new Point(dX, dY), new Point(aX, aY), new Point(bX, bY));
        Triangle bcd = new Triangle(new Point(bX, bY), new Point(cX, cY), new Point(dX, dY));

        Point abcCentroid = abc.centroid();
        Point adcCentroid = adc.centroid();
        Point dabCentroid = dab.centroid();
        Point bcdCentroid = bcd.centroid();

        return getPointCrossingLines(abcCentroid, adcCentroid, dabCentroid, bcdCentroid);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure == null || getClass() != figure.getClass()) return false;
        if (isEqual(this.aX, ((Quadrilateral) figure).aX) && isEqual(this.aY, ((Quadrilateral) figure).aY) ||
                isEqual(this.aX, ((Quadrilateral) figure).bX) && isEqual(this.aY, ((Quadrilateral) figure).bY) ||
                isEqual(this.aX, ((Quadrilateral) figure).cX) && isEqual(this.aY, ((Quadrilateral) figure).cY) ||
                isEqual(this.aX, ((Quadrilateral) figure).dX) && isEqual(this.aY, ((Quadrilateral) figure).dY)) {
            if (isEqual(this.bX, ((Quadrilateral) figure).aX) && isEqual(this.bY, ((Quadrilateral) figure).aY) ||
                    isEqual(this.bX, ((Quadrilateral) figure).bX) && isEqual(this.bY, ((Quadrilateral) figure).bY) ||
                    isEqual(this.bX, ((Quadrilateral) figure).cX) && isEqual(this.bY, ((Quadrilateral) figure).cY) ||
                    isEqual(this.bX, ((Quadrilateral) figure).dX) && isEqual(this.bY, ((Quadrilateral) figure).dY)) {
                if (isEqual(this.cX, ((Quadrilateral) figure).aX) && isEqual(this.cY, ((Quadrilateral) figure).aY) ||
                        isEqual(this.cX, ((Quadrilateral) figure).bX) && isEqual(this.cY, ((Quadrilateral) figure).bY) ||
                        isEqual(this.cX, ((Quadrilateral) figure).cX) && isEqual(this.cY, ((Quadrilateral) figure).cY) ||
                        isEqual(this.cX, ((Quadrilateral) figure).dX) && isEqual(this.cY, ((Quadrilateral) figure).dY)) {
                    if (isEqual(this.dX, ((Quadrilateral) figure).aX) && isEqual(this.dY, ((Quadrilateral) figure).aY) ||
                            isEqual(this.dX, ((Quadrilateral) figure).bX) && isEqual(this.dY, ((Quadrilateral) figure).bY) ||
                            isEqual(this.dX, ((Quadrilateral) figure).cX) && isEqual(this.dY, ((Quadrilateral) figure).cY) ||
                            isEqual(this.dX, ((Quadrilateral) figure).dX) && isEqual(this.dY, ((Quadrilateral) figure).dY)){
                        return true;
                    } else return false;
                } else return false;
            } else return false;
        } else return false;
    }
}
