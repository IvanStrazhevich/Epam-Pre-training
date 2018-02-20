package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.IMovingWays;

public class MoveBySea implements IMovingWays {
    @Override
    public void makeFare() {
        System.out.println("Sail");
    }

    @Override
    public String toString() {
        return "MoveBySea";
    }
}
