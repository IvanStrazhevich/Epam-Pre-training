package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import java.util.Collection;

public interface ITransportRepository<T> {


    boolean add(Object element);

    boolean addAll(Object[] c);

    boolean addAll(Collection c);

    int elementsAtRepository();

    boolean isEmpty();

    Object get(int index);

    void remove(int index);

    boolean removeAll();

    boolean contains(Object o);

    boolean containsAll(Object[] c);

    boolean containsAll(Collection c);

    Object[] getRepository();

}
