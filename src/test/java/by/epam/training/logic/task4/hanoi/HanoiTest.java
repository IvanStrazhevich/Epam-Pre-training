package by.epam.training.logic.task4.hanoi;

import by.epam.training.view.Viewer;

import java.util.Scanner;

public class HanoiTest {
    public static void main(String[] args) {
        Viewer.print("Enter natural of rings: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char from = 'A';
        char to = 'B';
        char buff = 'C';
        Viewer.print("Here is what to do ");
        Hanoi.playHanoi(number, from, to, buff);

    }
}
