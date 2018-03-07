package by.epam.preTraining.ivanStrazhevich.tasks.task9.util;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Sentence;

import java.util.Comparator;

public class SortByWords implements Comparator<Sentence>{

    @Override
    public int compare(Sentence o1, Sentence o2) {
        return o1.getWordsNumber()-o2.getWordsNumber();
    }
}
