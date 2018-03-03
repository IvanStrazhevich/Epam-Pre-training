package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.IStack;

import java.util.LinkedList;

public class ListBasedStack<T> implements IStack<T> {
    LinkedList<T> stackList;
    int size;

    public ListBasedStack(int size) {
        this.stackList = new LinkedList<T>();
        this.size = size;
    }

    @Override
    public boolean push(Object element) {
        stackList.addLast((T) element);
        return true;
    }

    @Override
    public Object pop() {
        return stackList.getLast();
    }

    @Override
    public Object peek() {
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
