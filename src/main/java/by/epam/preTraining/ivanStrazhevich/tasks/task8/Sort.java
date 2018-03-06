package by.epam.preTraining.ivanStrazhevich.tasks.task8;

import java.util.Arrays;


public class Sort<T extends Comparable> {

    //O(n) best O(n*n) worst
    public T[] sortBubble(T[] array) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] != null && array[i - 1] != null) {
                    if (array[i - 1].compareTo(array[i]) > 0) {
                        T temp = array[i];
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
    public T[] sortInsert(T[] array) {
        int sortedRangeEndIndex = 1;
        while (sortedRangeEndIndex < array.length) {
            if (array[sortedRangeEndIndex] != null) {
                if (array[sortedRangeEndIndex].compareTo(array[sortedRangeEndIndex - 1]) < 0) {
                    int insertIndex = findInsertionIndex(array, array[sortedRangeEndIndex]);
                    insert(array, insertIndex, sortedRangeEndIndex);
                }
            }
            sortedRangeEndIndex++;
        }
        return array;
    }

    private int findInsertionIndex(T[] array, T valueToInsert) {
        for (int index = 0; index < array.length; index++) {
            if (array[index].compareTo(valueToInsert) > 0) {
                return index;
            }
        }
        return array.length - 1;
    }

    private void insert(T[] array, int indexInsertingAt, int indexInsertingFrom) {

        T temp = array[indexInsertingAt];
        array[indexInsertingAt] = array[indexInsertingFrom];
        for (int current = indexInsertingFrom; current > indexInsertingAt; current--) {
            array[current] = array[current - 1];
        }
        array[indexInsertingAt + 1] = temp;
    }

    //O(n) best O(n*n) worst
    public T[] sortChoice(T[] array) {
        int sortedRangeEnd = 0;

        while (sortedRangeEnd < array.length) {
            int nextIndex = findIndexOfSmallestFromIndex(array, sortedRangeEnd);
            T temp = array[sortedRangeEnd];
            array[sortedRangeEnd] = array[nextIndex];
            array[nextIndex] = temp;
            sortedRangeEnd++;
        }
        return array;
    }

    private int findIndexOfSmallestFromIndex(T[] array, int sortedRangeEnd) {
        T currentSmallest = array[sortedRangeEnd];
        int currentSmallestIndex = sortedRangeEnd;

        for (int i = sortedRangeEnd + 1; i < array.length; i++) {
            if (currentSmallest != null && array[i] != null) {
                if (currentSmallest.compareTo(array[i]) > 0) {
                    currentSmallest = array[i];
                    currentSmallestIndex = i;
                }
            }
        }
        return currentSmallestIndex;
    }

    //O(n.log(n)) anyway
    public T[] sortMerge(T[] array) {
        if (array.length == 1) {
            return array;
        } else {
            int leftSize = array.length / 2;
            T[] left = Arrays.copyOfRange(array, 0, leftSize);
            T[] right = Arrays.copyOfRange(array, leftSize, array.length);
            return merge(array, sortMerge(left), sortMerge(right));
        }
    }

    private T[] merge(T[] array, T[] left, T[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;
        int remaining = left.length + right.length;
        while (remaining > 0) {
            if (leftIndex >= left.length) {
                array[targetIndex] = right[rightIndex++];
            } else if (rightIndex >= right.length) {
                array[targetIndex] = left[leftIndex++];
            } else if (left[leftIndex] != null && right[rightIndex] != null
                    && left[leftIndex].compareTo(right[rightIndex]) < 0) {
                array[targetIndex] = left[leftIndex++];
            } else {
                array[targetIndex] = right[rightIndex++];
            }
            targetIndex++;
            remaining--;
        }
        return array;
    }

    // O(.n*log(n)) best, O(n*n) worst
    public T[] sortQuick(T[] array) {
        return doSort(array, 0, array.length - 1);
    }

    public int randomRange(int min, int max) {
        max -= min;
        return (int) ( Math.random() * ++max ) + min;
    }

    private T[] doSort(T[] array, int left, int right) {
        if (left < right) {
            int newRnd = divide(array, left, right, randomRange(left, right));
            array = doSort(array, left, newRnd - 1);
            array = doSort(array, newRnd + 1, right);
        }
        return array;
    }

    private int divide(T[] array, int left, int right, int rndIndex) {
        T rndValue = array[rndIndex];
        T temp = array[rndIndex];
        array[rndIndex] = array[right];
        array[right] = temp;
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (array[i] != null && rndValue != null
                    && array[i].compareTo(rndValue) < 0) {
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
