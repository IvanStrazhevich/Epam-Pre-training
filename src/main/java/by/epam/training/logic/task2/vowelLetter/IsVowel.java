package by.epam.training.logic.task2.vowelLetter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsVowel {
    private static boolean checkIfLetter(String letter) {
        Character cl = letter.charAt(0);
        return Character.isLetter(cl);
    }

    public static boolean checkLetterCycle(String letter) {
        boolean b = false;
        if (checkIfLetter(letter)) {
            String[] vowels = {"a", "e", "i", "o", "u", "y"};
            for (int i = 0; i < vowels.length; i++) {
                if (letter.equalsIgnoreCase(vowels[i])) {
                    b = true;
                    break;
                }
            }
        }
        return b;
    }

    public static boolean checkLetterSwitch(String letter) {
        boolean b = false;
        if (checkIfLetter(letter)) {
            switch (letter.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "y":
                    b = true;
            }
        }
        return b;
    }

    public static boolean checkLetterWithContains(String letter) {
        boolean b = false;
        if (checkIfLetter(letter)) {
            String letters = "aeiouy";
            b = letters.toLowerCase().contains(letter.toLowerCase());
        }
        return b;
    }

    public static boolean checkLetterWithRegexMatcher(String letter) {
        boolean b = false;
        if (checkIfLetter(letter)) {
            Matcher m = Pattern.compile("[aiueoy]").matcher(letter.toLowerCase());
            b = m.find();
        }
        return b;
    }
}
