package by.epam.training.task1;

import by.epam.training.task1.CheckIfDigitsOrdered;
import by.epam.training.task2.Viewer;

public class CheckIfDigitsOrderedTest {

    public static void main(String[] args) {
        int n = 1234;

        Viewer.print("Digits in " + n + " ordered by range is "
                + CheckIfDigitsOrdered.isOrderedByRange(n));

    }
}
