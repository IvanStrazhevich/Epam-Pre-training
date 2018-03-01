package by.epam.preTraining.ivanStrazhevich.tasks.task6;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.VehicleTreeRepositoryFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.ITree;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.repository.TreeRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Arrays;


public class TreeRepositoryTest {
    public static void main(String[] args) {
        ITree<Transport> treeRepository;
        VehicleTreeRepositoryFactory vehicleTreeRepositoryFactory = VehicleTreeRepositoryFactory.getVehicleTreeRepositoryFactory();
        treeRepository = vehicleTreeRepositoryFactory.fillVehicleRepository(10);
        Transport transport = new Transport();
        transport.setId(0);
        Transport transport2 = new Transport();
        transport2.setId(14);
        treeRepository.add(transport);
        treeRepository.add(transport2);

        treeRepository.add(transport);
        treeRepository.add(transport2);

        TreeRepository<Transport> treeRepository3 = new TreeRepository<>();

        treeRepository3.add(1);
        treeRepository3.add(3);
        treeRepository3.add(5);
        treeRepository3.add(2);
        treeRepository3.add(7);
        treeRepository3.add(6);
        Viewer.print(treeRepository3.count());
        treeRepository3.add(9);
        Viewer.print(treeRepository3.count());
        Viewer.print(Arrays.toString(treeRepository.showOrderedElementsArray()));
        Viewer.print(Arrays.toString(treeRepository3.showOrderedElementsArray()));
        Viewer.print("has 9 " + treeRepository3.contains(9));
        treeRepository3.removeElement(1);
        Viewer.print(Arrays.toString(treeRepository3.showOrderedElementsArray()));
        Viewer.print("has 4 " +treeRepository3.contains(4));
        Viewer.print("nodes in repository " + treeRepository3.count());
        treeRepository3.clear();
        Viewer.print("nodes in repository after clearance " + treeRepository3.count());
    }
}
