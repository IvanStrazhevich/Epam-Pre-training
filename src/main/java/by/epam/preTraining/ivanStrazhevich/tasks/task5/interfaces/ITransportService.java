package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

import java.util.Collection;

public interface ITransportService {
    ITransportRepository findByTankType(ITankType tankType, ITransportRepository transportRepository);
}
