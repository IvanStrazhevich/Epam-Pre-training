package by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions;

public class ExtendedEmptyStackException extends Exception {

    public ExtendedEmptyStackException() {
    }
    public ExtendedEmptyStackException(String message) {
        super(message);
    }

    public ExtendedEmptyStackException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExtendedEmptyStackException(Throwable cause) {
        super(cause);
    }

    public ExtendedEmptyStackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
