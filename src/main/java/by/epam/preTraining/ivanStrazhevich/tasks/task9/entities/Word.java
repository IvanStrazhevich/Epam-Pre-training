package by.epam.preTraining.ivanStrazhevich.tasks.task9.entities;

public class Word {
    private String word;
    private int letterNumbers;

    public Word(String word, int letterNumbers) {
        this.word = word;
        this.letterNumbers = letterNumbers;
    }

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLetterNumbers() {
        return letterNumbers;
    }

    public void setLetterNumbers(int letterNumbers) {
        this.letterNumbers = letterNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Word )) return false;

        Word word1 = (Word) o;

        if (letterNumbers != word1.letterNumbers) return false;
        return word != null ? word.equals(word1.word) : word1.word == null;
    }

    @Override
    public int hashCode() {
        int result = word != null ? word.hashCode() : 0;
        result = 31 * result + letterNumbers;
        return result;
    }
}
