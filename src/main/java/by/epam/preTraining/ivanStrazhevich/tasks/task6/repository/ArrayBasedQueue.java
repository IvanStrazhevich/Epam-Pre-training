package by.epam.preTraining.ivanStrazhevich.tasks.task6.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions.ExtendedEmptyQueueException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IQueue;

public class ArrayBasedQueue<T> implements IQueue<T> {
    protected Object[] queueOfElements;
    protected int queueSize;
    protected int incrementSize;
    protected boolean resizable;

    public ArrayBasedQueue(int size, boolean resizable) {
        if (size < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        }
        this.queueOfElements = new Object[size];
        this.queueSize = size;
        this.incrementSize = 2;
        this.resizable = resizable;
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
    public boolean enqueue(Object element) {
        int i = 0;
        for (Object existElement : queueOfElements
                ) {
            if (existElement != null) {
                i++;
            } else if (queueOfElements.length - 1 == i && resizable) {
                queueOfElements = extendArray(queueOfElements, queueOfElements.length);
                queueOfElements[i] = element;
                return true;
            } else {
                queueOfElements[i] = element;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object dequeue() throws ExtendedEmptyQueueException {
        if (isEmpty()) {
            throw new ExtendedEmptyQueueException("Queue is empty, return null");
        } else {
            Object result = queueOfElements[0];
            for (int i = 0; i < queueOfElements.length-1; i++) {
                queueOfElements[i] = queueOfElements[i + 1];
            }
            return result;
        }
    }


    @Override
    public Object peek() throws ExtendedEmptyQueueException {
        if (isEmpty()) {
            throw new ExtendedEmptyQueueException("Queue is empty, return null");
        } else {
            return queueOfElements[0];
        }
    }

    @Override
    public int size() {
        int i = 0;
        for (Object element : queueOfElements
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
        return size() == queueOfElements.length;
    }

    public Object[] getQueueOfElements() {
        return queueOfElements;
    }
}
