package by.epam.preTraining.ivanStrazhevich.tasks.task6.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions.ExtendedEmptyStackException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IStack;

import java.util.LinkedList;

public class ListBasedStack<T> implements IStack<T> {
    LinkedList<T> stackList;
    int size;

    public ListBasedStack(int size) {
        this.stackList = new LinkedList<T>();
        this.size = size;
    }

    @Override
    public boolean push(Object o) {
        stackList.addLast((T) o);
        return true;
    }

    @Override
    public Object pop() throws ExtendedEmptyStackException {
        return stackList.getLast();
    }

    @Override
    public Object peek() throws ExtendedEmptyStackException {
        return stackList.peekLast();
    }

    @Override
    public int size() {
        return stackList.size();
    }

    @Override
    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object[] getStackOfElements() {
        return stackList.toArray();
    }
}
