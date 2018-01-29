package task1;

public class Test1n5 {

    public static void main(String[] args) {
        int n = 12345;

        int x5 = n / 10000;
        int x4 = n % 10000 / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        int sum = x1 + x2 + x3 + x4 + x5;
        int mult = x1 * x2 * x3 * x4 * x5;

        System.out.println(" Sum of digits of " + n + " is " + sum);
        System.out.println(" Multiply of digits of " + n + " is " + mult);

    }
}
