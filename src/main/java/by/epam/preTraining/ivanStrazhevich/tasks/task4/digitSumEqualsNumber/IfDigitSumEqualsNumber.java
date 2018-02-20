package by.epam.preTraining.ivanStrazhevich.tasks.task4.digitSumEqualsNumber;

public class IfDigitSumEqualsNumber {
    public static boolean countDigitsSumRecursion(long number, long sum, long digitSum) {
        if (number > 0) {
            digitSum += number % 10;
            return ( countDigitsSumRecursion(number / 10, sum, digitSum) );
        } else {
            return digitSum == sum;
        }
    }
}
