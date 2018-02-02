package task2.nextDayIsTest;

import task2.nextDatePredictor.NextDayIs;
import task2.Viewer;

import java.util.Scanner;

public class NextDayIsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Viewer.print("Enter day:");
        Integer day = scanner.nextInt();
        Viewer.print("Enter month:");
        Integer month = scanner.nextInt();
        Viewer.print("Enter year:");
        Integer year = scanner.nextInt();

        Viewer.print(NextDayIs.getNextDay(day, month, year));
    }
}
