package by.epam.preTraining.ivanStrazhevich.tasks.task1;

import by.epam.preTraining.ivanStrazhevich.tasks.task1.FlipDigits;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

public class FlipDigitsTest {

    public static void main(String[] args) {
        int n = 1234567;

        Viewer.print(n + " after flip is "
                + FlipDigits.flipDigits(n));
    }
}
