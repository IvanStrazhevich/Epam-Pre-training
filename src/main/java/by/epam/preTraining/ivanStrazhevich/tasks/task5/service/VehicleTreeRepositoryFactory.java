package by.epam.preTraining.ivanStrazhevich.tasks.task5.service;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.CargoTaxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.CargoFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.PassengerFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays.MoveOnRoads;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.DieselTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.ElectricTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IVehicleTreeRepositoryFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Sortable;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository.TreeRepository;

import java.util.Random;

public class VehicleTreeRepositoryFactory implements IVehicleTreeRepositoryFactory {


    private VehicleTreeRepositoryFactory() {
    }

    private static VehicleTreeRepositoryFactory vehicleRepositoryFactory;

    public static VehicleTreeRepositoryFactory getVehicleTreeRepositoryFactory() {
        if (null == vehicleRepositoryFactory) {
            vehicleRepositoryFactory = new VehicleTreeRepositoryFactory();
        }
        return vehicleRepositoryFactory;
    }

    public Sortable<Transport> fillVehicleRepository(int vehicleQuantity) {

        Sortable<Transport> iTaxiRepository = new TreeRepository<Transport>();
        Random random = new Random();
        while (vehicleQuantity > 0) {
            switch (random.nextInt(TaxiSpecialisations.values().length)) {
                case 0:
                    iTaxiRepository.add(new Taxi(new PassengerFare(), new ElectricTankType(),
                            new MoveOnRoads(), vehicleQuantity--, "Tesla", "Model 3",
                            4, 300,true));
                    break;
                case 1:
                    iTaxiRepository.add(new CargoTaxi(new CargoFare(), new DieselTankType(),
                            new MoveOnRoads(), vehicleQuantity--, "VW", "Transporter",
                            2, 1400, true,20));
                    break;
            }
        }
        return iTaxiRepository;
    }
}
