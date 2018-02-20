package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.CargoFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.DiselTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.view.Viewer;


public class CargoTaxi extends Taxi {

    public CargoTaxi(IFareType iFareType, ITankType iTankType, IMovingWays iMovingWays,
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
        }
        return type;
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

        if (id != cargoTaxi.id) return false;
        if (passengers != cargoTaxi.passengers) return false;
        if (cargoWeight != cargoTaxi.cargoWeight) return false;
        if (iFareType != null ? !iFareType.equals(cargoTaxi.iFareType) : cargoTaxi.iFareType != null) return false;
        if (iTankType != null ? !iTankType.equals(cargoTaxi.iTankType) : cargoTaxi.iTankType != null)
            return false;
        if (iMovingWays != null ? !iMovingWays.equals(cargoTaxi.iMovingWays) : cargoTaxi.iMovingWays != null)
            return false;
        if (vehicleBrand != null ? !vehicleBrand.equals(cargoTaxi.vehicleBrand) : cargoTaxi.vehicleBrand != null)
            return false;
        return model != null ? model.equals(cargoTaxi.model) : cargoTaxi.model == null;
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
