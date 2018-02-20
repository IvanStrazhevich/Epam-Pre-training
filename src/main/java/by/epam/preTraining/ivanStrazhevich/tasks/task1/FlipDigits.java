package by.epam.preTraining.ivanStrazhevich.tasks.task1;

public class FlipDigits {

    public static int flipDigits(int n) {
        int x7 = n / 1000000;
        int x6 = n % 1000000 / 100000;
        int x5 = n % 100000 / 10000;
        int x4 = n % 10000 / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        return x1 * 1000000 + x2 * 100000 + x3 * 10000 + x4 * 1000 + x5 * 100 + x6 * 10 + x7;
    }
}
