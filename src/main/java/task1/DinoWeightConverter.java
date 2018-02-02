package task1;

public class DinoWeightConverter {
    public static final int GRAMMS_IN_KILO = 1000;
    public static final int GRAMMS_IN_TON = 1000;

    public static double convertGrammToKg(double grammWeight) {
        return grammWeight / GRAMMS_IN_KILO;
    }

    public static double convertGrammToTons(double grammWeight) {
        return grammWeight / GRAMMS_IN_TON;
    }
}
