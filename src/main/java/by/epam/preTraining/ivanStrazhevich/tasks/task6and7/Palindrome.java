package by.epam.preTraining.ivanStrazhevich.tasks.task6and7;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository.ArrayBasedStack;

public class Palindrome {
    public static boolean checkPalindrome(String string) {
        char[] parsedString = string.toCharArray();
        boolean b = false;
        ArrayBasedStack charStack = new ArrayBasedStack(parsedString.length, true);
        for (char aParsedStringEl : parsedString) {
            charStack.push(aParsedStringEl);
        }
        for (char aParsedString : parsedString) {
            if (charStack.pop().equals(aParsedString)) {      // as long as pop() uses for() cycle inside,
                b = true;                                       // complexity of algorithm is O(N*N)
            } else {                                            // in case we don't know what inside pop() it will be O(N)
                b = false;
                break;
            }
        }
        return b;
    }
}
