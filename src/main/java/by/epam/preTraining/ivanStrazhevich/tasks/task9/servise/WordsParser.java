package by.epam.preTraining.ivanStrazhevich.tasks.task9.servise;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class WordsParser {

    public Text praseTextToWords(Text text) {
        ArrayList<Word> listOfWords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new StringReader(text.getSourceText()))) {
            int charRead;
            StringBuffer buffer = new StringBuffer();
            while (( charRead = reader.read() ) != -1) {
                Word word = new Word();
                if (charRead != ' ') {
                    buffer.append((char) charRead);
                } else {
                    word.setWord(buffer.toString());
                    listOfWords.add(word);
                    buffer.delete(0, buffer.length());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        text.setWords(listOfWords);
        return text;
    }
}
