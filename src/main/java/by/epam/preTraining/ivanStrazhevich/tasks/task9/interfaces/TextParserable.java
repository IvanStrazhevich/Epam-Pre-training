package by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;

public interface TextParserable<T> {
    T parseTextToSentences(T text);
    T parseTextToWords(T text);
}
