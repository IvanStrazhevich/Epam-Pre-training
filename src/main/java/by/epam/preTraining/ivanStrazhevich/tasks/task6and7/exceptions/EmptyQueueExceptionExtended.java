package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions;

public class EmptyQueueExceptionExtended extends Exception {

    public EmptyQueueExceptionExtended() {
    }

    public EmptyQueueExceptionExtended(String message) {
        super(message);
    }

    public EmptyQueueExceptionExtended(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyQueueExceptionExtended(Throwable cause) {
        super(cause);
    }

    public EmptyQueueExceptionExtended(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}