package task2.dragon;

public class Dragon {
    private static final int HEADS_AT_AGE_199=600;
    private static final int HEADS_AT_AGE_299=800;

    public static String countHeadsEyes(int age) {
        int heads = 0;
        int eyes = 0;
        if (age < 200) {
            heads = 3 + age * 3;
        } else if (age < 300) {
            heads = HEADS_AT_AGE_199 + ( age - 199 ) * 2;
        } else {
            heads = HEADS_AT_AGE_299 + ( age - 299 );
        }
        eyes = heads * 2;
        return "Dragon of age " + age + " has " + heads + " heads and " + eyes + " eyes";
    }
}

