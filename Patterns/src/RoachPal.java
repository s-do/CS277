/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: Let customers pay the bill with RoachPal but required name and email in order to proceed.
  Inputs: Name and email of the owner
  Outputs: None
*/

public class RoachPal implements Payment{
    /* Name of roach colony */
    private String name;
    /* Email of roach colony */
    private String email;

    /**
     * Default constructor for RoachPal class
     */
    public RoachPal(){
        name = "John";
        email = "john@gmail.com";
    }

    /**
     * Constructor that changes the default instances of the class
     * @param roachName roach colony name
     * @param roachEmail roach colony email
     */
    public RoachPal(String roachName, String roachEmail){
        name = roachName;
        email = roachEmail;
    }

    /**
     * Tells how much was paid for the bill
     * @param amount price when paying
     */
    @Override
    public void pay(double amount) {
        System.out.println("Payment from RoachPal: " + amount + "\n" + "email: " + this.email);
    }

    /**
     * String representation of RoachPal class
     * @return string description of the colony's account details
     */
    @Override
    public String toString() {
        return "RoachPal name: " + name +
                ", Email: " + email;
    }

    /**
     * Return the name of owner on Roach Pal
     **/
    public String getName() {
        return name;
    }

    /**
     * Set the name of the card owner
     * @param name name of Roach Pal owner
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the email of Roach Pal owner
     **/
    public String getEmail() {
        return email;
    }

    /**
     * Set the email of Roach Pal owner
     * @param email email address of owner
     **/
    public void setEmail(String email) {
        this.email = email;
    }
}
