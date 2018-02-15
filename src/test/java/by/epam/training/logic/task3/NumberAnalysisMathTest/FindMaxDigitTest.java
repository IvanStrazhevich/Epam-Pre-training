package by.epam.training.logic.task3.NumberAnalysisMathTest;


import by.epam.training.view.Viewer;
import by.epam.training.logic.task3.numberAnalysisMath.NumberAnalysisMath;

import java.util.Scanner;

public class FindMaxDigitTest {

    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        Viewer.print("max digit is " + NumberAnalysisMath.findMaxDigit(number));
    }

}
