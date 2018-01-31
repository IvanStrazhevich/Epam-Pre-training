package task1;

public class Task1n3 {

    public static void switchNumbers(double a, double b) {
        b += a;
        a = b - a;
        b = b - a;
    }
}
