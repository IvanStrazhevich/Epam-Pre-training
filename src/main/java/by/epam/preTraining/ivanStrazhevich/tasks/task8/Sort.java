package by.epam.preTraining.ivanStrazhevich.tasks.task8;

import java.util.Arrays;


public class Sort<T extends Comparable> {

    //O(n) best O(n*n) worst
    public Object[] sortBubble(Object[] array) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] != null && array[i - 1] != null) {
                    if (array[i - 1].hashCode() > ( array[i] ).hashCode()) {
                        Object temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        swapped = true;
                    }
                }
            }
        }
        return array;
    }

    //O(n) best O(n*n) worst
    public Object[] sortInsert(Object[] array) {
        int sortedRangeEndIndex = 1;
        while (sortedRangeEndIndex < array.length) {
            if (array[sortedRangeEndIndex] != null) {
                if (array[sortedRangeEndIndex].hashCode() < array[sortedRangeEndIndex - 1].hashCode()) {
                    int insertIndex = findInsertionIndex(array, array[sortedRangeEndIndex]);
                    insert(array, insertIndex, sortedRangeEndIndex);
                }
            }
            sortedRangeEndIndex++;
        }
        return array;
    }

    private int findInsertionIndex(Object[] array, Object valueToInsert) {
        for (int index = 0; index < array.length; index++) {
            if (array[index].hashCode() > valueToInsert.hashCode()) {
                return index;
            }
        }
        return array.length - 1;
    }

    private void insert(Object[] array, int indexInsertingAt, int indexInsertingFrom) {

        Object temp = array[indexInsertingAt];
        array[indexInsertingAt] = array[indexInsertingFrom];
        for (int current = indexInsertingFrom; current > indexInsertingAt; current--) {
            array[current] = array[current - 1];
        }
        array[indexInsertingAt + 1] = temp;
    }

    //O(n) best O(n*n) worst
    public Object[] sortChoice(Object[] array) {
        int sortedRangeEnd = 0;

        while (sortedRangeEnd < array.length) {
            int nextIndex = findIndexOfSmallestFromIndex(array, sortedRangeEnd);
            Object temp = array[sortedRangeEnd];
            array[sortedRangeEnd] = array[nextIndex];
            array[nextIndex] = temp;
            sortedRangeEnd++;
        }
        return array;
    }

    private int findIndexOfSmallestFromIndex(Object[] array, int sortedRangeEnd) {
        Object currentSmallest = array[sortedRangeEnd];
        int currentSmallestIndex = sortedRangeEnd;

        for (int i = sortedRangeEnd + 1; i < array.length; i++) {
            if (currentSmallest != null && array[i] != null) {
                if (currentSmallest.hashCode() > ( array[i].hashCode() )) {
                    currentSmallest = array[i];
                    currentSmallestIndex = i;
                }
            }
        }
        return currentSmallestIndex;
    }

    //O(n.log(n)) anyway
    public Object[] sortMerge(Object[] array) {
        if (array.length == 1) {
            return array;
        } else {
            int leftSize = array.length / 2;
            Object[] left = Arrays.copyOfRange(array, 0, leftSize);
            Object[] right = Arrays.copyOfRange(array, leftSize, array.length);
            return merge(sortMerge(left), sortMerge(right));
        }
    }

    private Object[] merge(Object[] left, Object[] right) {
        Object[] items = new Object[( left.length + right.length )];
        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;
        int remaining = left.length + right.length;
        while (remaining > 0) {

            if (leftIndex >= left.length) {
                items[targetIndex] = right[rightIndex++];
            } else if (rightIndex >= right.length) {
                items[targetIndex] = left[leftIndex++];
            } else if (left[leftIndex] != null && right[rightIndex] != null
                    && left[leftIndex].hashCode() < right[rightIndex].hashCode()) {
                items[targetIndex] = left[leftIndex++];
            } else {
                items[targetIndex] = right[rightIndex++];
            }
            targetIndex++;
            remaining--;

        }
        return items;
    }

    // O(.n*log(n)) best, O(n*n) worst
    public Object[] sortQuick(Object[] array) {
        return doSort(array, 0, array.length - 1);
    }

    public int randomRange(int min, int max) {
        max -= min;
        return (int) ( Math.random() * ++max ) + min;
    }

    private Object[] doSort(Object[] items, int left, int right) {
        if (left < right) {
            int newRnd = divide(items, left, right, randomRange(left, right));
            items = doSort(items, left, newRnd - 1);
            items = doSort(items, newRnd + 1, right);
        }
        return items;
    }

    private int divide(Object[] array, int left, int right, int rndIndex) {
        Object rndValue = array[rndIndex];
        Object temp = array[rndIndex];
        array[rndIndex] = array[right];
        array[right] = temp;
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (array[i] != null && rndValue != null
                    && array[i].hashCode() < ( rndValue ).hashCode()){
                temp = array[i];
                array[i] = array[storeIndex];
                array[storeIndex] = temp;
                storeIndex += 1;
            }
        }
        temp = array[storeIndex];
        array[storeIndex] = array[right];
        array[right] = temp;
        return storeIndex;
    }
}
