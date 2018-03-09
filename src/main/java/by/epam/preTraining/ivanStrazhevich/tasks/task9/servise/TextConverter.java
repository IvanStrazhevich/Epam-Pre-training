package by.epam.preTraining.ivanStrazhevich.tasks.task9.servise;

import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.ParsingParameters;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Sentence;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Text;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.entities.Word;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.exceptions.EmptyArrayExtendedException;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.interfaces.Convertable;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.util.SortBySpecialLetterNumber;
import by.epam.preTraining.ivanStrazhevich.tasks.task9.util.SortByWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TextConverter implements Convertable{
    private ParsingParameters parsingParameters;

    public TextConverter(ParsingParameters parsingParameters) {
        this.parsingParameters = parsingParameters;
    }

    private Word countSpecificLetterInWord(Word word) {
        int letterNumbers = 0;
        try (BufferedReader reader = new BufferedReader(new StringReader(word.getWord()))) {
            int charRead;
            while (( charRead = reader.read() ) != -1) {
                if (charRead == parsingParameters.getLetterToFind().charAt(0)) {
                    letterNumbers++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        word.setLetterNumbers(letterNumbers);
        return word;
    }


    public Text sortWordsByQuantityOfSpecificLetter(Text text) {
        ArrayList<Word> words = text.getWords();
        StringBuffer stringBuffer = new StringBuffer();
        if (words != null) {
            for (Word word : words
                    ) {
                countSpecificLetterInWord(word);
            }
            Collections.sort(words, new SortBySpecialLetterNumber());
            TreeSet<Word> alphabetical = new TreeSet<>();
            for (Word word : words
                    ) {
                alphabetical.add(word);
            }
            for (Word word : alphabetical
                    ) {
                stringBuffer.append(" " + word.getLetterNumbers() + " " + word.getWord() + " ");
            }
            text.setParsedText(stringBuffer.toString());
        } else {
            try {
                throw new EmptyArrayExtendedException("There is no parsed words, use TextParser on Text");
            } catch (EmptyArrayExtendedException e) {
                e.printStackTrace();
            }
        }
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
        if(sentences!=null) {
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
        } else {
            try {
                throw new EmptyArrayExtendedException("There is no parsed sentences, use TextParser on Text");
            } catch (EmptyArrayExtendedException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
}
