package by.epam.training.logic.task4.power;

public class Power {
    public static double countPowerRecursion(double number, long power) {
        if (power != 0) {
            if (power > 0) {
                return ( number * countPowerRecursion(number, ( Math.abs(power) - 1 )) );
            } else {
                return 1 / ( number * countPowerRecursion(number, ( Math.abs(power) - 1 )) );
            }
        } else {
            return 1;
        }
    }

    public static double countPowerCycle(double number, long power) {
        double result = 1;
        if (power != 0) {
            if (power > 0) {
                while (power > 0) {
                    result *= number;
                    power -= 1;
                }
            } else {
                power = Math.abs(power);
                while (power > 0) {
                    result *= number;
                    power -= 1;
                }
                result = 1 / result;
            }
            return result;
        } else {
            return result;
        }
    }

}
