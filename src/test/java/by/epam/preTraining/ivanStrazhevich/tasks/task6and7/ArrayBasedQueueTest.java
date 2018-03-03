package by.epam.preTraining.ivanStrazhevich.tasks.task6and7;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.CargoTaxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Taxi;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.VehicleQueueRepositoryFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.EmptyQueueExceptionExtended;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.MaxSizeExceededException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Queueable;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository.ArrayBasedQueue;

import java.util.Arrays;

import static by.epam.preTraining.ivanStrazhevich.tasks.task5.view.Viewer.print;

public class ArrayBasedQueueTest {
    public static void main(String[] args) throws EmptyQueueExceptionExtended, MaxSizeExceededException {


        print("Creating QUEUE repository: ");
        Queueable<Transport> taxiRepository2 = new ArrayBasedQueue<>(3, false);
        print("Checking not resizable option ");
        taxiRepository2.enqueue(new Transport());
        taxiRepository2.enqueue(new Taxi());
        taxiRepository2.enqueue(new CargoTaxi());
        print(Arrays.toString(taxiRepository2.getQueueOfElements()));

        print("Filling with vehicles ");
        VehicleQueueRepositoryFactory vehicleRepositoryFactory = VehicleQueueRepositoryFactory.getVehicleQueueRepositoryFactory();
        taxiRepository2 = vehicleRepositoryFactory.fillVehicleQueueRepository(2);

        print("Created repository ");
        print(Arrays.toString(taxiRepository2.getQueueOfElements()));

        print("Peeking out first  element ");
        Transport taxi0 = (Transport) taxiRepository2.peek();
        print(taxi0);

        print("Is queue  full : " + taxiRepository2.isFull());
        Transport transport = new Transport(taxi0);
        transport.setId(0);
        print("Number of vehicles before adding one " + taxiRepository2.size());
        print("enquqeing new one :");
        taxiRepository2.enqueue(transport);
        print("Is queue  2 full : " + taxiRepository2.isFull());
        print("Number of vehicles after adding one " + taxiRepository2.size());
        print(Arrays.toString(taxiRepository2.getQueueOfElements()));


        print("Check is it empty: " + taxiRepository2.isEmpty());
        print("Number of vehicles before peeking one " + taxiRepository2.size());
        print("Peeking first one: ");
        print(taxiRepository2.peek());
        print("Number of vehicles after peeking one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before dequeueing one " + taxiRepository2.size());
        print("dequeueing first one: ");
        print(taxiRepository2.dequeue());
        print("Number of vehicles after dequeueing one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before dequeueing one " + taxiRepository2.size());
        print("dequeueing first one: ");
        print(taxiRepository2.dequeue());
        print("Number of vehicles after dequeueing one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before dequeueing one " + taxiRepository2.size());
        print("dequeueing first one: ");
        print(taxiRepository2.dequeue());
        print("Number of vehicles after dequeueing one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

        print("Number of vehicles before dequeueing one " + taxiRepository2.size());
        print("dequeueing first one: ");
        print("HERE GOES EXCEPTION ");
        print(taxiRepository2.dequeue());
        print("Number of vehicles after dequeueing one " + taxiRepository2.size());
        print("Check is it empty: " + taxiRepository2.isEmpty());

    }

}
