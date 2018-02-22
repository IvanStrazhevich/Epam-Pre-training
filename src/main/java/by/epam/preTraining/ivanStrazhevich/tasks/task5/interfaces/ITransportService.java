package by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces;

public interface ITransportService {
    ITransportRepository findByTankType(ITankType tankType, ITransportRepository transportRepository);
}
