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

    public PassengerTaxi() {
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
                '}'+'\n';
    }
}
