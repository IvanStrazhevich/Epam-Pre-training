package by.epam.preTraining.ivanStrazhevich.tasks.task3.headsAndTails;

import java.util.Random;

public class HeadsAndTails {
    public static int countHeadsNumber(int attempts) {
        int heads = 0;
        Random random = new Random();

        for (int i = 0; i < attempts; i++) {
            if (random.nextBoolean()) {
                heads++;
            }
        }
        return heads;
    }
}
