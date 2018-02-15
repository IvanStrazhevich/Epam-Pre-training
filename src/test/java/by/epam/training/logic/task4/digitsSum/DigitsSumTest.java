package by.epam.training.logic.task4.digitsSum;


import by.epam.training.view.Viewer;

import java.util.Scanner;

public class DigitsSumTest {

    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        Viewer.print("Sum of digits is " + DigitsSum.countDigitsSumRecursion(number)
                + " in " + number + " Recursion used");
        Viewer.print("Sum of digits is " + DigitsSum.countDigitsSumCycle(number)
                + " in " + number + " Cycle used");
    }

}
