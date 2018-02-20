package by.epam.preTraining.ivanStrazhevich.tasks.task4.hanoi;

import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Scanner;

public class HanoiTest {
    public static void main(String[] args) {
        Viewer.print("Enter number of rings: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char from = 'A';
        char to = 'B';
        char buff = 'C';
        StringBuffer stringBuffer = new StringBuffer();
        Viewer.print("Here is what to do ");
        Viewer.print(Hanoi.playHanoi(number, from, to, buff, stringBuffer));

    }
}
