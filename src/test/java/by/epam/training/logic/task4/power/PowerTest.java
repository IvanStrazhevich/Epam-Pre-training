package by.epam.training.logic.task4.power;

import by.epam.training.view.Viewer;

import java.util.Scanner;

public class PowerTest {
    public static void main(String[] args) {
        Viewer.print("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        Viewer.print("Enter whole power: ");
        long power = scanner.nextLong();

        Viewer.print("Power " + power + " of number " + number
                + " is " + Power.countPowerRecursion(number, power)
                + " Recursion used");
        Viewer.print("Power " + power + " of number " + number
                + " is " + Power.countPowerCycle(number, power)
                + " Cycle used");
    }
}
