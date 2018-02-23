package by.epam.preTraining.ivanStrazhevich.tasks.task5.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportStack;

public class TransportStack<T> implements ITransportStack<T> {
    protected Object[] stackOfElements;
    protected int stackSize;
    protected int incrementSize;

    public TransportStack(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        this.stackOfElements = new Object[size];
        this.stackSize = size;
        this.incrementSize = 2;

    }

    private Object[] extendArray(Object[] extendingArray) {
        stackSize = ( stackSize ) * incrementSize;
        int i = 0;
        Object[] arrayExtended = new Object[stackSize];
        for (Object oldArrayElement : extendingArray
                ) {
            arrayExtended[i++] = oldArrayElement;
        }
        return arrayExtended;
    }

    @Override
    public boolean push(Object o) {
        int i = 0;
        for (Object existedElement : stackOfElements
                ) {
            if (existedElement != null) {
                i++;
            } else if (i > stackSize) {
                stackOfElements = extendArray(stackOfElements);
                stackOfElements[i++] = o;
                return true;
            } else {
                stackOfElements[i++] = o;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object pop() {
        int lastIndex = size() - 1;
        Object topElement = peek();
        Object[] copy = new Object[1];
        copy[0] = topElement;
        stackOfElements[lastIndex] = null;
        return copy[0];
    }

    @Override
    public Object peek() {
        return stackOfElements[size() - 1];
    }

    @Override
    public int size() {
        int i = 0;
        for (Object element : stackOfElements
                ) {
            if (element != null) {
                i++;
            }
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean isFull() {
        return size()==stackSize-1;
    }
}