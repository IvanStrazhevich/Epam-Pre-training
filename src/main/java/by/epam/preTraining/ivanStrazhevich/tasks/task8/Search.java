package by.epam.preTraining.ivanStrazhevich.tasks.task8;

import java.util.Arrays;

public class Search<T extends Comparable<T>> {
    public boolean linerSearch(T element, T[] array) {
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

    public boolean binarySearch(T element, T[] array) {
        array = sort(array);
        return doSearch(element, array);
    }

    private boolean doSearch(T element, T[] array) {
        int halfLength = array.length / 2;
        if (array[halfLength] != null &&
                array[halfLength].compareTo(element) < 0) {
            array = Arrays.copyOfRange(array, halfLength, array.length);
            System.out.println("left" + array.length);
            return doSearch(element, array);
        } else if (array[halfLength] != null &&
                array[halfLength].compareTo(element) > 0) {
            array = Arrays.copyOfRange(array, 0, halfLength);
            System.out.println("right" + array.length);
            return doSearch(element, array);
        } else if (array[halfLength] != null && halfLength > 1 &&
                array[halfLength].compareTo(element) == 0) {
            System.out.println("found" + true);
            return true;
        } else if (array[halfLength - 1] != null &&
                array[halfLength - 1].compareTo(element) == 0
                || array[halfLength] != null && array[halfLength].compareTo(element) == 0) {
            return true;
        } else {
            System.out.println("not found" + false);
            return false;
        }
    }

    private T[] sort(T[] array) {
        Sort sort = new Sort();
        return (T[]) sort.sortQuick(array);
    }
}

