package by.epam.preTraining.ivanStrazhevich.tasks.task5.service;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportRepository;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITransportService;
import by.epam.preTraining.ivanStrazhevich.tasks.task5.repository.AbstractRepository;

import java.util.Collection;

public class TransportService implements ITransportService {
    @Override
    public ITransportRepository findByTankType(ITankType tankType, ITransportRepository transportRepository) {
        ITransportRepository tankTypeRepository = new AbstractRepository(transportRepository.elementsAtRepository());
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
