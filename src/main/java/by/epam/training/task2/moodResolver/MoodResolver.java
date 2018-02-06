package by.epam.training.task2.moodResolver;

import java.util.Random;

public class MoodResolver {
    public static final int QUANTITY_OF_MOOD_VARIETY =3;
    public static String guessMood() {
        String face = null;
        Random random = new Random();
        int m = random.nextInt(QUANTITY_OF_MOOD_VARIETY);
        if (m == 0) {
            face = ":)";
        } else if (m == 1) {
            face = ":|";
        } else {
            face = ":(";
        }
        return face;
    }
}
