package by.epam.preTraining.ivanStrazhevich.tasks.task5.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportRepository;

public class AbstractRepository<T> implements ITransportRepository<T> {

    private Transport[] vehicleRepository;

    public AbstractRepository(Transport[] vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public AbstractRepository() {
        if (getVehicleRepository() == null) {
            vehicleRepository = new Transport[10];
        }
    }

    private Transport[] extendArray(Transport[] extendingArray, int oldLength) {
        int size = ( oldLength ) * 2;
        int j = 0;
        Transport[] arrayExtended = new Transport[size];
        for (Transport oldArrayElement : extendingArray
                ) {
            arrayExtended[j++] = oldArrayElement;
        }
        return arrayExtended;
    }

    @Override
    public int vehiclesAtRepository() {
        int i = 0;
        for (Transport type : vehicleRepository
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
        for (Transport type : vehicleRepository
                ) {
            if (type != null)
                i++;
        }
        return i == 0;
    }


    @Override
    public boolean add(Object element) {
        int i = 0;
        for (Transport t : vehicleRepository
                ) {
            if (t != null) {
                i++;
            } else if (vehicleRepository.length == i) {
                vehicleRepository = extendArray(vehicleRepository, i);
            } else {
                vehicleRepository[i++] = (Transport) element;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Object[] c) {
        int i = 0;
        int j = 0;

        for (Transport t : vehicleRepository
                ) {
            if (t != null) {
                i++;
            } else if (vehicleRepository.length - i + c.length > vehicleRepository.length) {
                vehicleRepository = extendArray(vehicleRepository, vehicleRepository.length);
                for (Object cElement : c
                        ) {
                    vehicleRepository[i++] = (Transport) cElement;
                    j++;
                }
                break;
            } else {
                for (Object cElement : c
                        ) {
                    if (cElement != null) {
                        vehicleRepository[i++] = (Transport) cElement;
                        j++;
                    }
                }
            }
        }
        return ( j == c.length );
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
    public boolean containsAll(Object[] c) {
        int i = 0;
        for (Object element : vehicleRepository
                ) {
            if (element != null) {
                for (Object o : c
                        ) {
                    if (o != null) {
                        if (element.equals(o)) {
                            i++;
                            break;
                        }
                    }
                }
            }
        }
        return i == c.length;
    }

    public Transport[] getVehicleRepository() {
        return vehicleRepository;
    }

}
