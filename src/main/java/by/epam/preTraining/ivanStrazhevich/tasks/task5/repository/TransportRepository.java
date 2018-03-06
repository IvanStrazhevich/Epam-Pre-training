package by.epam.preTraining.ivanStrazhevich.tasks.task5.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Garageable;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository.ArrayBasedStack;

import java.util.Collection;

public class TransportRepository<T> extends ArrayBasedStack<T> implements Garageable<T> {

    protected Transport[] vehicleRepository;

    public TransportRepository(Transport[] vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public TransportRepository(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Illegal Capacity: " +
                    size);
        this.vehicleRepository = new Transport[size];
    }

    public TransportRepository() {
    }

    @Override
    public int elementsAtRepository() {
        int i = 0;
        for (Object element : vehicleRepository
                ) {
            if (element != null) {
                i++;
            }
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        int i = 0;
        for (Object element : vehicleRepository
                ) {
            if (element != null)
                i++;
        }
        return i == 0;
    }


    @Override
    public boolean add(Object element) {
        int i = 0;
        for (Transport existElement : vehicleRepository
                ) {
            if (existElement != null) {
                i++;
            } else if (vehicleRepository.length - 1 == i) {
                vehicleRepository[i] = (Transport) element;
                vehicleRepository = (Transport[]) extendArray((T[]) vehicleRepository, vehicleRepository.length);
                return true;
            } else {
                vehicleRepository[i] = (Transport) element;
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
            } else if (vehicleRepository.length - 1 - i + arrayFrom.length > vehicleRepository.length) {
                vehicleRepository = (Transport[]) extendArray((T[]) vehicleRepository, vehicleRepository.length);
                for (Object from : arrayFrom
                        ) {
                    if (from != null) {
                        vehicleRepository[i++] = (Transport) from;
                        j++;
                    }
                }
                break;
            } else {
                for (Object from : arrayFrom
                        ) {
                    if (from != null) {
                        vehicleRepository[i++] = (Transport) from;
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

    @Override
    public Object[] getArrayOfElements() {
        return vehicleRepository;
    }

}
