package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces;

public interface Sortable<T> {
    boolean add(Object element);

    Object[] showOrderedElementsArray();

    boolean contains(Object element);

    boolean removeElement(Object element);

    void clear();

    int count();
}
