package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Stackable;

public interface IVehicleStackRepositoryFactory<T> {
    Stackable<T> fillVehicleStackRepository(int vehicleQuantity);
}
