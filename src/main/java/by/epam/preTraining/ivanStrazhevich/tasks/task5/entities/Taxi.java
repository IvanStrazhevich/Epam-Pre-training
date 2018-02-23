package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.WrongEntriesException;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public class Taxi extends Transport {
    private boolean hasTaxiLicence;

    public Taxi(IFareType iFareType, ITankType iTankType, IMovingWays iMovingWays, int id, String vehicleBrand,
                String model, int passengers, int cargoWeight, boolean hasTaxiLicence) {
        super(iFareType, iTankType, iMovingWays, id, vehicleBrand, model, passengers, cargoWeight);
        this.hasTaxiLicence = hasTaxiLicence;
    }

    public Taxi(boolean hasTaxiLicence) {
        this.hasTaxiLicence = hasTaxiLicence;
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
    public String toString() {
        return "Taxi{" + '\n' +
                "iFareType = " + super.getIFareType() +
                ", iTankType = " + super.getITankType() +
                ", iMovingWays =" + super.getIMovingWays() +
                ", id = " + super.getId() +
                ", vehicleBrand ='" + super.getVehicleBrand() + '\'' +
                ", model = '" + super.getModel() + '\'' +
                ", passengers = " + super.getPassengers() +
                ", cargoWeight = " + super.getCargoWeight() +
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
