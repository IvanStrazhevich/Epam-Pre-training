package by.epam.training.task3.NumberAnalysisMathTest;


import by.epam.training.task2.Viewer;
import by.epam.training.task3.NumberAnalysisMath.NumberAnalysisMath;

import java.util.Scanner;

public class FindIfPalindromeTest {
    public static void main(String[] args) {
        Viewer.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        Viewer.print("The number is palindrom - " + NumberAnalysisMath.findIfPalindrome(number));
    }

}