package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.WrongEntriesException;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public class PassengerTaxi extends Taxi {

    public PassengerTaxi(IFareType iFareType, ITankType iTankType, IMovingWays iMovingWays,
                         int id, String vehicleBrand, String model, int passengers, int cargoWeight) {
        super(iFareType, iTankType, iMovingWays, id, vehicleBrand, model, passengers, cargoWeight);
    }

    @Override
    public String takeFare(int passengersQuantity, int cargoWeightKg) {
        if (iFareType != null) {
            if (!( cargoWeightKg > cargoWeight || passengersQuantity > passengers )) {
                return iFareType.takeFare(passengersQuantity, cargoWeightKg);
            } else {
                return "There is no space at passenger taxi";
            }
        } else {
            try {
                throw new WrongEntriesException();
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
                throw new WrongEntriesException("Tank type for passenger taxi not chosen");
            } catch (WrongEntriesException e) {
                e.printStackTrace();
                return "Not filled";
            }
        }

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
    public String toString() {
        return "PassengerTaxi{" +
                "iFareType=" + iFareType +
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
