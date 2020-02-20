/*Name: Long Nguyen & Selina Do
 * Date: 02/19/20
 * Purpose: Cookie class to make cookies object
 * Inputs: None will be ask in the console but flavor, amount, calories and
 * priceperDozen will need to be specified when create an object of this class
 * Output: None
 */
public class Cookie extends DessertItem {
    /* number of cookies per object*/
    private int amount;
    /* price per dozen of each Cookie object*/
    private double pricePerDozen;

    /**
     * Null constructor for Cookie class
     */
    public Cookie() {
        super();
        amount = 0;
        pricePerDozen = 0;
    }

    //A customize constructor to create a type of cookie of this class
    //Price and calories are hard coded when the object is created

    /**
     * Initializes Cookie data
     * @param flavor cookie flavor
     * @param user_amount number of cookies
     * @param Calories calories per cookie
     * @param PricePerDozen price per dozen of cookies
     */
    public Cookie(String flavor, int user_amount, int Calories, double PricePerDozen) {
        super(flavor);
        amount = user_amount;
        super.setCalories(Calories);
        this.pricePerDozen = PricePerDozen;

    }

    /**
     * Change the amount of cookies (dozen)
     * @param amount amount per dozen of cookies
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Change the price of cookies per dozen
     * @param pricePerDozen price per dozen of cookies
     */
    public void setPricePerDozen(double pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    /**
     * Return the amount of cookies (dozen)
     * @return amount of cookies
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Return the price per dozen
     * @return cookie's price per dozen
     */
    public double getPricePerDozen() {
        return pricePerDozen;
    }

    //calculate price by amount of cookies
    //return cost in dollars (like $3.54)
    @Override
    /**
     * Return the cost of cookies base on the amount
     * @return cost of cookies*/
    public double getCost() {
        return Math.round(((amount * pricePerDozen) / 12) * 100.0) / 100.0;
    }

    /**Override toString  */
    public String toString() {
        if (amount == 0.0){
            return getName();
        }
        return getName() + "(Cookie) ";
    }
}

