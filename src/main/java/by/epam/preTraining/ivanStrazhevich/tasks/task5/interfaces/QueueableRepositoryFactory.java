package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Queueable;

public interface QueueableRepositoryFactory<T> {
    Queueable<T> fillVehicleQueueRepository(int vehicleQuantity);
}
