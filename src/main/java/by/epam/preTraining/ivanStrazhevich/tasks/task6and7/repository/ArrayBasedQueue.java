package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.EmptyQueueExceptionExtended;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.MaxSizeExceededException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.IQueue;

public class ArrayBasedQueue<T> extends AbstractRepository implements IQueue<T> {
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
        int i = 0;
        for (Object existElement : queueOfElements
                ) {
            if (existElement != null) {
                i++;
            } else if (queueOfElements.length - 1 == i && resizable) {
                queueOfElements = extendArray(queueOfElements, queueOfElements.length);
                queueOfElements[i] = element;
                return true;
            } else if (i == queueOfElements.length - 1 && resizable==false) {
                try {
                    queueOfElements[i] = element;
                    throw new MaxSizeExceededException("Stack is full and not resizable");
                } catch (MaxSizeExceededException ex) {
                    ex.printStackTrace();
                    return true;
                }
            } else {
                queueOfElements[i] = element;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            try {
                throw new EmptyQueueExceptionExtended("Queue is empty, return null");
            } catch (EmptyQueueExceptionExtended e) {
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
                throw new EmptyQueueExceptionExtended("Queue is empty, return null");
            } catch (EmptyQueueExceptionExtended e) {
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

    public Object[] getQueueOfElements() {
        return queueOfElements;
    }
}
