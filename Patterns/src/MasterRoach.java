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
}
