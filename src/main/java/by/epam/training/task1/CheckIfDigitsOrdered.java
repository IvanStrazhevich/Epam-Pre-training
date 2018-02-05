package by.epam.training.task1;

public class CheckIfDigitsOrdered {

    public static boolean isOrderedByRange(int n) {
        int x4 = n / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        boolean b;
        b = x1 < x2 && x2 < x3 && x3 < x4
                || x4 < x3 && x3 < x2 && x2 < x1;
        return b;
    }
}
