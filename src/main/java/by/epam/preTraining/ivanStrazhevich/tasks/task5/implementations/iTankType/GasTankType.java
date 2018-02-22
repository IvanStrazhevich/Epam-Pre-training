package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public class GasTankType implements ITankType {
    @Override
    public String fillTank(int gasLitres) {
        return "Filled with " + gasLitres + " litres of gas";

    }

    @Override
    public String toString() {
        return " with GasTankType";
    }
}
