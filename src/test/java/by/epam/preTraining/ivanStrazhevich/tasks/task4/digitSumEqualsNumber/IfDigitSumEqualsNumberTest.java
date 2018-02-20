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
        long digitSum = 0;

        Viewer.print(" It is " + IfDigitSumEqualsNumber.countDigitsSumRecursion(number, sum, digitSum)
                + " that sum of digits in number " + number + " equals " + sum + " with recursion");
        Viewer.print(" It is " + IfDigitSumEqualsNumber.countDigitsSumCycle(number, sum)
                + " that sum of digits in number " + number + " equals " + sum + " with cycle");
    }

}
