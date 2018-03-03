package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Movable;

public class MoveBySea implements Movable {
    @Override
    public String makeFare() {
        return "Sail";
    }

    @Override
    public String toString() {
        return " MoveBySea";
    }
}
