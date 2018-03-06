package by.epam.preTraining.ivanStrazhevich.tasks.task5.appController;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.CargoFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.ElectricTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.GasTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.PassengerFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Garageable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Serviceable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.TransportService;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.RepositoryTransportFactory;

import java.util.Arrays;

import static by.epam.preTraining.ivanStrazhevich.tasks.task5.view.Viewer.*;


public class AppStart {
    public static void main(String[] args) {
        print("Creating repository: ");
        Garageable<Transport> taxiRepository = new TransportRepository<Transport>(10);
        Garageable<Transport> taxiRepository2 = new TransportRepository<Transport>(10);
        Serviceable transportService = new TransportService();
        print("Check is it empty: " + taxiRepository.isEmpty());
        print("Filling with vehicles ");
        RepositoryTransportFactory repositoryTransportFactory = RepositoryTransportFactory.getRepositoryTransportFactory();
        taxiRepository = repositoryTransportFactory.fillVehicleRepository(11);
        print("Created first repository ");
        taxiRepository2 = repositoryTransportFactory.fillVehicleRepository(5);
        print("Created second repository ");
        print("Check is it empty: " + taxiRepository.isEmpty());
        print("Getting out an element and fare it: ");
        Transport taxi0 = (Transport) taxiRepository.get(0);
        print(taxi0.takeFare(2, 200));
        taxiRepository2.add(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.elementsAtRepository());
        taxiRepository2.add(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.elementsAtRepository());
        taxiRepository2.add(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.elementsAtRepository());
        taxiRepository2.add(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.elementsAtRepository());
        taxiRepository2.add(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.elementsAtRepository());
        taxiRepository2.add(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.elementsAtRepository());
        taxiRepository2.add(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.elementsAtRepository());
        print("Copy constructor test: ");
        Transport transport = new Transport(taxi0);
        print(taxi0);
        print(transport);
        print(transport.takeFare(2, 1400));
        Taxi taxi1 = (Taxi) taxiRepository.get(1);
        print(taxi1);
        print(taxi1.fillTank(20));
        taxi1.setITankType(new GasTankType());
        print(taxi1.fillTank(40));
        taxi1.setIFareType(new PassengerFare());
        print(taxi1.takeFare(4, 300));
        taxi1.setIFareType(new CargoFare());
        print(taxi1.takeFare(2, 500));

        print("Finding out if there is an element " + taxiRepository.contains(taxi1));
        print("Number of vehicles before merging " + taxiRepository2.elementsAtRepository());
        print("Second repository before merging:   "
                + Arrays.toString(taxiRepository2.getArrayOfElements()));
        taxiRepository2.addAll(taxiRepository.getArrayOfElements());
        print("First repository after merging:   "
                + Arrays.toString(taxiRepository.getArrayOfElements()));
        print("Second repository after merging:   "
                + Arrays.toString(taxiRepository2.getArrayOfElements()));
        print("Number of vehicles after merging " + taxiRepository2.elementsAtRepository());
        print("If there are all elements of the first repository contains in merged one : "
                + taxiRepository2.containsAll(taxiRepository.getArrayOfElements()));
        print("Number of vehicles before removing one " + taxiRepository2.elementsAtRepository());
        print("Removing one: ");
        taxiRepository2.remove(7);
        print("Number of vehicles after removing one " + taxiRepository2.elementsAtRepository());
        print("If there are all elements of the first repository contains in merged one : "
                + taxiRepository2.containsAll(taxiRepository.getArrayOfElements()));

        print("Select all that have electric tank: "
                + Arrays.toString(transportService.findByTankType(new ElectricTankType(), taxiRepository).getArrayOfElements()));

        print("Removing all: ");
        taxiRepository2.removeAll();
        print("After removal all " + taxiRepository2.elementsAtRepository());
    }
}

