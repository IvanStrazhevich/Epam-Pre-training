package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;

public class MoveOnRoads implements IMovingWays {
    @Override
    public void makeFare() {
        System.out.println("Ride");
    }

    @Override
    public String toString() {
        return "MoveOnRoads";
    }
}
