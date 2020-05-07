/** This is an interface that implements the strategy pattern
 * all payment classes will implement this class**/
public interface Payment {
    /**
     * Gets the amount of when paid
     * @param amount price when paying
     */
    public void pay(double amount);
}
