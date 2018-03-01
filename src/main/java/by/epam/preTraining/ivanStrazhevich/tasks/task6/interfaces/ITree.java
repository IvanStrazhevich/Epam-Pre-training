package by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces;

public interface ITree<T> {
    boolean add(Object element);

    Object[] showOrderedElementsArray();

    boolean contains(Object element);

    boolean removeElement(Object element);

    void clear();

    int count();
}
