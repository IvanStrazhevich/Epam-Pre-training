package by.epam.preTraining.ivanStrazhevich.tasks.task4.digitsSum;

public class DigitsSum {
    public static long countDigitsSumRecursion(long number) {
        number = Math.abs(number);
        if (number > 0) {
            return number % 10 + countDigitsSumRecursion(number / 10);
        } else {
            return number;
        }
    }

    public static long countDigitsSumCycle(long number) {
        int sum = 0;
        number = Math.abs(number);
        if (number > 0) {
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
        }
        return sum;
    }
}
