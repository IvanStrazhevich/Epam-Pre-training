package by.epam.preTraining.ivanStrazhevich.tasks.task8;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Garageable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.RepositoryTransportFactory;

import java.util.Arrays;

import static by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer.*;

public class SortTest {
    public static void main(String[] args) {
        RepositoryTransportFactory transportFactory = RepositoryTransportFactory.getRepositoryTransportFactory();
        Garageable<Transport> garage = new TransportRepository<>();
        Transport transport = new Transport();

        garage = transportFactory.fillVehicleRepository(25);
        transport = (Transport) garage.get(5);
        Sort<Transport> sort = new Sort<>();
        Search<Transport> search = new Search<>();

        print("Bubble sort:");
        garage = transportFactory.fillVehicleRepository(25);
        print(Arrays.toString(garage.getArrayOfElements()));
        long start = System.nanoTime();
        print(Arrays.toString(sort.sortBubble((Transport[]) garage.getArrayOfElements())));
        long finish = System.nanoTime();
        long buble = finish - start;

        print("Insert sort:");
        garage = transportFactory.fillVehicleRepository(25);
        print(Arrays.toString(garage.getArrayOfElements()));
        start = System.nanoTime();
        print(Arrays.toString(sort.sortInsert((Transport[]) garage.getArrayOfElements())));
        finish = System.nanoTime();
        long insert = finish - start;

        print("Choice sort:");
        garage = transportFactory.fillVehicleRepository(25);
        print(Arrays.toString(garage.getArrayOfElements()));
        start = System.nanoTime();
        print(Arrays.toString(sort.sortChoice((Transport[]) garage.getArrayOfElements())));
        finish = System.nanoTime();
        long choice = finish - start;

        print("Merge sort:");
        garage = transportFactory.fillVehicleRepository(25);
        print(Arrays.toString(garage.getArrayOfElements()));
        start = System.nanoTime();
        print(Arrays.toString(sort.sortMerge((Transport[]) garage.getArrayOfElements())));
        finish = System.nanoTime();
        long merge = finish - start;

        print("Quick sort:");
        garage = transportFactory.fillVehicleRepository(25);
        print(Arrays.toString(garage.getArrayOfElements()));
        start = System.nanoTime();
        print(Arrays.toString(sort.sortQuick((Transport[]) garage.getArrayOfElements())));
        finish = System.nanoTime();
        long quick = finish - start;

        print("Liner search:");
        garage = transportFactory.fillVehicleRepository(25);
        transport = new Transport();
        start = System.nanoTime();
        print("found " + search.linerSearch(transport, (Transport[]) garage.getArrayOfElements()));
        finish = System.nanoTime();
        long linerFalse = finish - start;
        transport = (Transport) garage.get(5);
        start = System.nanoTime();
        print("found " + search.linerSearch(transport, (Transport[]) garage.getArrayOfElements()));
        finish = System.nanoTime();
        long linerTrue = finish - start;

        print("Binary search false:");
        garage = transportFactory.fillVehicleRepository(25);
        transport = new Transport();
        start = System.nanoTime();
        print("found " + search.binarySearch(transport, (Transport[]) garage.getArrayOfElements()));
        finish = System.nanoTime();
        long binaryFalse = finish - start;
        print("Binary search true:");
        transport = (Transport) garage.get(5);
        start = System.nanoTime();
        print("found " + search.binarySearch(transport, (Transport[]) garage.getArrayOfElements()));
        finish = System.nanoTime();
        long binaryTrue = finish - start;

        print("Bubble sort took ns: " + ( buble ));
        print("Insert sort took ns: " + ( insert ));
        print("Choice sort took ns: " + ( choice ));
        print("Merge sort took ns: " + ( merge ));
        print("Quick sort took ns: " + ( quick ));
        print("Binary true search took ns: " + ( binaryTrue ));
        print("Binary false search took ns: " + ( binaryFalse));
        print("Liner true search: took ns: " + ( linerTrue ));
        print("Liner false search: took ns: " + ( linerFalse ));


    }
}
