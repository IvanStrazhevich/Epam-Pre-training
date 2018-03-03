package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

public interface RepositoryTransportFactory<T> {
    Garageable<T> fillVehicleRepository(int vehicleQuantity);
}
