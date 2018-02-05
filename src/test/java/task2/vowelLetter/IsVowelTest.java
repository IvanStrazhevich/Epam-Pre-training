package task2.vowelLetter;

import task2.Viewer;

import java.util.Scanner;

public class IsVowelTest {
    public static void main(String[] args) {
        Viewer.print("Enter any latin letter: ");
        String letter = new Scanner(System.in).next();

        Viewer.print("This letter is latin vowel " + IsVowel.checkLetterCycle(letter) + " (cycle used)");
        Viewer.print("This letter is latin vowel " + IsVowel.checkLetterSwitch(letter) + " (switch used)");
        Viewer.print("This letter is latin vowel " + IsVowel.checkLetterWithContains(letter)+" (contains used)");
        Viewer.print("This letter is latin vowel " + IsVowel.checkLetterWithRegexMatcher(letter) + " (Matcher used)");
    }
}
