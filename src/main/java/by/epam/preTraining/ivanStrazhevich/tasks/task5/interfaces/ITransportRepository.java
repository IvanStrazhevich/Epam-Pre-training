package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;


public interface ITransportRepository<T> {


    boolean add(Object element);

    boolean addAll(Object[] c);

    int vehiclesAtRepository();

    boolean isEmpty();

    Object get(int index);

    void remove(int index);

    boolean removeAll();

    boolean contains(Object o);

    boolean containsAll(Object[] c);

    Object[] getVehicleRepository();

}
