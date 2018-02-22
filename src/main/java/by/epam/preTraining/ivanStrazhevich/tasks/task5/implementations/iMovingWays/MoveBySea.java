package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;

public class MoveBySea implements IMovingWays {
    @Override
    public String makeFare() {
        return "Sail";
    }

    @Override
    public String toString() {
        return " MoveBySea";
    }
}
