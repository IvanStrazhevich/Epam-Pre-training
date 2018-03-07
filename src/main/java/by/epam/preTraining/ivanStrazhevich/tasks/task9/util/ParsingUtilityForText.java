package by.epam.preTraining.ivanStrazhevich.tasks.task9.util;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces.Parsable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class ParsingUtilityForText<T> implements Parsable<Text> {
    @Override
    public Text parseText(String plainText) {
        Text text = new Text();
        try (BufferedReader reader = new BufferedReader(new StringReader(plainText))) {
            StringBuffer buffer = new StringBuffer();
            int charRead;
            while (( charRead = reader.read() ) != -1) {
                buffer.append((char) charRead);
            }
            text.setSourceText(buffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
