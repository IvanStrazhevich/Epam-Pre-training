package by.epam.training.task2.moodResolverTest;

import by.epam.training.task2.Viewer;
import by.epam.training.task2.moodResolver.MoodResolver;

public class MoodResolverTest {
    public static void main(String[] args) {
        System.out.println("Now I'm guessing your mood!");

        Viewer.print(MoodResolver.guessMood());
    }
}
