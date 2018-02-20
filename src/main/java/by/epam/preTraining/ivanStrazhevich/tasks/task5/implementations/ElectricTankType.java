package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public class ElectricTankType implements ITankType {
    @Override
    public int fillTank(int kWt) {
        System.out.println("Filled with " + kWt + " kWt of electricity");
        return kWt;
    }

    @Override
    public String toString() {
        return "with ElectricTankType";
    }
}
