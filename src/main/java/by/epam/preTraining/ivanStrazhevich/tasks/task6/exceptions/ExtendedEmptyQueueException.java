package by.epam.preTraining.ivanStrazhevich.tasks.task6.exceptions;

public class ExtendedEmptyQueueException extends Exception {

    public ExtendedEmptyQueueException() {
    }

    public ExtendedEmptyQueueException(String message) {
        super(message);
    }

    public ExtendedEmptyQueueException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExtendedEmptyQueueException(Throwable cause) {
        super(cause);
    }

    public ExtendedEmptyQueueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}