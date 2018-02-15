package by.epam.training.logic.task1;

public class SwapVariables {

    public static void swapVariables(double a, double b) {
        b += a;
        a = b - a;
        b = b - a;
    }
}
