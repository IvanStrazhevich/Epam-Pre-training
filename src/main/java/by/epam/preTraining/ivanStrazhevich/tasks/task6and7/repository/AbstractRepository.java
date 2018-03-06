package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.repository;

import by.epam.preTraining.ivanStrazhevich.tasks.task5.entities.Transport;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions.MaxSizeExceededException;
import by.epam.preTraining.ivanStrazhevich.tasks.task6and7.interfaces.Repositoryable;

public abstract class AbstractRepository<T> implements Repositoryable<T> {

    @Override
    public T[] extendArray(T[] extendingArray, int oldLength) {
        int size = ( oldLength ) * 2;
        int j = 0;
        Transport[] arrayExtended = new Transport[size];
        for (T oldArrayElement : extendingArray
                ) {
            arrayExtended[j++] = (Transport) oldArrayElement;
        }
        return (T[]) arrayExtended;
    }

    @Override
    public T[] addToArray(T element, T[] array, boolean resizable) {
        int i = 0;
        for (T existElement : array
                ) {
            if (existElement != null) {
                i++;
            } else if (array.length - 1 == i && resizable) {
                array = (T[]) extendArray(array, array.length);
                array[i] = (T) element;
            } else if (i == array.length - 1 && !resizable) {
                try {
                    array[i] = (T) element;
                    throw new MaxSizeExceededException("Stack is full and not resizable");
                } catch (MaxSizeExceededException ex) {
                    ex.printStackTrace();
                }
            } else {
                array[i] = (T) element;
            }
        }
        return (T[]) array;
    }
}
