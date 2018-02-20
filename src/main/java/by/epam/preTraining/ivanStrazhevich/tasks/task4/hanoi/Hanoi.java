package by.epam.preTraining.ivanStrazhevich.tasks.task4.hanoi;

public class Hanoi {
    public static StringBuffer stringBuffer=new StringBuffer();
    public static StringBuffer playHanoi(int n, char from, char to, char temp) {
        if (n > 0) {
            playHanoi(n - 1, from, temp, to);
            stringBuffer.append(from + "->" + to + '\n');
            playHanoi(n - 1, temp, to, from);
        } return stringBuffer;
    }
}
