package test.java;

public class Test1n4 {

    public static void main(String[] args) {
        int n = 4321;
        int x4 = n / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        boolean b = false;
        if ((x1 < x2 && x2 < x3 && x3 < x4)
                || (x4 < x3 && x3 < x2 && x2 < x1)) {
            b = true;
        }
        System.out.println("Digits in " + n + " ordered by range is " + b);

    }
}
