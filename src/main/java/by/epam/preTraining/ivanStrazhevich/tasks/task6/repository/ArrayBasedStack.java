package by.epam.preTraining.ivanStrazhevich.tasks.task6.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions.ExtendedEmptyStackException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IStack;

public class ArrayBasedStack<T> implements IStack<T> {


    protected Object[] stackOfElements;
    protected int stackSize;
    protected int incrementSize;
    protected boolean resizable;

    public ArrayBasedStack(int size, boolean resizable) {
        if (size < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        }
        this.stackOfElements = new Object[size];
        this.stackSize = size;
        this.resizable = resizable;
        this.incrementSize = 2;
    }

    private Object[] extendArray(Object[] extendingArray, int oldLength) {
        int size = ( oldLength ) * incrementSize;
        int j = 0;
        Object[] arrayExtended = new Object[size];
        for (Object oldArrayElement : extendingArray
                ) {
            arrayExtended[j++] = oldArrayElement;
        }
        return arrayExtended;
    }

    @Override
    public boolean push(Object element) {
        int i = 0;
        for (Object existElement : stackOfElements
                ) {
            if (existElement != null) {
                i++;
            } else if (stackOfElements.length - 1 == i && resizable) {
                stackOfElements = extendArray(stackOfElements, stackOfElements.length);
                stackOfElements[i] = element;
                return true;
            } else {
                stackOfElements[i] = element;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object pop() throws ExtendedEmptyStackException {
        if (isEmpty()) {
            throw new ExtendedEmptyStackException(" Stack is empty, return null");
        } else {
            int lastIndex = stackSize() - 1;
            Object topElement = peek();
            Object[] copy = new Object[1];
            copy[0] = topElement;
            stackOfElements[lastIndex] = null;
            return copy[0];
        }
    }

    @Override
    public Object peek() throws ExtendedEmptyStackException {
        if (isEmpty()) {
            throw new ExtendedEmptyStackException("Stack is empty, return null");
        } else {
            return stackOfElements[stackSize() - 1];
        }
    }

    @Override
    public int stackSize() {
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
        return stackSize() == 0;
    }

    @Override
    public boolean isFull() {
        return stackSize() == stackOfElements.length;
    }

    public Object[] getStackOfElements() {
        return stackOfElements;
    }
}