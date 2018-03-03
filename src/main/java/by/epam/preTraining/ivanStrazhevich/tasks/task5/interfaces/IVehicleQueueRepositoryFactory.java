package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Queueable;

public interface IVehicleQueueRepositoryFactory<T> {
    Queueable<T> fillVehicleQueueRepository(int vehicleQuantity);
}
