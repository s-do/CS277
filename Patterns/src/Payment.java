/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: The interface implement strategy pattern to help customer pay with multiple methods such as
  RoachPal and MasterRoach.
  Inputs: None
  Outputs: None
*/

/** This is an interface that implements the strategy pattern
 * all payment classes will implement this class**/
public interface Payment {
    /**
     * Gets the amount of when paid
     * @param amount price when paying
     */
    public void pay(double amount);
}
