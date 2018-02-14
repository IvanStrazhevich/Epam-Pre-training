package by.epam.training.task3.NumberAnalysisMath;

import java.util.HashSet;

public class NumberAnalysisMath {
    public static int findMaxDigit(long number) {
        int digit;
        int maxDigit = 0;
        while (number > 0) {
            digit = (int) number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        return maxDigit;
    }

    public static boolean findIfPalindrome(long number) {
        long baseNumber = number;
        long mirrorNumber = 0;
        while (number > 0) {
            long digit = number % 10;
            mirrorNumber = mirrorNumber * 10 + digit;
            number /= 10;
        }
        return baseNumber == mirrorNumber;
    }

    public static boolean findIfSimple(long number) {
        boolean b;
        int dividers = 0;
        if (number > 2 && number % 2 != 0) {
            long halfNumber = number / 2;
            for (int i = 1; i <= halfNumber; i += 2) {
                if (number % i == 0) {
                    dividers++;
                }
            }
            b = dividers == 2;
        } else {
            b = number == 2 || number == 1;
        }
        return b;
    }

    public static String findSimpleDividersAsString(int number) {
        StringBuffer dividers = new StringBuffer();
        int halfNumber = number / 2;
        for (int divider = 1; divider <= halfNumber; divider += 2) {
            if (number % divider == 0) {
                if (findIfSimple(divider)) {
                    dividers.append(divider + ",");
                }
            }
        }
        return dividers.toString();
    }

    public static HashSet findSimpleDividersAsSet(int number) {
        HashSet dividersSet = new HashSet();
        int halfNumber = number / 2;
        for (long divider = 1; divider <= halfNumber; divider += 2) {
            if (number % divider == 0) {
                if (findIfSimple(divider)) {
                    dividersSet.add(divider);
                }
            }
        }
        return dividersSet;
    }

    public static int findMaxCommonDivider(int firstNumber, int secondNumber) {

        int maxDivider = 1;
        for (int i = 1; i <= firstNumber || i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                maxDivider = i;
            }
        }
        return maxDivider;
    }

    public static int findMinCommonMultiple(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber / findMaxCommonDivider(firstNumber, secondNumber);
    }


    public static int countDifferentDigits(long number) {
        long digit;
        long cDigit;
        long exist = 0;
        long cExist;
        boolean isEmpty = true;
        boolean hasZero = false;
        int diff = 0;
        while (number > 0) {
            digit = number % 10;
            boolean b = false;
            cExist = isEmpty ? digit : exist;
            while (cExist > 0 || isEmpty) {
                cDigit = cExist / 10 < 1 && isEmpty && !hasZero ? -1 : cExist % 10;
                if (digit != cDigit) {
                    b = true;
                    cExist = cExist / 10;
                    isEmpty = false;
                } else {
                    b = false;
                    break;
                }
                if (digit == 0) {
                    hasZero = true;
                }
            }
            if (b) {
                ++diff;
            }
            exist = ( exist * 10 + digit );
            number = number / 10;
        }
        return diff;
    }
}
