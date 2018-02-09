package by.epam.training.task3.differentDigitsInNumber;

public class DifferentDigitsQuantityInNumber {
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
            if (b == true) {
                ++diff;
            }
            exist = ( exist * 10 + digit );
            number = number / 10;
        }
        return diff;
    }
}

