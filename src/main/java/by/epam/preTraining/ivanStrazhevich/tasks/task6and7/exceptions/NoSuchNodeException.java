package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions;

public class NoSuchNodeException extends Exception {
    public NoSuchNodeException() {
    }

    public NoSuchNodeException(String message) {
        super(message);
    }

    public NoSuchNodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchNodeException(Throwable cause) {
        super(cause);
    }

    public NoSuchNodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
