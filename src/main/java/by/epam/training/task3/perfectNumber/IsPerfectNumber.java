package by.epam.training.task3.perfectNumber;

public class IsPerfectNumber {
    public static boolean isPerfectNumber(int number) {

        int dividersSum = 0;
        for (int divider = 1; divider < number; divider++) {
            if (number % divider == 0) {
                dividersSum += divider;
            }
        }
        return dividersSum == number;
    }
}
