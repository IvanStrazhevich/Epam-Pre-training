package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

public interface IVehicleRepositoryComplector<T> {
    ITransportRepository<T> fillVehicleRepository(int vehicleQuantity);
}
