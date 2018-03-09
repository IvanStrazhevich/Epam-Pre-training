package by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;

public interface Convertable {
    Text sortWordsByQuantityOfSpecificLetter(Text text);
    Text sortTextBySentenceLength(Text text);
}
