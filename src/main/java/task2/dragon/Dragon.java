package task2.dragon;

public class Dragon {
    public static String countHeadsEyes(int age) {
        int heads = 0;
        int eyes = 0;
        if (age < 200) {
            heads = 3 + age * 3;
        } else if (age < 300) {
            heads = 600 + ( age - 200 ) * 2;
        } else {
            heads = 800 + ( age - 300 );
        }
        eyes = heads * 2;
        return "Dragon of age " + age + " has " + heads + " heads and " + eyes + " eyes";
    }
}

