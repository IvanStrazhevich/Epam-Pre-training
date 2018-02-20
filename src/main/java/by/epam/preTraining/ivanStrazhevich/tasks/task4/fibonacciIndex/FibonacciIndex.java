package by.epam.preTraining.ivanStrazhevich.tasks.task4.fibonacciIndex;

public class FibonacciIndex {
    public static int findFibonacciByIndex(long index) {
        if (index <= 0) {
            return -1;
        } else if (index == 1) {
            return 0;
        } else if (index == 2) {
            return 1;
        } else {
            return findFibonacciByIndex(index - 1) + findFibonacciByIndex(index - 2);
        }
    }
}

