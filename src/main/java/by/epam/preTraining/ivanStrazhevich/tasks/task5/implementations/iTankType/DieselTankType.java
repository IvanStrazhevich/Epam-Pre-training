package by.epam.preTraining.ivanStrazhevich.tasks.task5.implementations.iTankType;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.interfaces.Fillable;

public class DieselTankType implements Fillable {
    @Override
    public String fillTank(int dieselLitres) {
        return "Filled with " + dieselLitres + " litres of diesel";

    }

    @Override
    public String toString() {
        return " with DieselTankType ";
    }
}
