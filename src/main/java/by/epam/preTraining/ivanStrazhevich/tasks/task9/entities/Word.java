package by.epam.preTraining.ivanStrazhevich.tasks.task9.entities;

public class Word {
    private String word;
    private int lettersNumber;

    public Word(String word, int lettersNumber) {
        this.word = word;
        this.lettersNumber = lettersNumber;
    }

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLettersNumber() {
        return lettersNumber;
    }

    public void setLettersNumber(int lettersNumber) {
        this.lettersNumber = lettersNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Word )) return false;

        Word word1 = (Word) o;

        if (lettersNumber != word1.lettersNumber) return false;
        return word != null ? word.equals(word1.word) : word1.word == null;
    }

    @Override
    public int hashCode() {
        int result = word != null ? word.hashCode() : 0;
        result = 31 * result + lettersNumber;
        return result;
    }
}
