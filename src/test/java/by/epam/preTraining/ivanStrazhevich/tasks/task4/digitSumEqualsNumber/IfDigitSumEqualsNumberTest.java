package by.epam.preTraining.ivanStrazhevich.tasks.task4.digitSumEqualsNumber;

import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Scanner;

public class IfDigitSumEqualsNumberTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        Viewer.print("Enter natural sum: ");
        long sum = scanner.nextLong();

        Viewer.print(" Is " + IfDigitSumEqualsNumber.checkNumberDigitSumEqualsSum(number, sum)
                + " that sum of digits in number " + number + " equals " + sum);
    }

}
