package by.epam.training.task3.differentDigitsInNumberTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task3.differentDigitsInNumber.NumberAnalysisMath;

import java.util.Scanner;

public class GetSimpleDividerTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Viewer.print("simple dividers of " + number
                + " " + NumberAnalysisMath.getSimpleDividersAsString(number));
        Viewer.print("simple dividers of " + number
                + " " + NumberAnalysisMath.getSimpleDividersAsSet(number));
    }
}
