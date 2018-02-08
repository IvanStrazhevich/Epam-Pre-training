package by.epam.training.task3.differentDigitsInNumberTest;


import by.epam.training.task2.Viewer;
import by.epam.training.task3.differentDigitsInNumber.DifferentDigitsQuantityInNumber;

import java.util.Scanner;

public class DifferentDigitsQuantityInNumberTest {

    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        Viewer.print("There are " + DifferentDigitsQuantityInNumber.countDifferentDigits(number)
                + " in " + number);
    }

}
