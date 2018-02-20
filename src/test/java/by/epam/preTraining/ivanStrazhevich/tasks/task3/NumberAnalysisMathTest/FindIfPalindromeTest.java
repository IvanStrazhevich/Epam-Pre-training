package by.epam.preTraining.ivanStrazhevich.tasks.task3.NumberAnalysisMathTest;


import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;
import by.epam.preTraining.ivanStrazhevich.tasks.task3.numberAnalysisMath.NumberAnalysisMath;

import java.util.Scanner;

public class FindIfPalindromeTest {
    public static void main(String[] args) {
        Viewer.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        Viewer.print("The number is palindrom - " + NumberAnalysisMath.findIfPalindrome(number));
    }

}
