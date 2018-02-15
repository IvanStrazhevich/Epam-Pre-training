package by.epam.training.logic.task1;

public class AverageGeoMean6DigitNumber {

    public static double getDigitsArithmeticAverage(int n) {
        int x6 = n / 100000;
        int x5 = n % 100000 / 10000;
        int x4 = n % 10000 / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        return (x1 + x2 + x3 + x4 + x5 + x6) / 6.0;
    }

    public static double getDigitsGeometricMean(int n) {
        int x6 = n / 100000;
        int x5 = n % 100000 / 10000;
        int x4 = n % 10000 / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        return Math.pow((x1 * x2 * x3 * x4 * x5 * x6), (1/6.0));
    }
}
