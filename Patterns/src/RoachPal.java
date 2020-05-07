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
}
