package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public class ElectricTankType implements ITankType {
    @Override
    public String fillTank(int kWt) {
        return "Filled with " + kWt + " kWt of electricity";

    }

    @Override
    public String toString() {
        return " with ElectricTankType";
    }
}
