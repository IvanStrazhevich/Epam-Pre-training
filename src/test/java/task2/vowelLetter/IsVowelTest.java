package task2.vowelLetter;

import task2.Viewer;

import java.util.Scanner;

public class IsVowelTest {
    public static void main(String[] args) {
        System.out.println("Enter any letter: ");
        String age = new Scanner(System.in).next();
        Viewer.print(IsVowel.checkLetter(age));
    }
}
