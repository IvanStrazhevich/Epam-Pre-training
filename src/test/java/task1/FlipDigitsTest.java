package task1;

import task2.Viewer;

public class FlipDigitsTest {

    public static void main(String[] args) {
        int n = 1234567;

        Viewer.print(n + " after flip is "
                + FlipDigits.flipDigits(n));
    }
}
