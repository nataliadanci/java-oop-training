package app;

public class OfferNotFoundException extends RuntimeException{

    public OfferNotFoundException(String message){
        super(message);
    }
}
