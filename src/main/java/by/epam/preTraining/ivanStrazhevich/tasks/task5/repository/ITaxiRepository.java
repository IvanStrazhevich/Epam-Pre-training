package by.epam.preTraining.ivanStrazhevich.tasks.task5.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportRepository;

public class ITaxiRepository<T> implements ITransportRepository<Taxi> {

    private Taxi[] vehicleRepository;

    public ITaxiRepository(Taxi[] vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public ITaxiRepository() {
        if (getVehicleRepository() == null) {
            vehicleRepository = new Taxi[10];
        }
    }

    private Taxi[] extendArray(Taxi[] extendingArray, int oldLength) {
        int size = ( oldLength ) * 2;
        int j = 0;
        Taxi[] arrayExtended = new Taxi[size];
        for (Taxi oldArrayElement : extendingArray
                ) {
            arrayExtended[j++] = oldArrayElement;
        }
        return arrayExtended;
    }

    @Override
    public int vehiclesAtRepository() {
        int i = 0;
        for (Taxi type : vehicleRepository
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
        for (Taxi type : vehicleRepository
                ) {
            if (type != null)
                i++;
        }
        return i == 0;
    }


    @Override
    public boolean add(Object element) {
        int i = 0;
        for (Taxi t : vehicleRepository
                ) {
            if (t != null) {
                i++;
            } else if (vehicleRepository.length == i) {
                vehicleRepository = extendArray(vehicleRepository, i);
            } else {
                vehicleRepository[i++] = (Taxi) element;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Object[] c) {
        int i = 0;
        int j = 0;

        for (Taxi t : vehicleRepository
                ) {
            if (t != null) {
                i++;
            } else if (vehicleRepository.length - i + c.length > vehicleRepository.length) {
                vehicleRepository = extendArray(vehicleRepository, vehicleRepository.length);
                for (Object cElement : c
                        ) {
                    vehicleRepository[i++] = (Taxi) cElement;
                    j++;
                }
                break;
            } else {
                for (Object cElement : c
                        ) {
                    if (cElement != null) {
                        vehicleRepository[i++] = (Taxi) cElement;
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

    public Taxi[] getVehicleRepository() {
        return vehicleRepository;
    }

}
