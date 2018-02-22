package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.WrongEntriesException;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;


public class CargoTaxi extends Taxi {
    int cargoVolumeMeters;

    public CargoTaxi(IFareType iFareType, ITankType iTankType, IMovingWays iMovingWays, int id,
                     String vehicleBrand, String model, int passengers, int cargoWeight,
                     int cargoVolumeMeters) {
        super(iFareType, iTankType, iMovingWays, id, vehicleBrand, model, passengers, cargoWeight);
        this.cargoVolumeMeters = cargoVolumeMeters;
    }

    public CargoTaxi(int cargoVolumeMeters) {
        this.cargoVolumeMeters = cargoVolumeMeters;
    }

    @Override
    public String takeFare(int passengersQuantity, int cargoWeightKg) {
        if (super.getIFareType() != null) {
            if (!( cargoWeightKg > super.getCargoWeight() || passengersQuantity > super.getPassengers() )) {
                return super.getIFareType().takeFare(passengersQuantity, cargoWeightKg);
            } else {
                return "There is no space at cargo taxi";
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
    public String fillTank(int type) {
        if (super.getITankType() != null) {
            return super.getITankType().fillTank(type);
        } else {
            try {
                throw new WrongEntriesException("Tank type for cargo taxi  not chosen");
            } catch (WrongEntriesException e) {
                e.printStackTrace();
                return "Not filled";
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
                ", iFareType = " + super.getIFareType() +
                ", iTankType = " + super.getITankType() +
                ", iMovingWays = " + super.getIMovingWays() +
                ", id = " + super.getId() +
                ", vehicleBrand = '" + super.getVehicleBrand() + '\'' +
                ", model = '" + super.getModel() + '\'' +
                ", passengers = " + super.getPassengers() +
                ", cargoWeight = " + super.getCargoWeight() +
                "cargoVolumeMeters = " + cargoVolumeMeters +
                '}' + '\n';
    }
}
