package by.epam.preTraining.ivanStrazhevich.tasks.task3.headsAndTailsTest;

import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;
import by.epam.preTraining.ivanStrazhevich.tasks.task3.headsAndTails.HeadsAndTails;

import java.util.Scanner;

public class HeadsAndTailsTest {
    public static void main(String[] args) {
        Viewer.print("Enter number of attempts: ");
        Scanner scanner = new Scanner(System.in);
        int attempts = scanner.nextInt();
        int heads = HeadsAndTails.countHeadsNumber(attempts);
        Viewer.print("There was " + heads + " heads after " + attempts
                + " attempts and " + Math.abs(heads-attempts) + " tails");
    }
}
