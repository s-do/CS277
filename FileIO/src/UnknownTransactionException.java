//this class is called if the an unknown service is enter
public class UnknownTransactionException extends IllegalArgumentException{

    public UnknownTransactionException(){}

    public UnknownTransactionException(String message) {
        super(message);
    }
}
