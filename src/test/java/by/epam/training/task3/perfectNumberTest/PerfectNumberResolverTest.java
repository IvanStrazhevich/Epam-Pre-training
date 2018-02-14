package by.epam.training.task3.perfectNumberTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task3.perfectNumber.PerfectNumberResolver;

import java.util.Scanner;

public class PerfectNumberResolverTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Viewer.print("Number " + number
                + "  is perfect " + PerfectNumberResolver.findIfPerfectNumber(number));
    }
}
