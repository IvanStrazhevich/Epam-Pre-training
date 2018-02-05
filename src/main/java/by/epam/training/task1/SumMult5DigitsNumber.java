package by.epam.training.task1;

public class SumMult5DigitsNumber {

    public static int getDigitsSum(int n) {
        int x5 = n / 10000;
        int x4 = n % 10000 / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        return x1 + x2 + x3 + x4 + x5;
    }

    public static  int getDidgitsMultiplied(int n){
        int x5 = n / 10000;
        int x4 = n % 10000 / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        return  x1 * x2 * x3 * x4 * x5;
    }

}
