package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fillable;

public class ElectricTankType implements Fillable {
    @Override
    public String fillTank(int kWt) {
        return "Filled with " + kWt + " kWt of electricity";

    }

    @Override
    public String toString() {
        return " with ElectricTankType";
    }
}
