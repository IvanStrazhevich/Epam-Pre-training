package by.epam.preTraining.ivanStrazhevich.tasks.task5.service;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.CargoTaxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.PassengerTaxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.*;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IVehicleRepositoryComplector;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.AbstractRepository;

import java.util.Random;

public class VehicleRepositoryComplector implements IVehicleRepositoryComplector {

    public ITransportRepository<Transport> fillVehicleRepository(int vehicleQuantity) {

        ITransportRepository iTaxiRepository = new AbstractRepository<Transport>(10);
        Random random = new Random();
        while (vehicleQuantity > 0) {
            switch (random.nextInt(TaxiSpecialisations.values().length)) {
                case 0:
                    iTaxiRepository.add(new PassengerTaxi(new PassengerFare(), new ElectricTankType(),
                            new MoveOnRoads(), vehicleQuantity--, "Tesla", "Model 3",
                            4, 300));
                    break;
                case 1:
                    iTaxiRepository.add(new CargoTaxi(new CargoFare(), new DiselTankType(),
                            new MoveOnRoads(), vehicleQuantity--, "VW", "Transporter",
                            2, 1400, 20));
                    break;
            }
        }
        return iTaxiRepository;
    }
}
