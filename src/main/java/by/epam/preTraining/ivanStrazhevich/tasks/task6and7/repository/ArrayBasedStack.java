package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.EmptyStackExtendedException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Stackable;

public class ArrayBasedStack<T> extends AbstractRepository<T> implements Stackable<T> {


    protected T[] stackOfElements;
    protected int stackSize;
    protected int incrementSize;
    protected boolean resizable;

    public ArrayBasedStack(int size, boolean resizable) {
        if (size < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        }
        this.stackOfElements = (T[]) new Object[size];
        this.stackSize = size;
        this.resizable = resizable;
        this.incrementSize = 2;
    }

    public ArrayBasedStack(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        }
        this.stackOfElements = (T[]) new Object[size];
        this.stackSize = size;
        this.resizable = true;
        this.incrementSize = 2;
    }

    public ArrayBasedStack() {
    }

    @Override
    public boolean push(Object element) {
        stackOfElements = addToArray((T) element, stackOfElements, resizable);
        return true;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            try {
                throw new EmptyStackExtendedException(" Stack is empty, return null");
            } catch (EmptyStackExtendedException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            int lastIndex = size() - 1;
            Object topElement = peek();
            Object[] copy = new Object[1];
            copy[0] = topElement;
            stackOfElements[lastIndex] = null;
            return copy[0];
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            try {
                throw new EmptyStackExtendedException("Stack is empty, return null");
            } catch (EmptyStackExtendedException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return stackOfElements[size() - 1];
        }
    }

    @Override
    public int size() {
        int i = 0;
        for (Object element : stackOfElements
                ) {
            if (element != null) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean isFull() {
        return size() == stackOfElements.length;
    }

    public Object[] getArrayOfElements() {
        return stackOfElements;
    }
}