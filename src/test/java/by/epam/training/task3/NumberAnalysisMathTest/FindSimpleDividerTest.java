package by.epam.training.task3.NumberAnalysisMathTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task3.NumberAnalysisMath.NumberAnalysisMath;

import java.util.Scanner;

public class FindSimpleDividerTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Viewer.print("simple dividers of " + number
                + " " + NumberAnalysisMath.findSimpleDividersAsString(number));
        Viewer.print("simple dividers of " + number
                + " " + NumberAnalysisMath.findSimpleDividersAsSet(number));
    }
}
