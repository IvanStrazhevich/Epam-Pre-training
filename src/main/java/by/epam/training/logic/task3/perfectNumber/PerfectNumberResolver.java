package by.epam.training.logic.task3.perfectNumber;

public class PerfectNumberResolver {
    public static boolean findIfPerfectNumber(int number) {
        int dividersSum = 0;
        int halfNumber = number / 2;

        for (int divider = 1; divider <= halfNumber; divider++) {
            if (number % divider == 0) {
                dividersSum += divider;
            }
        }
        return dividersSum == number;
    }
}
