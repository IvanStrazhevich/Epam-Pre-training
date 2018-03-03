package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.ITree;

public interface IVehicleTreeRepositoryFactory<T> {
    ITree<T> fillVehicleRepository(int vehicleQuantity);
}
