package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.EmptyStackExtendedException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.MaxSizeExceededException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.IStack;

public class ArrayBasedStack<T> extends AbstractRepository<T> implements IStack<T> {


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

    public ArrayBasedStack(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        }
        this.stackOfElements = new Object[size];
        this.stackSize = size;
        this.resizable = true;
        this.incrementSize = 2;
    }

    @Override
    public boolean push(Object element) {
        int i = 0;
        for (Object existElement : stackOfElements
                ) {
            if (existElement != null) {
                i++;
            } else if (i == stackOfElements.length - 1 && resizable) {
                stackOfElements = extendArray(stackOfElements, stackOfElements.length);
                stackOfElements[i] = element;
                return true;
            } else if (i == stackOfElements.length - 1 && !resizable) {
                try {
                    stackOfElements[i] = element;
                    throw new MaxSizeExceededException("Stack is full and not resizable");
                } catch (MaxSizeExceededException e) {
                    e.printStackTrace();
                    return true;
                }
            } else {
                stackOfElements[i] = element;
                return true;
            }
        }
        return false;
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

    public Object[] getStackOfElements() {
        return stackOfElements;
    }
}