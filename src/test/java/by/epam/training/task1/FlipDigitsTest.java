package by.epam.training.task1;

import by.epam.training.task1.FlipDigits;
import by.epam.training.task2.Viewer;

public class FlipDigitsTest {

    public static void main(String[] args) {
        int n = 1234567;

        Viewer.print(n + " after flip is "
                + FlipDigits.flipDigits(n));
    }
}
