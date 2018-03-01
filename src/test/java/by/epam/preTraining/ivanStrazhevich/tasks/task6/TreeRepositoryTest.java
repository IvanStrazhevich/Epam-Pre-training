package by.epam.preTraining.ivanStrazhevich.tasks.task6;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.VehicleTreeRepositoryFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.interfaces.ITree;
import by.epam.preTraining.ivanStrazhevich.tasks.task6.repository.TreeRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;


public class TreeRepositoryTest {
    public static void main(String[] args) {
        ITree<Transport> treeRepository;
        VehicleTreeRepositoryFactory vehicleTreeRepositoryFactory = VehicleTreeRepositoryFactory.getVehicleTreeRepositoryFactory();
        treeRepository=vehicleTreeRepositoryFactory.fillVehicleRepository(10);
        Transport transport = new Transport();
        transport.setId(0);
        Transport transport2 = new Transport();
        transport2.setId(14);
        treeRepository.add(transport);
        treeRepository.add(transport2);

        treeRepository.add(transport);
        treeRepository.add(transport2);
        TreeRepository<Transport> treeRepository2 = new TreeRepository<>();

        treeRepository2.add(1);
        treeRepository2.add(3);
        treeRepository2.add(5);
        treeRepository2.add(2);
        treeRepository2.add(7);
        treeRepository2.add(6);
        treeRepository2.add(9);
        Viewer.print(treeRepository);
    }
}
