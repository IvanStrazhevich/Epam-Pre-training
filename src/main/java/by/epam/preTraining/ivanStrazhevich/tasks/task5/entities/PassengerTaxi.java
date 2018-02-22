package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

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
    public String toString() {
        return "PassengerTaxi{" + '\n' +
                "iFareType = " + super.getIFareType() +
                ", iTankType = " + super.getITankType() +
                ", iMovingWays =" + super.getIMovingWays() +
                ", id = " + super.getId() +
                ", vehicleBrand ='" + super.getVehicleBrand() + '\'' +
                ", model = '" + super.getModel() + '\'' +
                ", passengers = " + super.getPassengers() +
                ", cargoWeight = " + super.getCargoWeight() +
                '}' + '\n';
    }
}
