package by.epam.preTraining.ivanStrazhevich.tasks.task8;

import java.util.Random;

public class ArrayFiller {
    public Object[] fillArray(int length){
        Random random = new Random();
        Object[] array = new Object[length];
        for (int i =0; i<length; i++){
            array[i]=random.nextInt(length);
        } return array;
    }
}
