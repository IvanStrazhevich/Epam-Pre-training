package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions;

public class EmptyQueueExtendedException extends Exception {

    public EmptyQueueExtendedException() {
    }

    public EmptyQueueExtendedException(String message) {
        super(message);
    }

    public EmptyQueueExtendedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyQueueExtendedException(Throwable cause) {
        super(cause);
    }

    public EmptyQueueExtendedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}