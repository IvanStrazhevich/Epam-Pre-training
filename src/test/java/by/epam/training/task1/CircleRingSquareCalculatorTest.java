package by.epam.training.task1;

import by.epam.training.task1.CircleRingSquareCalculator;
import by.epam.training.task2.Viewer;

public class CircleRingSquareCalculatorTest {

    public static void main(String[] args) {
        double r1 = 12;
        double r2 = 20;

        Viewer.print("Ring Square is " + CircleRingSquareCalculator.getRingSquare(r1, r2));
    }
}
