package by.epam.preTraining.ivanStrazhevich.tasks.task8;

import java.util.Arrays;

public class Search {
    public static boolean linerSearch(Object element, Object[] array) {
        boolean b = false;
        for (Object o : array
                ) {
            if (element.equals(o)) {
                b = true;
                break;
            } else {
                b = false;
            }
        }
        return b;
    }

    public static boolean binarySearch(Object element, Object[] array) {
        boolean b = false;
        if (array.length == 1) {
            if (array[0].equals(element)) {
                b = true;
                return b;
            } else {
                return b;
            }
        } else {
            int leftSize = array.length / 2;
            Object[] left = Arrays.copyOfRange(array, 0, leftSize);
            Object[] right = Arrays.copyOfRange(array, leftSize, array.length);
            b = binarySearch(element, left);
            if (b) {
                return true;
            } else {
                b = binarySearch(element, right);
                return b;
            }
        }
    }
}

