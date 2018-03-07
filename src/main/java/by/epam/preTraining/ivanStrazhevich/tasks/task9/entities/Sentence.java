package by.epam.preTraining.ivanStrazhevich.tasks.task9.entities;

public class Sentence {
    String sentence;

    int wordsNumber;

    public Sentence(String sentence, int wordsNumber) {
        this.sentence = sentence;
        this.wordsNumber = wordsNumber;
    }

    public Sentence() {
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentense() {
        return sentence;
    }

    public void setSentense(String sentence) {
        this.sentence = sentence;
    }

    public int getWordsNumber() {
        return wordsNumber;
    }

    public void setWordsNumber(int wordsNumber) {
        this.wordsNumber = wordsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Sentence )) return false;

        Sentence sentence = (Sentence) o;

        if (wordsNumber != sentence.wordsNumber) return false;
        return sentence != null ? sentence.equals(sentence.sentence) : sentence.sentence == null;
    }

    @Override
    public int hashCode() {
        int result = sentence != null ? sentence.hashCode() : 0;
        result = 31 * result + wordsNumber;
        return result;
    }

    @Override
    public String toString() {
        return wordsNumber + " " + sentence;
    }
}
