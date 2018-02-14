package by.epam.training.task3.NumberAnalysisMathTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task3.numberAnalysisMath.NumberAnalysisMath;

import java.util.Scanner;

public class FindMaxCommonDivider {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Viewer.print("Max common divider of " + number1 + " and " + number2
                + "  is " + NumberAnalysisMath.findMaxCommonDivider(number1, number2));
    }
}
