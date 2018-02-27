package by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces;

public interface IQueue<T> {
    boolean enqueue(Object element);

    Object dequeue();

    Object peek();

    int size();

    boolean isEmpty();

    boolean isFull();

    Object[] getQueueOfElements();

}
