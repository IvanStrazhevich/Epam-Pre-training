package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces;

public interface Repositoryable<T> {
    T[] extendArray(T[] extendingArray, int oldLength);

    T[] addToArray(T element, T[] array, boolean resizable);

    Object peek();

    int size();

    boolean isEmpty();

    boolean isFull();

    Object[] getArrayOfElements();
}

