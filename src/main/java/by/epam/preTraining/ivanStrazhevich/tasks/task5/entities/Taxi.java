package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public abstract class Taxi extends Transport {
    public Taxi(IFareType iFareType, ITankType iTankType, IMovingWays iMovingWays,
                int id, String vehicleBrand, String model, int passengers, int cargoWeight) {
        super(iFareType, iTankType, iMovingWays, id, vehicleBrand, model, passengers, cargoWeight);
    }

    public Taxi() {
    }
}
