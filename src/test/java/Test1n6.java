package test.java;

public class Test1n6 {

    public static void main(String[] args) {
        int n = 123456;

        int x6 = n / 100000;
        int x5 = n % 100000 / 10000;
        int x4 = n % 10000 / 1000;
        int x3 = n % 1000 / 100;
        int x2 = n % 100 / 10;
        int x1 = n % 10;
        double avr = (x1 + x2 + x3 + x4 + x5 + x6) / 6.0;
        double geoMean = Math.pow((x1 * x2 * x3 * x4 * x5 * x6), 6.0);

        System.out.println("Arithmetic avarage of " +n + " is " + avr);
        System.out.println("Geometric mean of " +n + " is " + geoMean);
    }
}
