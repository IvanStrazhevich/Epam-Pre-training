package task2.moodResolver;

import java.util.Random;

public class MoodResolver {
    public static String guessMood() {
        String face = null;
        Random random = new Random();
        int m = random.nextInt(3);
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
