package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces;

public interface Queueable<T> {
    boolean enqueue(Object element);

    Object dequeue();

    Object peek();

    int size();

    boolean isEmpty();

    boolean isFull();

    Object[] getQueueOfElements();

}
