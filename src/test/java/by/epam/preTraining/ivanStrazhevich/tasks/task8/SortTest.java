package by.epam.preTraining.ivanStrazhevich.tasks.task8;

import java.util.Arrays;

import static by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer.*;

public class SortTest {
    public static void main(String[] args) {

        print("Bubble sort:");
        ArrayFiller arrayFiller = new ArrayFiller();
        Object[] array = arrayFiller.fillArray(100);
        print(Arrays.toString(array));
        long start = System.nanoTime();
        print(Arrays.toString(Sort.sortBubble(array)));
        long finish = System.nanoTime();
        print("Bubble sort took ns: " + (finish-start));


        print("Insert sort:");
        array = arrayFiller.fillArray(100);
        print(Arrays.toString(array));
        start = System.nanoTime();
        print(Arrays.toString(Sort.sortInsert(array)));
        finish = System.nanoTime();
        print("Insert sort took ns: " + (finish-start));

        print("Choice sort:");
        array = arrayFiller.fillArray(100);
        print(Arrays.toString(array));
        start = System.nanoTime();
        print(Arrays.toString(Sort.sortChoice(array)));
        finish = System.nanoTime();
        print("Choice sort took ns: " + (finish-start));

        print("Merge sort:");
        array = arrayFiller.fillArray(100);
        print(Arrays.toString(array));
        start = System.nanoTime();
        print(Arrays.toString(Sort.sortMerge(array)));
        finish = System.nanoTime();
        print("Merge sort took ns: " + (finish-start));

        print("Fill array:");
        array = arrayFiller.fillArray(100);
        print("Liner search:");
        start = System.nanoTime();
        print(Search.linerSearch(1,array));
        finish = System.nanoTime();
        print("Liner search: took ns: " + (finish-start));
        print("Binary search:");
        start = System.nanoTime();
        print(Search.binarySearch(1,array));
        finish = System.nanoTime();
        print("Binary search took ns: " + (finish-start));
        print("Quick sort:");
        print(Arrays.toString(array));
        start = System.nanoTime();
        print(Arrays.toString(Sort.sortQuick(array)));
        finish = System.nanoTime();
        print("Quick sort took ns: " + (finish-start));
    }
}
