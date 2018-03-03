package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces;

public interface Stackable<T> extends Repositoryable<T>{
    boolean push(Object o);

    Object pop();
}
