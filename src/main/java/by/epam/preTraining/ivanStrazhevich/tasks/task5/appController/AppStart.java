package by.epam.preTraining.ivanStrazhevich.tasks.task5.appController;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.CargoFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.ElectricTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.GasTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.PassengerFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportService;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.AbstractRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.TransportService;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.VehicleRepositoryComplector;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.view.Viewer;

import java.util.Arrays;


public class AppStart {
    public static void main(String[] args) {
        Viewer.print("Creating repository: ");
        ITransportRepository<Transport> taxiRepository = new AbstractRepository<Transport>(10);
        ITransportRepository<Transport> taxiRepository2 = new AbstractRepository<Transport>(10);
        ITransportService transportService = new TransportService();
        Viewer.print("Check is it empty: " + taxiRepository.isEmpty());
        Viewer.print("Filling with vehicles ");
        VehicleRepositoryComplector vehicleRepositoryComplector = new VehicleRepositoryComplector();
        taxiRepository = vehicleRepositoryComplector.fillVehicleRepository(10);
        Viewer.print("Created first repository " + Arrays.toString(taxiRepository.getRepository()));
        taxiRepository2 = vehicleRepositoryComplector.fillVehicleRepository(5);
        Viewer.print("Created second repository " + Arrays.toString(taxiRepository2.getRepository()));
        Viewer.print("Check is it empty: " + taxiRepository.isEmpty());
        Viewer.print("Getting out an element ");
        Taxi taxi0 = (Taxi) taxiRepository.get(0);
        taxi0.takeFare(2, 200);
        taxiRepository2.add(taxi0);
        Viewer.print("Number of vehicles after adding one " + taxiRepository2.elementsAtRepository());
        Taxi taxi1 = (Taxi) taxiRepository.get(1);
        Viewer.print(taxi1.fillTank(20));
        taxi1.setITankType(new GasTankType());
        Viewer.print(taxi1.fillTank(40));
        taxi1.setIFareType(new PassengerFare());
        Viewer.print(taxi1.takeFare(4, 300));
        taxi1.setIFareType(new CargoFare());
        Viewer.print(taxi1.takeFare(4, 500));
        Viewer.print(taxi1);

        Viewer.print("Finding out if there is an element " + taxiRepository.contains(taxi1));
        Viewer.print("Number of vehicles before merging " + taxiRepository2.elementsAtRepository());
        Viewer.print("Second repository before merging:   "
                + Arrays.toString(taxiRepository2.getRepository()));
        taxiRepository2.addAll(taxiRepository.getRepository());
        Viewer.print("First repository after merging:   "
                + (taxiRepository.elementsAtRepository()));
        Viewer.print("Second repository after merging:   "
                + Arrays.toString(taxiRepository2.getRepository()));
        Viewer.print("Number of vehicles after merging " + taxiRepository2.elementsAtRepository());
        Viewer.print("If there are all elements of the first repository contains in merged one : "
                + taxiRepository2.containsAll(taxiRepository.getRepository()));
        Viewer.print("Number of vehicles before removing one " + taxiRepository2.elementsAtRepository());
        Viewer.print("Removing one: ");
        taxiRepository2.remove(7);
        Viewer.print("Number of vehicles after removing one " + taxiRepository2.elementsAtRepository());
        Viewer.print("If there are all elements of the first repository contains in merged one : "
                + taxiRepository2.containsAll(taxiRepository.getRepository()));
        Viewer.print("Select all that have electric tank: "
                + Arrays.toString(transportService.findByTankType(new ElectricTankType(), taxiRepository).getRepository()));
        Viewer.print("Removing all: ");
        taxiRepository2.removeAll();
        Viewer.print("After removal all " + taxiRepository2.elementsAtRepository());
    }
}

