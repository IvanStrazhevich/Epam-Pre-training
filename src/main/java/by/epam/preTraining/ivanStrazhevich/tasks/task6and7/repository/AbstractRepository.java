package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.MaxSizeExceededException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Repositoryable;

public class AbstractRepository<T> implements Repositoryable<T> {
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

    @Override
    public Object[] addToArray(Object element, Object[] array, boolean resizable) {
        int i = 0;
        for (Object existElement : array
                ) {
            if (existElement != null) {
                i++;
            } else if (array.length - 1 == i && resizable) {
                array = extendArray(array, array.length);
                array[i] = element;
            } else if (i == array.length - 1 && !resizable) {
                try {
                    array[i] = element;
                    throw new MaxSizeExceededException("Stack is full and not resizable");
                } catch (MaxSizeExceededException ex) {
                    ex.printStackTrace();
                }
            } else {
                array[i] = element;
            }
        }
        return array;
    }
}
