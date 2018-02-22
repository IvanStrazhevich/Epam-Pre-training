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
        if (iFareType != null) {
            if (!( cargoWeightKg > cargoWeight || passengersQuantity > passengers )) {
                return iFareType.takeFare(passengersQuantity, cargoWeightKg);
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
        if (iTankType != null) {
            return iTankType.fillTank(type);
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
    public IFareType getIFareType() {
        return iFareType;
    }

    @Override
    public void setIFareType(IFareType iFareType) {
        this.iFareType = iFareType;
    }

    @Override
    public ITankType getITankType() {
        return iTankType;
    }

    @Override
    public void setITankType(ITankType iTankType) {
        this.iTankType = iTankType;
    }

    @Override
    public IMovingWays getIMovingWays() {
        return iMovingWays;
    }

    @Override
    public void setIMovingWays(IMovingWays iMovingWays) {
        this.iMovingWays = iMovingWays;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    @Override
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
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
        return "CargoTaxi{" +
                "cargoVolumeMeters=" + cargoVolumeMeters +
                ", iFareType=" + iFareType +
                ", iTankType=" + iTankType +
                ", iMovingWays=" + iMovingWays +
                ", id=" + id +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                ", model='" + model + '\'' +
                ", passengers=" + passengers +
                ", cargoWeight=" + cargoWeight +
                '}';
    }
}
