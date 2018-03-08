package by.epam.preTraining.ivanStrazhevich.tasks.task9.exceptions;

public class EmptyArrayExtendedException extends Exception {

    public EmptyArrayExtendedException() {
    }

    public EmptyArrayExtendedException(String message) {
        super(message);
    }

    public EmptyArrayExtendedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyArrayExtendedException(Throwable cause) {
        super(cause);
    }

    public EmptyArrayExtendedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}