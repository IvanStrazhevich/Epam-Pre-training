package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

public interface ITransportStack<T> {
    boolean push(Object o);
    Object pop();
    Object peek();
    int size();
    boolean isEmpty();
    boolean isFull();
}
