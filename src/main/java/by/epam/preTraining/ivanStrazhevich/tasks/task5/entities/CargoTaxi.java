package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.WrongEntriesException;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fareable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Movable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fillable;


public class CargoTaxi extends Taxi {
    private int cargoVolumeMeters;

    public CargoTaxi(Fareable fareType, Fillable tankType, Movable movingWays, int id,
                     String vehicleBrand, String model, int passengers, int cargoWeight, boolean hasTaxiLicence,
                     int cargoVolumeMeters) {
        super(fareType, tankType, movingWays, id, vehicleBrand, model, passengers, cargoWeight, hasTaxiLicence);
        this.cargoVolumeMeters = cargoVolumeMeters;
    }

    public CargoTaxi(CargoTaxi cargoTaxi) {
        super(cargoTaxi);
        this.cargoVolumeMeters = cargoTaxi.getCargoVolumeMeters();
    }

    public CargoTaxi() {
    }

    @Override
    public String takeFare(int passengersQuantity, int cargoWeightKg) {
        if (super.getIFareType() != null) {
            if (!( cargoWeightKg > super.getCargoWeight() || passengersQuantity > super.getPassengers() )) {
                return super.getIFareType().takeFare(passengersQuantity, cargoWeightKg);
            } else {
                return "There is no space at Cargo taxi";
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

    public int getCargoVolumeMeters() {
        return cargoVolumeMeters;
    }

    public void setCargoVolumeMeters(int cargoVolumeMeters) {
        this.cargoVolumeMeters = cargoVolumeMeters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof CargoTaxi )) return false;
        if (!super.equals(o)) return false;

        CargoTaxi cargoTaxi = (CargoTaxi) o;

        return cargoVolumeMeters == cargoTaxi.cargoVolumeMeters;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cargoVolumeMeters;
        return result;
    }

    @Override
    public String toString() {
        return "CargoTaxi{" + '\n' +
                super.toString() +
                ", cargoVolumeMeters = " + cargoVolumeMeters +
                '}' + '\n';
    }
}
