package test.java;

public class Test1n7 {

    public static void main(String[] args) {
        int n = 1234567;

        int x7 = n / 1000000;
        int x6 = n % 1000000 / 100000;
        int x5 = n % 100000 / 10000;
        int x4 = n % 10000 / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        int n2 = x1 * 1000000 + x2 * 100000 + x3 * 10000 + x4 * 1000 + x5 * 100 + x6 * 10 + x7;

        System.out.println(n + " after flip is " + n2);
    }
}
