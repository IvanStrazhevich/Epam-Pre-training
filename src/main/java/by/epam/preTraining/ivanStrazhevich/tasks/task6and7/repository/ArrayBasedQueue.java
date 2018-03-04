package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.EmptyQueueExtendedException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Queueable;

public class ArrayBasedQueue<T> extends AbstractRepository<T> implements Queueable<T> {
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

    public ArrayBasedQueue(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        }
        this.queueOfElements = new Object[size];
        this.queueSize = size;
        this.incrementSize = 2;
        this.resizable = true;
    }


    @Override
    public boolean enqueue(Object element) {
        queueOfElements = addToArray(element, queueOfElements, resizable);
        return true;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            try {
                throw new EmptyQueueExtendedException("Queue is empty, return null");
            } catch (EmptyQueueExtendedException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            Object result = queueOfElements[0];
            for (int i = 0; i < queueOfElements.length - 1; i++) {
                queueOfElements[i] = queueOfElements[i + 1];
            }
            return result;
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            try {
                throw new EmptyQueueExtendedException("Queue is empty, return null");
            } catch (EmptyQueueExtendedException e) {
                e.printStackTrace();
                return null;
            }
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

    @Override
    public Object[] getArrayOfElements() {
        return queueOfElements;
    }
}
