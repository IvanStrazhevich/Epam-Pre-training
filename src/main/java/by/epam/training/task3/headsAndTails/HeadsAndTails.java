package by.epam.training.task3.headsAndTails;

import java.util.Random;

public class HeadsAndTails {
    public static final int SIDES = 2;

    public static int getHeadsNumber(int attempts) {
        int heads = 0;
        int i = 0;
        Random random = new Random();

        while (i < attempts) {
            if (random.nextInt((SIDES)) == 1) {
                heads++;
            }
            i++;
        }
        return heads;
    }
}
