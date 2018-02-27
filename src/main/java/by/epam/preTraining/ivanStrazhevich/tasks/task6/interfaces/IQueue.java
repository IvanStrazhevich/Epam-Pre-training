package by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions.ExtendedEmptyQueueException;

public interface IQueue<T> {
    boolean enqueue(Object element);
    Object dequeue() throws ExtendedEmptyQueueException;
    Object peek() throws ExtendedEmptyQueueException;
    int queueSize();
    boolean isEmpty();
    boolean isFull();
    Object[] getQueueOfElements();

}
