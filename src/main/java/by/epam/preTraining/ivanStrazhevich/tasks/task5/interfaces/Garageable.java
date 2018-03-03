package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Repositoryable;

import java.util.Collection;

public interface Garageable<T> extends Repositoryable {


    boolean add(Object element);

    boolean addAll(Object[] c);

    boolean addAll(Collection c);

    int elementsAtRepository();

    Object get(int index);

    void remove(int index);

    boolean removeAll();

    boolean contains(Object o);

    boolean containsAll(Object[] c);

    boolean containsAll(Collection c);

    Object [] getRepository();

}
