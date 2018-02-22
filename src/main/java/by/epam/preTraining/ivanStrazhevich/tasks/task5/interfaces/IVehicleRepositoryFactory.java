package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

public interface IVehicleRepositoryFactory<T> {
    ITransportRepository<T> fillVehicleRepository(int vehicleQuantity);
}
