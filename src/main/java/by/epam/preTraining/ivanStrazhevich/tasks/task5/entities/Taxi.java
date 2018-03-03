package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.WrongEntriesException;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fareable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Movable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fillable;

public class Taxi extends Transport {
    private boolean hasTaxiLicence;

    public Taxi(Fareable fareType, Fillable tankType, Movable movingWays, int id, String vehicleBrand,
                String model, int passengers, int cargoWeight, boolean hasTaxiLicence) {
        super(fareType, tankType, movingWays, id, vehicleBrand, model, passengers, cargoWeight);
        this.hasTaxiLicence = hasTaxiLicence;
    }

    public Taxi(Taxi taxi) {
        super(taxi);
        this.hasTaxiLicence = taxi.isHasTaxiLicence();
    }

    public Taxi() {
    }

    @Override
    public String takeFare(int passengersQuantity, int cargoWeightKg) {
        if (super.getIFareType() != null) {
            if (!( cargoWeightKg > super.getCargoWeight() || passengersQuantity > super.getPassengers() )) {
                return super.getIFareType().takeFare(passengersQuantity, cargoWeightKg);
            } else {
                return "There is no space at taxi";
            }
        } else {
            try {
                throw new WrongEntriesException("Fare type not chosen");
            } catch (WrongEntriesException e) {
                e.printStackTrace();
                return "Fare type not chosen";
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Taxi )) return false;
        if (!super.equals(o)) return false;

        Taxi taxi = (Taxi) o;

        return hasTaxiLicence == taxi.hasTaxiLicence;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ( hasTaxiLicence ? 1 : 0 );
        return result;
    }

    @Override
    public String toString() {
        return "Taxi{" + '\n' +
                super.toString() +
                ", hasTaxiLicence = " + hasTaxiLicence +
                '}' + '\n';
    }

    public boolean isHasTaxiLicence() {
        return hasTaxiLicence;
    }

    public void setHasTaxiLicence(boolean hasTaxiLicence) {
        this.hasTaxiLicence = hasTaxiLicence;
    }
}
