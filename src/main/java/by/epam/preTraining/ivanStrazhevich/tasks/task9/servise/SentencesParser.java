package by.epam.preTraining.ivanStrazhevich.tasks.task9.servise;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Sentence;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class SentencesParser {
    public Text parseTextToSentences(Text text) {
        ArrayList<Sentence> listOfSentences = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new StringReader(text.getSourceText()))) {
            int charRead;
            StringBuffer buffer = new StringBuffer();
            while (( charRead = reader.read() ) != -1) {
                Sentence sentence = new Sentence();
                if (charRead != '.') {
                    buffer.append((char) charRead);
                } else {
                    sentence.setSentense(buffer.toString());
                    listOfSentences.add(sentence);
                    buffer.delete(0, buffer.length());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        text.setSentences(listOfSentences);
        return text;
    }
}

