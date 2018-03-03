package by.epam.preTraining.ivanStrazhevich.tasks.task6and7;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.service.SortableRepositoryFactory;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Sortable;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository.TreeRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.view.Viewer;

import java.util.Arrays;


public class TreeRepositoryTest {
    public static void main(String[] args) {
        Sortable<Transport> treeRepository;
        SortableRepositoryFactory sortableRepositoryFactory = SortableRepositoryFactory.getVehicleTreeRepositoryFactory();
        treeRepository = sortableRepositoryFactory.fillVehicleRepository(3);
        Transport transport = new Transport();
        transport.setId(0);
        Transport transport2 = new Transport();
        transport2.setId(14);
        treeRepository.add(transport);
        treeRepository.add(transport2);

        treeRepository.add(transport);
        treeRepository.add(transport2);

        TreeRepository<Transport> treeRepository3 = new TreeRepository<>();
        treeRepository3.add(4);
        treeRepository3.add(2);
        treeRepository3.add(5);
        treeRepository3.add(1);
        treeRepository3.add(3);
        treeRepository3.add(7);
        treeRepository3.add(6);
        treeRepository3.add(8);
        Viewer.print("Preorder in action " + treeRepository3.showPreOrder());
        Viewer.print("Postorder in action " + treeRepository3.showPostOrder());
        Viewer.print("Inorder in action " + treeRepository3.showInOrder());
        Viewer.print(treeRepository3.count());
        Viewer.print(Arrays.toString(treeRepository.showOrderedElementsArray()));

        Viewer.print(Arrays.toString(treeRepository3.showOrderedElementsArray()));
        Viewer.print("has 9 " + treeRepository3.contains(9));

        treeRepository3.removeElement(3);
        Viewer.print(Arrays.toString(treeRepository3.showOrderedElementsArray()));
        Viewer.print("nodes in repository " + treeRepository3.count());

        treeRepository3.removeElement(4);
        Viewer.print(Arrays.toString(treeRepository3.showOrderedElementsArray()));
        Viewer.print("nodes in repository " + treeRepository3.count());

        treeRepository3.removeElement(6);
        Viewer.print(Arrays.toString(treeRepository3.showOrderedElementsArray()));
        Viewer.print("nodes in repository " + treeRepository3.count());

        treeRepository3.removeElement(7);
        Viewer.print(Arrays.toString(treeRepository3.showOrderedElementsArray()));
        Viewer.print("nodes in repository " + treeRepository3.count());


        Viewer.print("has 4 " +treeRepository3.contains(4));
        Viewer.print("Preorder in action " + treeRepository3.showPreOrder());
        Viewer.print("Postorder in action " + treeRepository3.showPostOrder());
        Viewer.print("Inorder in action " + treeRepository3.showInOrder());

        treeRepository3.clear();
        Viewer.print(Arrays.toString(treeRepository3.showOrderedElementsArray()));
        Viewer.print("nodes in repository after clearance " + treeRepository3.count());
    }
}
