package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IStack;

public interface IVehicleStackRepositoryFactory<T> {
    IStack<T> fillVehicleStackRepository(int vehicleQuantity);
}
