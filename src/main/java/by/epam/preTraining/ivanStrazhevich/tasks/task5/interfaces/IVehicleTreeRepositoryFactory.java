package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Sortable;

public interface IVehicleTreeRepositoryFactory<T> {
    Sortable<T> fillVehicleRepository(int vehicleQuantity);
}
