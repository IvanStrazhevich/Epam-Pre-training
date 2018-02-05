package by.epam.training.task1;

public class CircleRingSquareCalculator {

    public static double getCircleSquare(double radius) {
        double square = Math.PI * radius * radius;
        return square;
    }

    public static double getRingSquare(double radius1, double radius2) {
        double square = Math.abs(getCircleSquare(radius1) - getCircleSquare(radius2));
        return square;
    }
}
