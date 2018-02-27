package by.epam.preTraining.ivanStrazhevich.tasks.task5.service;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.CargoTaxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.CargoFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.PassengerFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays.MoveOnRoads;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.DieselTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.ElectricTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IVehicleStackRepositoryFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IStack;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.repository.ArrayBasedStack;

import java.util.Random;

public class VehicleRepositoryForStackFactory<T> implements IVehicleStackRepositoryFactory {


    private VehicleRepositoryForStackFactory() {
    }

    private static VehicleRepositoryForStackFactory vehicleRepositoryForStackFactory;

    public static VehicleRepositoryForStackFactory getVehicleRepositoryForStackFactory() {
        if (null == vehicleRepositoryForStackFactory) {
            vehicleRepositoryForStackFactory = new VehicleRepositoryForStackFactory();
        }
        return vehicleRepositoryForStackFactory;
    }

    public IStack<Transport> fillVehicleStackRepository(int vehicleQuantity) {

        IStack<Transport> iTaxiRepository = new ArrayBasedStack<>(vehicleQuantity, true);
        Random random = new Random();
        while (vehicleQuantity > 0) {
            switch (random.nextInt(TaxiSpecialisations.values().length)) {
                case 0:
                    iTaxiRepository.push(new Taxi(new PassengerFare(), new ElectricTankType(),
                            new MoveOnRoads(), vehicleQuantity--, "Tesla", "Model 3",
                            4, 300, true));
                    break;
                case 1:
                    iTaxiRepository.push(new CargoTaxi(new CargoFare(), new DieselTankType(),
                            new MoveOnRoads(), vehicleQuantity--, "VW", "Transporter",
                            2, 1400, true, 20));
                    break;
            }
        }
        return iTaxiRepository;
    }
}
