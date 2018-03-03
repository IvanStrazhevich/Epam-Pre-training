package by.epam.preTraining.ivanStrazhevich.tasks.task5.service;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fillable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Garageable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Serviceable;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.TransportRepository;

public class TransportService implements Serviceable {
    @Override
    public Garageable findByTankType(Fillable tankType, Garageable transportRepository) {
        Garageable tankTypeRepository = new TransportRepository(transportRepository.elementsAtRepository());
        int quantityOfElements = transportRepository.elementsAtRepository();
        for (int i = 0; i < quantityOfElements; i++) {
            Transport transport = (Transport) transportRepository.get(i);
            System.out.println(transport);
            if (transport.getITankType().toString().equals(tankType.toString())) {
                tankTypeRepository.add(transport);
            }
        }
        return tankTypeRepository;
    }
}
