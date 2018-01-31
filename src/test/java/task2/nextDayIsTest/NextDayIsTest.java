package task2.nextDayIsTest;

import task2.NextDatePredictor.NextDayIs;
import task2.Viewer;

import java.util.Scanner;

public class NextDayIsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day:");

        Integer day = scanner.nextInt();
        System.out.println("Enter mounth:");
        Integer mounth = scanner.nextInt();
        System.out.println("Enter year:");
        Integer year = scanner.nextInt();

        Viewer.print(NextDayIs.getNextDay(day,mounth,year));
    }
}
