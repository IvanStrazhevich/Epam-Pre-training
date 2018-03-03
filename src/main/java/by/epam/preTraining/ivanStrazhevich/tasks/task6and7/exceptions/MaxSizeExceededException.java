package by.epam.preTraining.ivanStrazhevich.tasks.task6and7.exceptions;

public class MaxSizeExceededException extends Exception {

    public MaxSizeExceededException() {
    }

    public MaxSizeExceededException(String message) {
        super(message);
    }

    public MaxSizeExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaxSizeExceededException(Throwable cause) {
        super(cause);
    }

    public MaxSizeExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

