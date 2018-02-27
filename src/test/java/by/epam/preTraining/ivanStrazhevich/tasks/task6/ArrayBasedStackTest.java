package by.epam.preTraining.ivanStrazhevich.tasks.task6;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.CargoFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iFareType.PassengerFare;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType.GasTankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportService;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.TransportService;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.VehicleRepositoryForStackFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.IStack;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.repository.ArrayBasedStack;

import static by.epam.preTraining.ivanStrazhevich.tasks.task5.view.Viewer.print;


public class ArrayBasedStackTest {
    public static void main(String[] args) {

        print("Creating repository: ");
        IStack<Transport> taxiRepository = new ArrayBasedStack<>(10, true);
        IStack<Transport> taxiRepository2 = new ArrayBasedStack<>(10, true);

        print("Check is it empty: " + taxiRepository.isEmpty());
        print("Filling with vehicles ");
        ITransportService transportService = new TransportService();
        VehicleRepositoryForStackFactory vehicleRepositoryFactory = VehicleRepositoryForStackFactory.getVehicleRepositoryForStackFactory();
        taxiRepository = vehicleRepositoryFactory.fillVehicleStackRepository(10);
        print("Created first repository ");
        taxiRepository2 = vehicleRepositoryFactory.fillVehicleStackRepository(5);

        print("Created second repository ");
        print("Check is it empty: " + taxiRepository.isEmpty());
        print("Getting out an element ");
        Transport taxi0 = (Transport) taxiRepository.peek();
        taxi0.takeFare(2, 200);
        print("Is stack  1 full : "
                + taxiRepository.isFull());
        print("Is stack 2 full : "
                + taxiRepository2.isFull());

        print("Copy constructor test: ");
        Transport transport = new Transport(taxi0);
        print(taxi0);
        print(transport);
        print(transport.takeFare(2, 1400));
        Taxi taxi1 = (Taxi) taxiRepository.pop();
        print(taxi1);
        print(taxi1.fillTank(20));
        taxi1.setITankType(new GasTankType());
        print(taxi1.fillTank(40));
        taxi1.setIFareType(new PassengerFare());
        print(taxi1.takeFare(4, 300));
        taxi1.setIFareType(new CargoFare());
        print(taxi1.takeFare(2, 500));

        print("Check is it empty: " + taxiRepository2.isEmpty());
        print("Number of vehicles before peeking one " + taxiRepository2.stackSize());
        print("Peeking one: ");
        print(taxiRepository2.peek());
        print("Number of vehicles after peeking one " + taxiRepository2.stackSize());
        print("Check is it empty: " + taxiRepository2.isEmpty());
        print("Number of vehicles before poping one " + taxiRepository2.stackSize());
        print("Poping one: ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.stackSize());
        print("Check is it empty: " + taxiRepository2.isEmpty());
        print("Number of vehicles before poping one " + taxiRepository2.stackSize());
        print("Poping one: ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.stackSize());
        print("Check is it empty: " + taxiRepository2.isEmpty());
        print("Number of vehicles before poping one " + taxiRepository2.stackSize());
        print("Poping one: ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.stackSize());
        print("Check is it empty: " + taxiRepository2.isEmpty());
        print("Number of vehicles before poping one " + taxiRepository2.stackSize());
        print("Poping one: ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.stackSize());
        print("Check is it empty: " + taxiRepository2.isEmpty());
        print("Number of vehicles before poping one " + taxiRepository2.stackSize());
        print("Poping one: ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.stackSize());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before peeking one " + taxiRepository2.stackSize());
        print("Poping one: ");
        print(taxiRepository2.peek());
        print("Number of vehicles after peeking one " + taxiRepository2.stackSize());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        taxiRepository2.push(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack 2 full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack 2 full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());
        print("push one :");
        taxiRepository2.push(taxi0);
        print("Is stack full : "
                + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.stackSize());

    }

    }
