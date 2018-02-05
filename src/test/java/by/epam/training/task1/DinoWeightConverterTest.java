package by.epam.training.task1;

import by.epam.training.task1.DinoWeightConverter;
import by.epam.training.task2.Viewer;

public class DinoWeightConverterTest {

    public static void main(String[] args) {
        double g = 135.2;

        Viewer.print(DinoWeightConverter.convertGrammToKg(g));
        Viewer.print(DinoWeightConverter.convertGrammToTons(g));

    }
}
