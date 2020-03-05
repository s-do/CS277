/*Name: Selina Do and Long Nguyen
  Date: 03/04/20
  Purpose: Store all product objects in an ArrayList type object
  Inputs: None
  Outputs: None*/
public class Card {
    private double balance;
    private String name;

    /** Null constructor for debit card */
    public Card() {
        name = "Nova";
        balance = 0;
    }

    /**Return credit card owner's name
     * @return name on card */
    public String getName() {
        return name;
    }

    /**Change the owner name on card
     * @param name owner's name */
    public void setName(String name) {
        this.name = name;
    }

    /**Customizable constructor
     * @param usrName card owner
     * @param Balance card balance*/
    public Card(String usrName, double Balance) {
        balance = Balance;
        name = usrName;
    }

    /**Return the balance of the card
     * @return card's balance */
    public double getBalance() {
        return balance;
    }

    /**Change card balance
     * @param balance card's balance */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**Reduce balance of the card when buy items
     * @param cost cost of the product */
    public void subtractBalance(double cost) {
        balance -= cost;
    }

    @Override
    public String toString() {
        return "Name on Card: " + name + " balance: " + balance;
    }
}