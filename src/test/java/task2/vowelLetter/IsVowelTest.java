package task2.vowelLetter;

import task2.Viewer;

import java.util.Scanner;

public class IsVowelTest {
    public static void main(String[] args) {
        Viewer.print("Enter any letter: ");
        String letter = new Scanner(System.in).next();

        Viewer.print(IsVowel.checkLetterCycle(letter));
        Viewer.print(IsVowel.checkLetterSwitch(letter));
        Viewer.print(IsVowel.checkLetterWithContains(letter));
        Viewer.print(IsVowel.checkLetterWithRegexMatcher(letter));
    }
}
