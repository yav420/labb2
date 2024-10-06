package exceptions;

public class InvalidDimensionException extends RuntimeException {
    public InvalidDimensionException(String message) {
        super(message);
    }
}