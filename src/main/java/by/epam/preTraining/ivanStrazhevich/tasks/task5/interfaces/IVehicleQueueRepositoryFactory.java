package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IQueue;

public interface IVehicleQueueRepositoryFactory<T> {
    IQueue<T> fillVehicleQueueRepository(int vehicleQuantity);
}