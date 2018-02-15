package by.epam.training.logic.task4.digitSumEqualsNumber;

import by.epam.training.WrongEntriesException;

public class IfDigitSumEqualsNumber {
    private static long countDigitsSumRecursion(long number) {
        if (number > 0) {
            return number % 10 + countDigitsSumRecursion(number / 10);
        } else {
            return number;
        }
    }

    public static boolean checkNumberDigitSumEqualsSum(long number, long sum) {
        if (!( number < 0 || sum < 0 )) {
            return countDigitsSumRecursion(number) == sum;
        } else {
            try {
                throw new WrongEntriesException("Enter numbers more or equals then 0");
            } catch (WrongEntriesException e) {
                e.printStackTrace();
            }
            return false;
        }
    }
}
