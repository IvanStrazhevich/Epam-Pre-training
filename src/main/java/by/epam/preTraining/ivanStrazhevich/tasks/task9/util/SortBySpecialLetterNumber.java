package by.epam.preTraining.ivanStrazhevich.tasks.task9.util;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Word;

import java.util.Comparator;

public class SortBySpecialLetterNumber implements Comparator<Word> {
    @Override
    public int compare(Word o1, Word o2) {
        return o1.getLetterNumbers() - o2.getLetterNumbers();
    }
}
