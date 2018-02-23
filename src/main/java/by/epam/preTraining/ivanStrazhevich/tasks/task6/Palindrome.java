package by.epam.preTraining.ivanStrazhevich.tasks.task6;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportStack;

public class Palindrome {
    public static boolean checkPalindrome(String string) {

        char[] parsedString = string.toCharArray();
        int stringLength = parsedString.length;
        boolean b = false;
        TransportStack charStack = new TransportStack(stringLength);
        for (int i = 0; i < stringLength; i++) {
            charStack.push(parsedString[i]);
        }
        for (int i = 0; i < stringLength; i++) {
            if (charStack.pop().equals(parsedString[i])) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }
}
