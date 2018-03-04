package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces;

public interface Repositoryable<T> {
    Object[] extendArray(T[] extendingArray, int oldLength);

    Object[] addToArray(Object element, Object[] array, boolean resizable);

    Object peek();

    int size();

    boolean isEmpty();

    boolean isFull();

    Object[] getArrayOfElements();
}

