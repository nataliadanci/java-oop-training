package app;

public class ValidationFailedException extends RuntimeException{

    public ValidationFailedException(String message){
        super(message);
    }
}
