package by.epam.training.task1;

import by.epam.training.task1.AverageGeoMean6DigitNumber;
import by.epam.training.task2.Viewer;

public class AverageGeoMean6DigitNumberTest {

    public static void main(String[] args) {
        int n = 756432;

        Viewer.print("Arithmetic avarage of " +n + " is "
                + AverageGeoMean6DigitNumber.getDigitsArithmeticAverage(n));
        Viewer.print("Geometric mean of " +n+ " is "
                + AverageGeoMean6DigitNumber.getDigitsGeometricMean(n));
    }
}
