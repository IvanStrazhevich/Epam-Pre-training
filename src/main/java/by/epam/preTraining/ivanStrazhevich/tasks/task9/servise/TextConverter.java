package by.epam.preTraining.ivanStrazhevich.tasks.task9.servise;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.ParsingParameters;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Sentence;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.util.SortByWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;

public class TextConverter {
    ParsingParameters parsingParameters;

    public TextConverter(ParsingParameters parsingParameters) {
        this.parsingParameters = parsingParameters;
    }


    public Text sortWordsByQuantityOfSpecificLetter(Text text) {
        ArrayList<String> listOfWords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new StringReader(text.getSourceText()))) {
            int charRead;
            int key = 0;
            StringBuffer buffer = new StringBuffer();
            while (( charRead = reader.read() ) != -1) {
                if (charRead == parsingParameters.getLetterToFind().charAt(0)) {
                    key++;
                }
                if (charRead != ' ') {
                    buffer.append((char) charRead);
                } else {
                    listOfWords.add(buffer.toString());
                    buffer.delete(0, buffer.length());
                    key = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String words : listOfWords
                ) {
            stringBuffer.append(words + " ");
        }
        text.setParsedText(stringBuffer.toString());
        return text;
    }

    private Sentence countWordsInSentence(Sentence sentence) {
        int wordsNumber = 0;
        try (BufferedReader reader = new BufferedReader(new StringReader(sentence.getSentense()))) {
            int charRead;
            while (( charRead = reader.read() ) != -1) {
                if (charRead == ' ') {
                    wordsNumber++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sentence.setWordsNumber(wordsNumber);
        return sentence;
    }

    public Text sortTextBySentenceLength(Text text) {
        ArrayList<Sentence> sentences = text.getSentences();
        StringBuffer stringBuffer = new StringBuffer();
        for (Sentence sentence : sentences
                ) {
            countWordsInSentence(sentence);
        }
        Collections.sort(sentences, new SortByWords());
        for (Sentence sentence : sentences
                ) {
            stringBuffer.append(" " + sentence.getWordsNumber() + " " + sentence.getSentense() + ".");
        }
        text.setParsedText(stringBuffer.toString());
        return text;
    }
}
