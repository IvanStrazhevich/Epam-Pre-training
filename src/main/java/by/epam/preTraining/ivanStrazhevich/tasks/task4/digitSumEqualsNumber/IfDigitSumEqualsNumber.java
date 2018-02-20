package by.epam.preTraining.ivanStrazhevich.tasks.task4.digitSumEqualsNumber;

public class IfDigitSumEqualsNumber {
    public static boolean countDigitsSumRecursion(long number, long sum, long digitSum) {
        number = Math.abs(number);
        sum = Math.abs(sum);
        if (number > 0) {
            digitSum += number % 10;
            return ( countDigitsSumRecursion(number / 10, sum, digitSum) );
        } else {
            return digitSum == sum;
        }
    }

    public static boolean countDigitsSumCycle(long number, long sum) {
        number = Math.abs(number);
        sum = Math.abs(sum);
        long digitSum = 0;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }
        return digitSum == sum;
    }
}


