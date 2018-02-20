package by.epam.preTraining.ivanStrazhevich.tasks.task1;


public class SwapVariablesTest {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println("Before switch a = " + a + " b = " + b);

        b += a;
        a = b - a;
        b = b - a;

        System.out.println("After switch a = " + a + " b = " + b);
    }
}
