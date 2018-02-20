package by.epam.preTraining.ivanStrazhevich.tasks.task2.moodResolverTest;

import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;
import by.epam.preTraining.ivanStrazhevich.tasks.task2.moodResolver.MoodResolver;

public class MoodResolverTest {
    public static void main(String[] args) {
        System.out.println("Now I'm guessing your mood!");

        Viewer.print(MoodResolver.guessMood());
    }
}
