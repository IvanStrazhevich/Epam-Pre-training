package by.epam.training.logic.task4.digitsSum;

public class DigitsSum {
    public static long countDigitsSumRecursion(long number) {
        if (number > 10) {
            return number % 10 + countDigitsSumRecursion(number / 10);
        } else {
            return number;
        }
    }

    public static long countDigitsSumCycle(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
