package by.epam.preTraining.ivanStrazhevich.tasks.task6.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions.ExtendedEmptyStackException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IStack;

public class ListBasedStack<T> implements IStack<T> {

    @Override
    public boolean push(Object o) {
        return false;
    }

    @Override
    public Object pop() throws ExtendedEmptyStackException {
        return null;
    }

    @Override
    public Object peek() throws ExtendedEmptyStackException {
        return null;
    }

    @Override
    public int stackSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object[] getStackOfElements() {
        return new Object[0];
    }
}
