package by.epam.preTraining.ivanStrazhevich.tasks.task2.dragon;

public class Dragon {
    private static final int HEADS_AT_FIRST_PERIOD = 600;
    private static final int HEADS_AT_SECOND_PERIOD = 800;
    private static final int HEADS_TO_GROW_AT_FIRST_PERIOD = 3;
    private static final int HEADS_TO_GROW_AT_SECOND_PERIOD = 2;
    private static final int HEADS_TO_GROW_AT_THIRD_PERIOD = 1;
    private static final int HEADS_AT_BIRTH = 3;
    private static final int FIRST_PERIOD_ENDS = 200;
    private static final int SECOND_PERIOD_ENDS = 300;
    private static final int EYES_PER_HEAD = 2;

    public static int countHeads(int age) {
        int heads;
        if (age < FIRST_PERIOD_ENDS) {
            heads = HEADS_AT_BIRTH + age * HEADS_TO_GROW_AT_FIRST_PERIOD;
        } else if (age < SECOND_PERIOD_ENDS) {
            heads = HEADS_AT_FIRST_PERIOD + ( age - FIRST_PERIOD_ENDS + 1 ) * HEADS_TO_GROW_AT_SECOND_PERIOD;
        } else {
            heads = HEADS_AT_SECOND_PERIOD + ( age - SECOND_PERIOD_ENDS + 1 ) * HEADS_TO_GROW_AT_THIRD_PERIOD;
        }
        return heads;
    }

    public static int countEyes(int age) {
        return countHeads(age) * EYES_PER_HEAD;
    }
}

