package by.epam.preTraining.ivanStrazhevich.tasks.task6and7;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.CargoTaxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.StackableTransportRepositoryFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.EmptyStackExtendedException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.MaxSizeExceededException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Stackable;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository.ArrayBasedStack;

import java.util.Arrays;

import static by.epam.preTraining.ivanStrazhevich.tasks.task5.view.Viewer.print;


public class ArrayBasedStackTest {
    public static void main(String[] args) throws EmptyStackExtendedException, MaxSizeExceededException {

        print("Creating STACK repository: ");
        print("Checking not resizable option ");
        Stackable<Transport> taxiRepository2 = new ArrayBasedStack<>(3, false);
        taxiRepository2.push(new Transport());
        taxiRepository2.push(new Taxi());
        taxiRepository2.push(new CargoTaxi());
        print(Arrays.toString(taxiRepository2.getArrayOfElements()));

        print("Filling with vehicles ");
        StackableTransportRepositoryFactory vehicleRepositoryFactory = StackableTransportRepositoryFactory.getVehicleRepositoryForStackFactory();
        taxiRepository2 = vehicleRepositoryFactory.fillVehicleStackRepository(2);

        print("Created repository ");
        print(Arrays.toString(taxiRepository2.getArrayOfElements()));

        print("Peeking out the last  element ");
        Transport taxi0 = (Transport) taxiRepository2.peek();
        print(taxi0);

        print("Is stack  full : " + taxiRepository2.isFull());
        Transport transport = new Transport(taxi0);
        transport.setId(0);
        print("Number of vehicles before adding one " + taxiRepository2.size());
        print("Pushing new one on top :");
        taxiRepository2.push(transport);
        print("Is queue  2 full : " + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.size());
        print(Arrays.toString(taxiRepository2.getArrayOfElements()));


        print("Check is it empty: " + taxiRepository2.isEmpty());
        print("Number of vehicles before peeking one " + taxiRepository2.size());
        print("Peeking one: ");
        print(taxiRepository2.peek());
        print("Number of vehicles after peeking one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before poping one " + taxiRepository2.size());
        print("poping top one: ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before poping one " + taxiRepository2.size());
        print("poping top one: ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before poping one " + taxiRepository2.size());
        print("poping top one: ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before poping one " + taxiRepository2.size());
        print("poping top one: ");
        print("HERE GOES EXCEPTION ");
        print(taxiRepository2.pop());
        print("Number of vehicles after poping one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

    }

}
