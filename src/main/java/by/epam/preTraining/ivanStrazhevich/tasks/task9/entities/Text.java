package by.epam.preTraining.ivanStrazhevich.tasks.task9.entities;

import java.util.ArrayList;

public class Text {
    private String sourceText;
    private String parsedText;
    private ArrayList<Sentence> sentences;
    private ArrayList<Word> words;
    private ArrayList<Character> chars;

    public Text(String sourceText, String parsedText, ArrayList<Sentence> sentences, ArrayList<Word> words, ArrayList<Character> chars) {
        this.sourceText = sourceText;
        this.parsedText = parsedText;
        this.sentences = sentences;
        this.words = words;
        this.chars = chars;
    }

    public Text() {
    }

    public String getSourceText() {
        return sourceText;
    }

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public String getParsedText() {
        return parsedText;
    }

    public void setParsedText(String parsedText) {
        this.parsedText = parsedText;
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    public ArrayList<Character> getChars() {
        return chars;
    }

    public void setChars(ArrayList<Character> chars) {
        this.chars = chars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Text )) return false;

        Text text = (Text) o;

        if (sourceText != null ? !sourceText.equals(text.sourceText) : text.sourceText != null) return false;
        if (parsedText != null ? !parsedText.equals(text.parsedText) : text.parsedText != null) return false;
        if (sentences != null ? !sentences.equals(text.sentences) : text.sentences != null) return false;
        if (words != null ? !words.equals(text.words) : text.words != null) return false;
        return chars != null ? chars.equals(text.chars) : text.chars == null;
    }

    @Override
    public int hashCode() {
        int result = sourceText != null ? sourceText.hashCode() : 0;
        result = 31 * result + ( parsedText != null ? parsedText.hashCode() : 0 );
        result = 31 * result + ( sentences != null ? sentences.hashCode() : 0 );
        result = 31 * result + ( words != null ? words.hashCode() : 0 );
        result = 31 * result + ( chars != null ? chars.hashCode() : 0 );
        return result;
    }
}
