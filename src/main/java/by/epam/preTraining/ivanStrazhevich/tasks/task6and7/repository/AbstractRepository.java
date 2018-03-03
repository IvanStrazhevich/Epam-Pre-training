package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.IRepository;

public class AbstractRepository<T> implements IRepository<T> {
    @Override
    public Object[] extendArray(Object[] extendingArray, int oldLength) {
        int size = ( oldLength ) * 2;
        int j = 0;
       Object[] arrayExtended = new Object[size];
        for (Object oldArrayElement : extendingArray
                ) {
            arrayExtended[j++] = oldArrayElement;
        }
        return arrayExtended;
    }
}
