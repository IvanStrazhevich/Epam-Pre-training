package by.epam.preTraining.ivanStrazhevich.tasks.task4.fibonacciIndex;

import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Scanner;

public class FibonacciIndexTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long result = 0;

        Viewer.print("Number Fibonacci for index " + number + " is "
                + FibonacciIndex.findFibonacciByIndex(number, result)
                + " Recursion used");
    }
}
