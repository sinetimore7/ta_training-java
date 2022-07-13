package com.epam.training.student_Vitali_Semenov.Enum.Task1.Compass;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    private int degrees;

    Direction(final int degrees) {
        this.degrees = degrees;
    }
    public int getDegrees(){
        return  degrees;
    }
    static int getNormalDegress(int degrees){
        while (degrees >= 360){
            degrees -= 360;
        }
        while (degrees <= -360){
            degrees += 360;
        }
        if (degrees < 0) {
            degrees += 360;
        }
        return degrees;
    }

    public static Direction ofDegrees(int degrees) {
        degrees = getNormalDegress(degrees);

        for (Direction di: Direction.values()){
            if (degrees == di.getDegrees() ){
                return di;
            }
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        degrees = getNormalDegress(degrees);
        for (Direction di: Direction.values()){
            if (degrees >= di.getDegrees() - 22 && degrees <= di.getDegrees() + 22) return di;
        }
        return null;
    }

    public Direction opposite() {
        int result = this.getDegrees();
        if (result >= 180) result -= 180;
        else result += 180;
        for (Direction di: Direction.values()){
            if (di.getDegrees() == result) return di;
        }
        return null;
    }

    public int differenceDegreesTo(Direction direction) {
        int first = this.getDegrees();
        int second = direction.getDegrees();
        if (first == 0 && second >= 180 && second < 360 ) first = 360;
        if (second == 0 && first >= 180 && first < 360 ) second = 360;
        if (first > second){
            return first - second;
        } else return second - first;
    }
}
