package by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces;

public interface ITree<T> {
    boolean add(Object element);

    boolean contains(Object element);

    boolean remove(Object element);

    void clear();

    int count();
}
