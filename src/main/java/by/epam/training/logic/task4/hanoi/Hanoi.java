package by.epam.training.logic.task4.hanoi;

public class Hanoi {
    public static void playHanoi(int n, char from, char to, char temp) {
        if (n > 0) {
            playHanoi(n - 1, from, temp, to);
            System.out.println(from + "->" + to);
            playHanoi(n - 1, temp, to, from);
        }
    }
}
