/*Name: Selina Do and Long Nguyen
  Date: 03/16/2020
  Purpose: Display a message and stop the program if an invalid type of service was provided
  Inputs: None
  Outputs: None
  */
public class UnknownTransactionException extends IllegalArgumentException{

    /** A default constructor for UnknownTransaction exception**/
    public UnknownTransactionException(){}

    /** A constructor for UnknownTransaction exception that take in a message**/
    public UnknownTransactionException(String message) {
        super(message);
    }
}
