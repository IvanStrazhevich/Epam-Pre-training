package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;

public class CargoFare implements IFareType {
    @Override
    public void takeFare(int passengersQuantity, int cargoWeightKg) {
        System.out.println("Cargo of " + cargoWeightKg + " is loaded, and "
                + passengersQuantity + " are ridden"
        );
    }

    @Override
    public String toString() {
        return "CargoFare";
    }
}
