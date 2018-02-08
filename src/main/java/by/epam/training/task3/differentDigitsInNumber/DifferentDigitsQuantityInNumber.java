package by.epam.training.task3.differentDigitsInNumber;

public class DifferentDigitsQuantityInNumber {
    public static int countDifferentDigits(long number) {
        long digit;
        long cDigit;
        long exist = 0;
        long cExist;
        boolean isEmpty = true;
        int diff = 0;
        while (number > 0) {
            digit = number % 10;
            boolean b = false;
            cExist = exist == 0 ? digit : exist;
            while (cExist > 0 || diff == 0) {
                cDigit = cExist / 10 < 1 ? -1 : cExist % 10;
                System.out.println("cDigit" + cDigit);
                if (digit != cDigit) {
                    System.out.println("digit != cDigit");
                    b = true;
                    cExist = cExist / 10;
                    if (isEmpty) {
                        break;
                    }
                } else {
                    b = false;
                    break;
                }
            }
            if (b == true) {
                exist = (long)(exist + digit *  Math.pow(10, diff++));
                isEmpty=false;
                System.out.println("exist" + exist);
            }
            number = number / 10;
        }
        return diff;
    }
}

