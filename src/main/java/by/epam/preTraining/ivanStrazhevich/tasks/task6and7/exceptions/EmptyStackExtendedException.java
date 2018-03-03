package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions;

public class EmptyStackExtendedException extends Exception {

    public EmptyStackExtendedException() {
    }
    public EmptyStackExtendedException(String message) {
        super(message);
    }

    public EmptyStackExtendedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyStackExtendedException(Throwable cause) {
        super(cause);
    }

    public EmptyStackExtendedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
