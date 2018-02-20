package by.epam.preTraining.ivanStrazhevich.tasks.task4.hanoi;

public class Hanoi {

    public static StringBuffer playHanoi(int n, char from, char to, char temp, StringBuffer stringBuffer) {
        if (n > 0) {
            playHanoi(n - 1, from, temp, to, stringBuffer);
            stringBuffer.append(from + "->" + to + '\n');
            playHanoi(n - 1, temp, to, from, stringBuffer);
        } return stringBuffer;
    }
}
