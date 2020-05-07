/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: MasterRoach allow customer to pay the motel cost the same way the credit card works.
  Inputs: Name of owner, Card Number, Security Code, Date of Expiration
  Outputs: None
*/
public class MasterRoach implements Payment{
    /* name on card */
    private String name;
    /* security code on card */
    private String cvv;
    /* card number */
    private String cardNum;
    /* expiration date of card */
    private String dateOfExp;

    /**
     * Default constructor of MasterRoach class
     */
    public MasterRoach(){
        name = "John";
        cvv = "123";
        cardNum = "987654321";
        dateOfExp = "05/23";
    }

    /**
     * Constructor that changes the default instances of the class
     * @param roachName name of roach
     * @param roachCVV security number of card
     * @param roachCard card number
     * @param roachDateExp date of expiry of card
     */
    public MasterRoach(String roachName, String roachCVV, String roachCard, String roachDateExp){
        name = roachName;
        cvv = roachCVV;
        cardNum = roachCard;
        dateOfExp = roachDateExp;
    }

    /**
     * Tells how much was paid with card
     * @param amount price paid by card
     */
    @Override
    public void pay(double amount) {
        System.out.println("Payment from MasterRoach credit card: " + amount);
    }

    /**
     * String representation of MasterRoach class
     * @return string description of the colony's card details
     */
    @Override
    public String toString() {
        return "MasterRoach name: " + name +
                ", Security code: " + cvv +
                ", Card number: " + cardNum +
                ", Date of expiry: " + dateOfExp;
    }

    /**
     * Return name of the card owner
     **/
    public String getName() {
        return name;
    }

    /**
     * Set the name on the card
     * @param name name on card
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the security code on the card
     **/
    public String getCvv() {
        return cvv;
    }

    /**
     * Return the card numbers
     **/
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Return the expiration date of the card
     **/
    public String getDateOfExp() {
        return dateOfExp;
    }

}
