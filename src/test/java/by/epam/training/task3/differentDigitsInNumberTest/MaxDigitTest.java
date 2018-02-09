package by.epam.training.task3.differentDigitsInNumberTest;


import by.epam.training.task2.Viewer;
import by.epam.training.task3.differentDigitsInNumber.MaxDigit;

import java.util.Scanner;

public class MaxDigitTest {

    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        Viewer.print("max digit is " + MaxDigit.findMaxDigit(number));
    }

}
