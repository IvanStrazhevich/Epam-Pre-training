package by.epam.training.logic.task1;

import by.epam.training.view.Viewer;

public class DinoWeightConverterTest {

    public static void main(String[] args) {
        double g = 135.2;

        Viewer.print(DinoWeightConverter.convertGrammToKg(g));
        Viewer.print(DinoWeightConverter.convertGrammToTons(g));

    }
}
