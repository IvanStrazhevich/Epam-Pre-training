package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.view.Viewer;

public class PassengerTaxi extends Taxi {

    public PassengerTaxi(IFareType iFareType, ITankType iTankType, IMovingWays iMovingWays,
                         int id, String vehicleBrand, String model, int passengers, int cargoWeight) {
        super(iFareType, iTankType, iMovingWays, id, vehicleBrand, model, passengers, cargoWeight);
    }

    @Override
    public void takeFare(int passengersQuantity, int cargoWeightKg) {
        if (iFareType != null) {
            if (!( cargoWeightKg > cargoWeight && passengersQuantity > passengers )) {
                iFareType.takeFare(passengersQuantity, cargoWeightKg);
            } else {
                Viewer.print("There is no space");
            }
        }
    }

    @Override
    public int fillTank(int type) {
        if (iTankType != null) {
            type = iTankType.fillTank(type);
        } return type;
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
        if (!( o instanceof PassengerTaxi )) return false;
        if (!super.equals(o)) return false;

        PassengerTaxi that = (PassengerTaxi) o;

        if (id != that.id) return false;
        if (passengers != that.passengers) return false;
        if (cargoWeight != that.cargoWeight) return false;
        if (iFareType != null ? !iFareType.equals(that.iFareType) : that.iFareType != null) return false;
        if (iTankType != null ? !iTankType.equals(that.iTankType) : that.iTankType != null) return false;
        if (iMovingWays != null ? !iMovingWays.equals(that.iMovingWays) : that.iMovingWays != null) return false;
        if (vehicleBrand != null ? !vehicleBrand.equals(that.vehicleBrand) : that.vehicleBrand != null) return false;
        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ( iFareType != null ? iFareType.hashCode() : 0 );
        result = 31 * result + ( iTankType != null ? iTankType.hashCode() : 0 );
        result = 31 * result + ( iMovingWays != null ? iMovingWays.hashCode() : 0 );
        result = 31 * result + id;
        result = 31 * result + ( vehicleBrand != null ? vehicleBrand.hashCode() : 0 );
        result = 31 * result + ( model != null ? model.hashCode() : 0 );
        result = 31 * result + passengers;
        result = 31 * result + cargoWeight;
        return result;
    }
}
