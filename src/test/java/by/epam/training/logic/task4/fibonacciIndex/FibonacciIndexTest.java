package by.epam.training.logic.task4.fibonacciIndex;

import by.epam.training.view.Viewer;

import java.util.Scanner;

public class FibonacciIndexTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        Viewer.print("Number Fibonacci for index " + number + " is "
                + FibonacciIndex.findFibonacciByIndex(number)
                + " Recursion used");
    }
}
