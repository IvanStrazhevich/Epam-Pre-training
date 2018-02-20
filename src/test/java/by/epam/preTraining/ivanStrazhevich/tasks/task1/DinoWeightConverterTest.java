package by.epam.preTraining.ivanStrazhevich.tasks.task1;

import by.epam.preTraining.ivanStrazhevich.tasks.task1.DinoWeightConverter;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

public class DinoWeightConverterTest {

    public static void main(String[] args) {
        double g = 135.2;

        Viewer.print(DinoWeightConverter.convertGrammToKg(g));
        Viewer.print(DinoWeightConverter.convertGrammToTons(g));

    }
}
