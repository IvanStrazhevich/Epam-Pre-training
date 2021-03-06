package by.epam.preTraining.ivanStrazhevich.tasks.task3.NumberAnalysisMathTest;

import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;
import by.epam.preTraining.ivanStrazhevich.tasks.task3.numberAnalysisMath.NumberAnalysisMath;

import java.util.Scanner;

public class FindMinCommonMultiple {
    public static void main(String[] args) {
        Viewer.print("Enter natural number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Viewer.print("Min common multiple of " + number1 + " and " + number2
                + "  is " + NumberAnalysisMath.findMinCommonMultiple(number1, number2));
    }
}
