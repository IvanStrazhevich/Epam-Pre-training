package by.epam.training.task3.differentDigitsInNumberTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task3.differentDigitsInNumber.NumberAnalysisMath;

import java.util.Scanner;

public class GetMinCommonMultiple {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Viewer.print("Min common multiple of " + number1 + " and " + number2
                + "  is " + NumberAnalysisMath.getMinCommonMultiple(number1, number2));
    }
}
