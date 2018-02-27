package by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions.ExtendedEmptyStackException;

public interface IStack<T> {
    boolean push(Object o);
    Object pop() throws ExtendedEmptyStackException;
    Object peek() throws ExtendedEmptyStackException;
    int stackSize();
    boolean isEmpty();
    boolean isFull();
    Object[] getStackOfElements();
}
