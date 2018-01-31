package task2.vowelLetter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsVowel {
    public static boolean checkIfLetter(String letter) {
        Character cl = letter.charAt(0);
        return Character.isLetter(cl);
    }

    public static String checkLetterCycle(String letter) {
        String result = "not a letter";
        if (checkIfLetter(letter)) {
            result = "cycle check: letter is consonant";
            String[] vowels = {"a", "e", "i", "o", "u", "y", "а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};
            for (int i = 0; i < vowels.length; i++) {
                if (!letter.equalsIgnoreCase(vowels[i])) {
                    continue;
                } else {
                    result = "cycle check: letter is vowel";
                    break;
                }
            }
            return result;
        } else {
            return result;
        }
    }

    public static String checkLetterSwitch(String letter) {
        String result = "not a letter";
        if (checkIfLetter(letter)) {
            switch (letter.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "y":
                case "э":
                case "а":
                case "е":
                case "ё":
                case "и":
                case "о":
                case "у":
                case "ы":
                case "ю":
                case "я":
                    result = "switch check: letter is vowel";
                    break;
                default:
                    result = "switch check: letter is consonant";
                    break;
            }
            return result;
        } else {
            return result;
        }
    }

    public static String checkLetterWithContains(String letter) {
        if (checkIfLetter(letter)) {
            String letters = "aeiouyаеёиоуыэюя";
            if (letters.toLowerCase().contains(letter.toLowerCase())) {
                return "contains method: letter is vowel";
            } else {
                return "contains method: letter is consonant";
            }
        } else {
            return "not a letter";
        }
    }

    public static String checkLetterWithRegexMatcher(String letter) {
        if (checkIfLetter(letter)) {
            Matcher m = Pattern.compile("[aiueoаеёиоуыэюя]").matcher(letter.toLowerCase());
            if (m.find()) {
                return "matcher method: letter is vowel";
            } else {
                return "matcher method: letter is consonant";
            }
        } else {
            return "not a letter";
        }
    }
}
