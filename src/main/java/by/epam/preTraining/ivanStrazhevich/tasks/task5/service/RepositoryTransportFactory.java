package by.epam.preTraining.ivanStrazhevich.tasks.task5.service;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.CargoTaxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.CargoFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.PassengerFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays.MoveOnRoads;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.DieselTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.ElectricTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Garageable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;

import java.util.Random;

public class RepositoryTransportFactory implements by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.RepositoryTransportFactory {


    private RepositoryTransportFactory() {
    }

    private static RepositoryTransportFactory repositoryTransportFactory;

    public static RepositoryTransportFactory getRepositoryTransportFactory() {
        if (null == repositoryTransportFactory) {
            repositoryTransportFactory = new RepositoryTransportFactory();
        }
        return repositoryTransportFactory;
    }

    public Garageable<Transport> fillVehicleRepository(int vehicleQuantity) {

        Garageable iTaxiRepository = new TransportRepository<Transport>(vehicleQuantity);
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
