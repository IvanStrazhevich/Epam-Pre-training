package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Movable;

public class MoveOnRoads implements Movable {
    @Override
    public String makeFare() {
        return "Ride";
    }

    @Override
    public String toString() {
        return " MoveOnRoads";
    }
}
