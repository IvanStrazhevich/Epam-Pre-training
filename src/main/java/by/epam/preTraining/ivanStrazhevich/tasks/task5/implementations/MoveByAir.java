package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;

public class MoveByAir implements IMovingWays {
    @Override
    public void makeFare() {
        System.out.println("Fly");
    }

    @Override
    public String toString() {
        return "MoveByAir";
    }
}
