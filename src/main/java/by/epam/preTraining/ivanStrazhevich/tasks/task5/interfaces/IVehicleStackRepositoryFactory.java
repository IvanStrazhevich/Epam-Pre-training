package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.IStack;

public interface IVehicleStackRepositoryFactory<T> {
    IStack<T> fillVehicleStackRepository(int vehicleQuantity);
}
