package by.epam.training.task3.NumberAnalysisMathTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task3.NumberAnalysisMath.NumberAnalysisMath;

import java.util.Scanner;

public class FindIfSimpleTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        Viewer.print("number is simple " + NumberAnalysisMath.findIfSimple(number));
    }
}
