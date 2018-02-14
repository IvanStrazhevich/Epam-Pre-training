package by.epam.training.task3.perfectNumber;

public class PerfectNumberResolver {
    public static boolean findIfPerfectNumber(int number) {
        int dividersSum = 0;
        int halfNumber = number / 2;

<<<<<<< HEAD:src/main/java/by/epam/training/task3/perfectNumber/PerfectNumberResolver.java
        for (int divider = 1; divider <= halfNumber; divider++) {
=======
        for (int divider = 1; divider < halfNumber; divider++) {
>>>>>>> fe1ef64f2f61fd61c06f4d8a086c92f2ccfddded:src/main/java/by/epam/training/task3/perfectNumber/PerfectNumberResolver.java
            if (number % divider == 0) {
                dividersSum += divider;
            }
        }
        return dividersSum == number;
    }
}
