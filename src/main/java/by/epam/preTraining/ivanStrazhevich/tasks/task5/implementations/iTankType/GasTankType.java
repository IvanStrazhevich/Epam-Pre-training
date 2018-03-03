package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fillable;

public class GasTankType implements Fillable {
    @Override
    public String fillTank(int gasLitres) {
        return "Filled with " + gasLitres + " litres of gas";

    }

    @Override
    public String toString() {
        return " with GasTankType";
    }
}
