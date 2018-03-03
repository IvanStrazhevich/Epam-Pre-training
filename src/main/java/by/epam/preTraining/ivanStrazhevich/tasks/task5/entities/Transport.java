package by.epam.preTraining.ivanStrazhevich.tasks.task5.entities;

import by.epam.preTraining.ivanStrazhevich.tasks.WrongEntriesException;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fareable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Movable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fillable;

public class Transport implements Comparable<Transport> {
    private Fareable fareType;
    private Fillable tankType;
    private Movable movingWays;
    private int id;
    private String vehicleBrand;
    private String model;
    private int passengers;
    private int cargoWeight;

    public String fillTank(int volume) {
        if (tankType != null) {
            return tankType.fillTank(volume);
        } else {
            try {
                throw new WrongEntriesException("Tank type for taxi not chosen");
            } catch (WrongEntriesException e) {
                e.printStackTrace();
                return "Not filled";
            }
        }

    }

    public String takeFare(int passengersQuantity, int cargoWeightKg) {
        if (fareType != null) {
            if (!( cargoWeightKg > cargoWeight || passengersQuantity > passengers )) {
                return fareType.takeFare(passengersQuantity, cargoWeightKg);
            } else {
                return "There is no space at Transport ";
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

    public Transport(Fareable fareType, Fillable tankType, Movable movingWays,
                     int id, String vehicleBrand, String model, int passengers, int cargoWeight) {
        this.fareType = fareType;
        this.tankType = tankType;
        this.movingWays = movingWays;
        this.id = id;
        this.vehicleBrand = vehicleBrand;
        this.model = model;
        this.passengers = passengers;
        this.cargoWeight = cargoWeight;
    }

    public Transport(Transport transport) {
        this.fareType = transport.getIFareType();
        this.tankType = transport.getITankType();
        this.movingWays = transport.getIMovingWays();
        this.id = transport.getId();
        this.vehicleBrand = transport.getVehicleBrand();
        this.model = transport.getModel();
        this.passengers = transport.getPassengers();
        this.cargoWeight = transport.getCargoWeight();
    }

    public Transport() {
    }

    public Fareable getIFareType() {
        return fareType;
    }

    public void setIFareType(Fareable fareType) {
        this.fareType = fareType;
    }

    public Fillable getITankType() {
        return tankType;
    }

    public void setITankType(Fillable tankType) {
        this.tankType = tankType;
    }

    public Movable getIMovingWays() {
        return movingWays;
    }

    public void setIMovingWays(Movable movingWays) {
        this.movingWays = movingWays;
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
        if (fareType != null ? !fareType.equals(transport.fareType) : transport.fareType != null) return false;
        if (tankType != null ? !tankType.equals(transport.tankType) : transport.tankType != null) return false;
        if (movingWays != null ? !movingWays.equals(transport.movingWays) : transport.movingWays != null)
            return false;
        if (vehicleBrand != null ? !vehicleBrand.equals(transport.vehicleBrand) : transport.vehicleBrand != null)
            return false;
        return model != null ? model.equals(transport.model) : transport.model == null;
    }

    @Override
    public int hashCode() {
        int result = fareType != null ? fareType.hashCode() : 0;
        result = 31 * result + ( tankType != null ? tankType.hashCode() : 0 );
        result = 31 * result + ( movingWays != null ? movingWays.hashCode() : 0 );
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
                " fareType = " + fareType +
                ", tankType = " + tankType +
                ", movingWays = " + movingWays +
                ", id = " + id +
                ", vehicleBrand = '" + vehicleBrand + '\'' +
                ", model = '" + model + '\'' +
                ", passengers = " + passengers +
                ", cargoWeight = " + cargoWeight +
                '}' + '\n';
    }

    @Override
    public int compareTo(Transport o) {
        return this.id - o.id;
    }
}
