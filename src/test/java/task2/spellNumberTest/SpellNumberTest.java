package task2.spellNumberTest;

import task2.Viewer;
import task2.spellNumber.SpellNumber;

import java.util.Scanner;

public class SpellNumberTest {
    public static void main(String[] args) {
        Viewer.print("Введите число от 0 до 999:");
        Integer number = new Scanner(System.in).nextInt();
        Viewer.print(SpellNumber.spellNumber(number));
    }
}
