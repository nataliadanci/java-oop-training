package biblioteca;

public class LendingBookNotSupportedException extends Exception{
    public LendingBookNotSupportedException(String message){
        super(message);
    }
}
