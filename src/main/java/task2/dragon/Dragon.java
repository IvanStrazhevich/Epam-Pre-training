package task2.dragon;

public class Dragon {
    private static final int HEADS_AT_AGE_199=600;
    private static final int HEADS_AT_AGE_299=800;
    private static final int EYES_AT_AGE_199=1200;
    private static final int EYES_AT_AGE_299=1600;

    public static int countHeads(int age) {
        int heads = 0;
        if (age < 200) {
            heads = 3 + age * 3;
        } else if (age < 300) {
            heads = HEADS_AT_AGE_199 + ( age - 199 ) * 2;
        } else {
            heads = HEADS_AT_AGE_299 + ( age - 299 );
        }

        return heads;
    }
    public static int countEyes(int age) {
        int eyes=0;
        if (age < 200) {
            eyes = 6 + age * 6;
        } else if (age < 300) {
            eyes = EYES_AT_AGE_199 + ( age - 199 ) * 4;
        } else {
            eyes = EYES_AT_AGE_299 + ( age - 299 ) * 2;
        }

        return eyes;
    }
}

