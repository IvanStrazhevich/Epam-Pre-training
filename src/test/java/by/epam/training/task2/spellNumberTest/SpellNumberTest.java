package by.epam.training.task2.spellNumberTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task2.spellNumber.SpellNumber;

import java.util.Scanner;

public class SpellNumberTest {
    public static void main(String[] args) {
        Viewer.print("*** Название числа в виде строки ***");
        Viewer.print("Введите число от  0 до 999:");
        Integer number = new Scanner(System.in).nextInt();

        Viewer.print(SpellNumber.spellNumber(number));
    }
}