package by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces;

public interface IStack<T> {
    boolean push(Object o);

    Object pop();

    Object peek();

    int size();

    boolean isEmpty();

    boolean isFull();

    Object[] getStackOfElements();
}
