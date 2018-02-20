package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public class GasTankType implements ITankType {
    @Override
    public int fillTank(int gasLitres) {
        System.out.println("Filled with " + gasLitres + "litres of gas");
        return gasLitres;
    }

    @Override
    public String toString() {
        return "with GasTankType";
    }
}
