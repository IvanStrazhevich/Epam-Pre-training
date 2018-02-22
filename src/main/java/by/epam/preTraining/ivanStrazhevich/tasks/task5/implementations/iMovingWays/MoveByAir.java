package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;

public class MoveByAir implements IMovingWays {
    @Override
    public String makeFare() {
        return "Fly";
    }

    @Override
    public String toString() {
        return " MoveByAir";
    }
}
