package by.epam.preTraining.ivanStrazhevich.tasks.task4.fibonacciIndex;

public class FibonacciIndex {
    public static long findFibonacciByIndexRecursion(long index) {
        if (index > 2) {
            return findFibonacciByIndexRecursion(index - 1) + findFibonacciByIndexRecursion(index - 2);
        } else {
            return index <= 0 ? -1 : --index;
        }
    }

    public static long findFibonacciByIndexCycle(long index) {
        long sum = 0;
        long n1 = 0;
        long n2 = 1;
        if (index > 2) {
            for (int i = 2; i < index; i++) {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
            return sum;
        } else {
            return index <= 0 ? -1 : index - 1;
        }
    }
}

