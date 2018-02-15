package by.epam.training.logic.task1;

import by.epam.training.view.Viewer;

public class CheckIfDigitsOrderedTest {

    public static void main(String[] args) {
        int n = 1234;

        Viewer.print("Digits in " + n + " ordered by range is "
                + CheckIfDigitsOrdered.isOrderedByRange(n));

    }
}
