package by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions.MaxSizeExceededException;

public interface IStack<T> {
    boolean push(Object o);
    Object pop();
    Object peek();
    int stackSize();
    boolean isEmpty();
    boolean isFull();
    Object[] getStackOfElements();
}
