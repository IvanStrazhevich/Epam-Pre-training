package by.epam.preTraining.ivanStrazhevich.tasks.task4.digitsSum;

import by.epam.preTraining.ivanStrazhevich.tasks.WrongEntriesException;

public class DigitsSum {
    public static long countDigitsSumRecursion(long number) {
        if (number > 0) {
            return number % 10 + countDigitsSumRecursion(number / 10);
        } else {
            try {
                throw new WrongEntriesException("Enter number more then 0");
            } catch (WrongEntriesException e) {
                e.printStackTrace();
            }
            return number;
        }
    }

    public static long countDigitsSumCycle(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        try {
            throw new WrongEntriesException("Enter number more then 0");
        } catch (WrongEntriesException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
