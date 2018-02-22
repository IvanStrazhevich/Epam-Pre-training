package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;

public class PassengerFare implements IFareType {
    @Override
    public String takeFare(int passengersQuantity, int cargoWeightKg) {
        return ("Riding " + passengersQuantity + " passengers, and "
                + cargoWeightKg + " kg of cargo ");
    }

    @Override
    public String toString() {
        return "PassengerFare";
    }
}
