package by.epam.preTraining.ivanStrazhevich.tasks.task1;

import by.epam.preTraining.ivanStrazhevich.tasks.task1.CircleRingSquareCalculator;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

public class CircleRingSquareCalculatorTest {

    public static void main(String[] args) {
        double r1 = 12;
        double r2 = 20;

        Viewer.print("Ring Square is " + CircleRingSquareCalculator.getRingSquare(r1, r2));
    }
}
