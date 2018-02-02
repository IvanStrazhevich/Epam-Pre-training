package task1;

import task2.Viewer;

public class CheckIfDigitsOrderedTest {

    public static void main(String[] args) {
        int n = 1234;

        Viewer.print("Digits in " + n + " ordered by range is "
                + CheckIfDigitsOrdered.isOrderedByRange(n));

    }
}
