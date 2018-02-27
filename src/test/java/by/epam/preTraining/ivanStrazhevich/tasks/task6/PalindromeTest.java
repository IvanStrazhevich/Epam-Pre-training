package by.epam.preTraining.ivanStrazhevich.tasks.task6;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IStack;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.repository.ArrayBasedStack;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Viewer.print("Enter any string: ");
        Scanner scanner = new Scanner(System.in);
        String string = ( scanner.next() );

        Viewer.print("String " + string + " is palindrome: " +
                Palindrome.checkPalindrome(string));
        IStack stack = new ArrayBasedStack(10, true);
    }
}
