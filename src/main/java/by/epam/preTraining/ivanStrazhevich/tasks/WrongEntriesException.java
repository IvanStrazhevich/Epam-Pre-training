package by.epam.preTraining.ivanStrazhevich.tasks;


public class WrongEntriesException extends Exception {

    public WrongEntriesException() {
    }

    public WrongEntriesException(String message) {
        super(message);
    }

    public WrongEntriesException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongEntriesException(Throwable cause) {
        super(cause);
    }

    public WrongEntriesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}


