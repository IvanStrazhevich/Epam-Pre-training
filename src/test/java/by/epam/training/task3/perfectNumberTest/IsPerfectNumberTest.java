package by.epam.training.task3.perfectNumberTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task3.perfectNumber.IsPerfectNumber;

import java.util.Scanner;

public class IsPerfectNumberTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Viewer.print("Number " + number
                + "  is perfect " + IsPerfectNumber.isPerfectNumber(number));
    }
}
