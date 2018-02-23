package by.epam.preTraining.ivanStrazhevich.tasks.task5.service;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.CargoTaxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.CargoFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.PassengerFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays.MoveOnRoads;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.DieselTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.ElectricTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IVehicleRepositoryFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;

import java.util.Random;

public class VehicleRepositoryFactory implements IVehicleRepositoryFactory {


    private VehicleRepositoryFactory() {
    }

    private static VehicleRepositoryFactory vehicleRepositoryFactory;

    public static VehicleRepositoryFactory getVehicleRepositoryFactory() {
        if (null == vehicleRepositoryFactory) {
            vehicleRepositoryFactory = new VehicleRepositoryFactory();
        }
        return vehicleRepositoryFactory;
    }

    public ITransportRepository<Transport> fillVehicleRepository(int vehicleQuantity) {

        ITransportRepository iTaxiRepository = new TransportRepository<Transport>(10);
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
