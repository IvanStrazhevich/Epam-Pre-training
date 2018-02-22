package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public class DiselTankType implements ITankType {
    @Override
    public String fillTank(int dieselLitres) {
        return "Filled with " + dieselLitres + " litres of diesel";

    }

    @Override
    public String toString() {
        return " with DiselTankType ";
    }
}
