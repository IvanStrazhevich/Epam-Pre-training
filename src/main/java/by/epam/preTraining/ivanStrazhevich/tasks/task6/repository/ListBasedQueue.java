package by.epam.preTraining.ivanStrazhevich.tasks.task6.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions.ExtendedEmptyQueueException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IQueue;

import java.util.LinkedList;

public class ListBasedQueue<T> implements IQueue<T> {
    LinkedList<T> queueList;
    int size;

    public ListBasedQueue(int size) {
        this.queueList = new LinkedList<T>();
        this.size = size;
    }

    @Override
    public boolean enqueue(Object element) {
        queueList.addLast((T) element);
        return true;
    }

    @Override
    public Object dequeue() throws ExtendedEmptyQueueException {
        return queueList.getFirst();
    }

    @Override
    public Object peek() throws ExtendedEmptyQueueException {
        return queueList.peekFirst();
    }

    @Override
    public int size() {
        return queueList.size();
    }

    @Override
    public boolean isEmpty() {
        return queueList.size() == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object[] getQueueOfElements() {
        return queueList.toArray();
    }
}
