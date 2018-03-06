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
        long start1 = System.nanoTime();
        print(Arrays.toString(sort.sortInsert((Transport[]) garage.getArrayOfElements())));
        long finish1 = System.nanoTime();
        long insert = finish1 - start1;

        print("Choice sort:");
        garage = transportFactory.fillVehicleRepository(25);
        print(Arrays.toString(garage.getArrayOfElements()));
        long start2 = System.nanoTime();
        print(Arrays.toString(sort.sortChoice((Transport[]) garage.getArrayOfElements())));
        long finish2 = System.nanoTime();
        long choice = finish2 - start2;

        print("Merge sort:");
        garage = transportFactory.fillVehicleRepository(25);
        print(Arrays.toString(garage.getArrayOfElements()));
        long start3 = System.nanoTime();
        print(Arrays.toString(sort.sortMerge((Transport[]) garage.getArrayOfElements())));
        long finish3 = System.nanoTime();
        long merge = finish3 - start3;

        print("Quick sort:");
        garage = transportFactory.fillVehicleRepository(25);
        print(Arrays.toString(garage.getArrayOfElements()));
        long start4 = System.nanoTime();
        print(Arrays.toString(sort.sortQuick((Transport[]) garage.getArrayOfElements())));
        long finish4 = System.nanoTime();
        long quick = finish4 - start4;

        print("Binary search false:");
        Garageable<Transport> garage4 = transportFactory.fillVehicleRepository(25);
        Transport transport4 = new Transport();
        long start5 = System.nanoTime();
        print("found " + search.binarySearch(transport4, (Transport[]) garage4.getArrayOfElements()));
        long finish5 = System.nanoTime();
        long binaryFalse = finish5 - start5;

        print("Binary search true:");
        Garageable<Transport> garage5 = transportFactory.fillVehicleRepository(25);
        Transport transport5 = (Transport) garage5.get(12);
        long start6 = System.nanoTime();
        print("found " + search.binarySearch(transport5, (Transport[]) garage5.getArrayOfElements()));
        long finish6 = System.nanoTime();
        long binaryTrue = finish6 - start6;
        print("Liner search:");
        garage = transportFactory.fillVehicleRepository(25);
        transport = new Transport();
        long start7 = System.nanoTime();
        print("found " + search.linerSearch(transport, (Transport[]) garage.getArrayOfElements()));
        long finish7 = System.nanoTime();
        long linerFalse = finish7 - start7;
        transport = (Transport) garage.get(12);
        long start8 = System.nanoTime();
        print("found " + search.linerSearch(transport, (Transport[]) garage.getArrayOfElements()));
        long finish8 = System.nanoTime();
        long linerTrue = finish8 - start8;



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
