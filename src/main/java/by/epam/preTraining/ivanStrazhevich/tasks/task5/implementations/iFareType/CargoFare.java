package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;

public class CargoFare implements IFareType {
    @Override
    public String takeFare(int passengersQuantity, int cargoWeightKg) {
        return ("Cargo of " + cargoWeightKg + " is loaded, and "
                + passengersQuantity + " are ridden"
        );
    }

    @Override
    public String toString() {
        return "CargoFare";
    }
}
