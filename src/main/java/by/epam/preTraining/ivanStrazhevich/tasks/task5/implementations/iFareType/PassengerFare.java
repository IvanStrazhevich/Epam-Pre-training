package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fareable;

public class PassengerFare implements Fareable {
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
