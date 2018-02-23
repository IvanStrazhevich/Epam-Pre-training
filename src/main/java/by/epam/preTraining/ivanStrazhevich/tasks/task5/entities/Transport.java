package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.WrongEntriesException;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IFareType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public abstract class Transport {
    private IFareType iFareType;
    private ITankType iTankType;
    private IMovingWays iMovingWays;
    private int id;
    private String vehicleBrand;
    private String model;
    private int passengers;
    private int cargoWeight;

    public String fillTank(int volume) {
        if (iTankType != null) {
            return iTankType.fillTank(volume);
        } else {
            try {
                throw new WrongEntriesException("Tank type for taxi not chosen");
            } catch (WrongEntriesException e) {
                e.printStackTrace();
                return "Not filled";
            }
        }

    }

    public abstract String takeFare(int passengersQuantity, int cargoWeightKg);

    public Transport(IFareType iFareType, ITankType iTankType, IMovingWays iMovingWays,
                     int id, String vehicleBrand, String model, int passengers, int cargoWeight) {
        this.iFareType = iFareType;
        this.iTankType = iTankType;
        this.iMovingWays = iMovingWays;
        this.id = id;
        this.vehicleBrand = vehicleBrand;
        this.model = model;
        this.passengers = passengers;
        this.cargoWeight = cargoWeight;
    }

    public Transport() {
    }

    public IFareType getIFareType() {
        return iFareType;
    }

    public void setIFareType(IFareType iFareType) {
        this.iFareType = iFareType;
    }

    public ITankType getITankType() {
        return iTankType;
    }

    public void setITankType(ITankType iTankType) {
        this.iTankType = iTankType;
    }

    public IMovingWays getIMovingWays() {
        return iMovingWays;
    }

    public void setIMovingWays(IMovingWays iMovingWays) {
        this.iMovingWays = iMovingWays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Transport )) return false;

        Transport transport = (Transport) o;

        if (id != transport.id) return false;
        if (passengers != transport.passengers) return false;
        if (cargoWeight != transport.cargoWeight) return false;
        if (iFareType != null ? !iFareType.equals(transport.iFareType) : transport.iFareType != null) return false;
        if (iTankType != null ? !iTankType.equals(transport.iTankType) : transport.iTankType != null) return false;
        if (iMovingWays != null ? !iMovingWays.equals(transport.iMovingWays) : transport.iMovingWays != null)
            return false;
        if (vehicleBrand != null ? !vehicleBrand.equals(transport.vehicleBrand) : transport.vehicleBrand != null)
            return false;
        return model != null ? model.equals(transport.model) : transport.model == null;
    }

    @Override
    public int hashCode() {
        int result = iFareType != null ? iFareType.hashCode() : 0;
        result = 31 * result + ( iTankType != null ? iTankType.hashCode() : 0 );
        result = 31 * result + ( iMovingWays != null ? iMovingWays.hashCode() : 0 );
        result = 31 * result + id;
        result = 31 * result + ( vehicleBrand != null ? vehicleBrand.hashCode() : 0 );
        result = 31 * result + ( model != null ? model.hashCode() : 0 );
        result = 31 * result + passengers;
        result = 31 * result + cargoWeight;
        return result;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "iFareType = " + iFareType +
                ", iTankType = " + iTankType +
                ", iMovingWays = " + iMovingWays +
                ", id = " + id +
                ", vehicleBrand = '" + vehicleBrand + '\'' +
                ", model = '" + model + '\'' +
                ", passengers = " + passengers +
                ", cargoWeight = " + cargoWeight +
                '}'+'\n';
    }
}
