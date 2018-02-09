package by.epam.training.task3.differentDigitsInNumberTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task3.differentDigitsInNumber.NumberAnalysisMath;

import java.util.Scanner;

public class IsSimpleTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        Viewer.print("number is simple " + NumberAnalysisMath.isSimple(number));
    }
}
