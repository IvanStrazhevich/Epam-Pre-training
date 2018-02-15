package by.epam.training.logic.task1;

import by.epam.training.view.Viewer;

public class SumMult5DigitsNumberTest {

    public static void main(String[] args) {
        int n = 12345;

        Viewer.print(" Sum of digits of " + n + " is "
                + SumMult5DigitsNumber.getDigitsSum(n));
        Viewer.print(" Multiply of digits of " + n + " is "
                + SumMult5DigitsNumber.getDidgitsMultiplied(n));

    }
}
