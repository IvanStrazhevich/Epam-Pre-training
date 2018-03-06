package by.epam.preTraining.ivanStrazhevich.tasks.task9.util;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces.Parsable;

import java.io.*;

public class ParsingUtilityForFile<T> implements Parsable<Text> {
    @Override
    public Text parseText(String fileLocation) {
        Text text = new Text();
        System.out.println(fileLocation);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
            StringBuffer buffer = new StringBuffer();
            int charRead;
            while (( charRead = reader.read() ) != -1) {
                buffer.append((char) charRead);
            }
            text.setSourceText(buffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}
