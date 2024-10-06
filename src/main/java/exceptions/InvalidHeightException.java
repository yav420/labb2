package exceptions;

public class InvalidHeightException extends RuntimeException {
    public InvalidHeightException(String message) {
        super(message);
    }
}