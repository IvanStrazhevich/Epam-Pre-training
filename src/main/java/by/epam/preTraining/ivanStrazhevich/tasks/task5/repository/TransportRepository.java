package by.epam.preTraining.ivanStrazhevich.tasks.task5.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportRepository;

import java.util.Collection;

public class TransportRepository<T> implements ITransportRepository<Transport> {

    private Object[] vehicleRepository;

    public TransportRepository(Object[] vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public TransportRepository(int size) {
               if (size < 0)
                        throw new IllegalArgumentException("Illegal Capacity: "+
                                                               size);
        this.vehicleRepository = new Object[size];
    }

    private Object[] extendArray(Object[] extendingArray, int oldLength) {
        int size = ( oldLength ) * 2;
        int j = 0;
        Object[] arrayExtended = new Object[size];
        for (Object oldArrayElement : extendingArray
                ) {
            arrayExtended[j++] = oldArrayElement;
        }
        return arrayExtended;
    }


    @Override
    public int elementsAtRepository() {
        int i = 0;
        for (Object type : vehicleRepository
                ) {
            if (type != null) {
                i++;
            }
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        int i = 0;
        for (Object type : vehicleRepository
                ) {
            if (type != null)
                i++;
        }
        return i == 0;
    }


    @Override
    public boolean add(Object element) {
        int i = 0;
        for (Object t : vehicleRepository
                ) {
            if (t != null) {
                i++;
            } else if (vehicleRepository.length == i) {
                vehicleRepository = extendArray(vehicleRepository, i);
            } else {
                vehicleRepository[i++] = element;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Object[] arrayFrom) {
        int i = 0;
        int j = 0;
        for (Object to : vehicleRepository
                ) {
            if (to != null) {
                i++;
            } else if (vehicleRepository.length - i + arrayFrom.length > vehicleRepository.length) {
                vehicleRepository = extendArray(vehicleRepository, vehicleRepository.length);
                for (Object from : arrayFrom
                        ) {
                    if (from != null) {
                        vehicleRepository[i++] = from;
                        j++;
                    }
                }
                break;
            } else {
                for (Object from : arrayFrom
                        ) {
                    if (from != null) {
                        vehicleRepository[i++] = from;
                        j++;
                    }
                }
            }
        }
        return j == arrayFrom.length;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] cCopy = c.toArray();
        return addAll(cCopy);
    }

    @Override
    public Object get(int index) {

        return vehicleRepository[index];
    }

    @Override
    public void remove(int index) {
        vehicleRepository[index] = null;
    }

    @Override
    public boolean removeAll() {
        int i = 0;
        for (Object o : vehicleRepository
                ) {
            if (o != null) {
                vehicleRepository[i++] = null;
            } else {
                i++;
            }
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for (Object element : vehicleRepository
                ) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Object[] arrayFrom) {
        int i = 0;
        int j = 0;
        for (Object elementChecking : arrayFrom
                ) {
            if (elementChecking != null) {
                for (Object elementFrom : vehicleRepository
                        ) {
                    if (elementFrom != null) {
                        if (elementChecking.equals(elementFrom)) {
                            i++;
                            break;
                        }
                    }
                }
            }
        }
        return i == arrayFrom.length;
    }

    @Override
    public boolean containsAll(Collection c) {
        Object[] cCopy = c.toArray();
        return containsAll(cCopy);
    }

    public Object[] getRepository() {
        return  vehicleRepository;
    }

}