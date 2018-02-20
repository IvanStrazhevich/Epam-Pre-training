package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.ITankType;

public class DiselTankType implements ITankType {
    @Override
    public int fillTank(int dieselLitres) {
        System.out.println("Filled with " + dieselLitres + " litres of diesel");
        return dieselLitres;
    }

    @Override
    public String toString() {
        return "with DiselTankType ";
    }
}
