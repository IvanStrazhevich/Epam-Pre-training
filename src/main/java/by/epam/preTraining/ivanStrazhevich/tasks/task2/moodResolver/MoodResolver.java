package by.epam.preTraining.ivanStrazhevich.tasks.task2.moodResolver;

import java.util.Random;

public class MoodResolver {
    public static final String[] QUANTITY_OF_MOOD_VARIETY ={":)", ":|", ":("};
    public static String guessMood() {
        Random random = new Random();
        return QUANTITY_OF_MOOD_VARIETY[random.nextInt((QUANTITY_OF_MOOD_VARIETY.length))];

    }
}
