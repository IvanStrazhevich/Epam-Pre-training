package task2.vowelLetter;

public class IsVowel {
    public static String checkLetter(String letter) {
        String result = "letter is vowel";
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        for (int i = 0; i < vowels.length; i++) {
            if (!letter.equals(vowels[i].toString())) {
                result = "letter is consonant";
            } else {
                break;
            }
        }

        return result;
    }
}
