package by.epam.preTraining.ivanStrazhevich.tasks.task4.fibonacciIndex;

public class FibonacciIndex {
    public static long findFibonacciByIndex(long index, long result) {
        if (index <= 0) {
            result= -1;
        } else if (index == 1) {
            result = 0;
        } else if (index == 2) {
            result = 1;
        } else {
            return findFibonacciByIndex(index - 1, result) + findFibonacciByIndex(index - 2, result);
        } return  result;
    }
}

