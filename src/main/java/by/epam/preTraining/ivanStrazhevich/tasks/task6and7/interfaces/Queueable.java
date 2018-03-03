package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces;

public interface Queueable<T> extends Repositoryable<T>{
    boolean enqueue(Object element);

    Object dequeue();
}
