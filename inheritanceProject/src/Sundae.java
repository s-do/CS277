/*Name: Long Nguyen & Selina Do
 * Date: 02/19/20
 * Purpose: Sundae class to make Sundae objects
 * Inputs: None will be asked in the console but flavor, calories, ice-cream cost, topping and
 * topping cost will need to be specified when create an object of this class
 * Output: None
 */

public class Sundae extends IceCream {
    private String topping;

    /**
     * Null constructor for Sundae class
     */
    public Sundae() {
        //super();
        topping = "";
    }

    /**
     * Initializes Sundae data
     */
    public Sundae(String flavor, int Calories, double Icecost, String Topping, double topCost) {
        //adding the icecream cost and the topping cost and saved it to the super cost
        super(flavor, Calories, (Icecost + topCost));
        this.topping = Topping;
    }

    /**
     * Change the type of topping
     * @param topping type of topping
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }

    /**
     * Return type of topping
     * @return type of topping*/
    public String getTopping() {
        if (topping == ""){
            return topping;
        }
        return topping + "(Topping) ";
    }

    //get the cost instance variable from the super class.
    /**
     * Return cost of Sundae by the sum of toppping and ice-cream
     * @return cost of Sundae*/
    public double getCost() {
        return Math.round(super.getCost() * 1000.0) / 1000.0;
    }

    /**
     * Override toString */
    public String toString() {
        //return this.name + "(Sundae ) "+ "calories: " + calories + " cost: " + this.getCost();
        if (getName() == ""){
            return "with";
        }
        return getName() + "(Sundae) ";
    }
}
