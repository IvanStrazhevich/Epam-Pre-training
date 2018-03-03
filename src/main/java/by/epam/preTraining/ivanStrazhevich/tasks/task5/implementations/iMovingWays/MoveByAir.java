package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iMovingWays;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Movable;

public class MoveByAir implements Movable {
    @Override
    public String makeFare() {
        return "Fly";
    }

    @Override
    public String toString() {
        return " MoveByAir";
    }
}
