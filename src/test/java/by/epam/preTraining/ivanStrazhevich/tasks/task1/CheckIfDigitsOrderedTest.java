package by.epam.preTraining.ivanStrazhevich.tasks.task1;

import by.epam.preTraining.ivanStrazhevich.tasks.task1.CheckIfDigitsOrdered;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

public class CheckIfDigitsOrderedTest {

    public static void main(String[] args) {
        int n = 1234;

        Viewer.print("Digits in " + n + " ordered by range is "
                + CheckIfDigitsOrdered.isOrderedByRange(n));

    }
}
