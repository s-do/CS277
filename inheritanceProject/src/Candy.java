/*Name: Long Nguyen & Selina Do
 * Date: 02/19/20
 * Purpose: The candy class for making candies objects
 * Inputs: None will be ask in the console but weight, name, calories and priceperlb will
 * need to be specify when create an object of this class
 * Output: None
 */

public class Candy extends DessertItem{
    /* weight of the Candy object */
    private double weight;
    /* price per pound of the Candy object */
    private double pricePerLB;

    /**
     * Null constructor for Candy class
     */
    public Candy() {
        super();
        weight = 0.0;
        pricePerLB = 0.0;
    }

    //A customize constructor to create a type of candy of this class
    //Price and calories are hard coded when the object is created

    /**
     * Initializes Candy data
     * @param name name of the object
     * @param user_weight weight of the object
     * @param Calories calories of the object
     * @param PricePerLB price per pound of the object
     */
    public Candy(String name, double user_weight, int Calories, double PricePerLB){
        super(name);
        weight = user_weight;
        super.setCalories(Calories);
        this.pricePerLB = PricePerLB;
    }

    /**
     * Change the weight variable of the object
     * @param weight weight of candy
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Change the price per lb value of the object
     * @param pricePerLB price per pound of candy
     */
    public void setPricePerLB(double pricePerLB) {
        this.pricePerLB = pricePerLB;
    }

    /**
     * Return the weight of Candy
     * @return weight of candy
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Return the price per lb of candy
     * @return the price per pound*/
    public double getPricePerLB() {
        return pricePerLB;
    }

    //orverriding the getCost() methods of the superclass
    @Override
    /**
     * Return the cost of Candy with a certain amount of weight
     * @return cost of Candy
     */
    public double getCost() {
        //cost is calculated by weight * price
        return Math.round(weight * pricePerLB * 100.0) / 100.0;
    }

    /**
     * Override toString of Candy class*/
    public String toString() {
        if (weight == 0.0){
            return getName();
        }
        return getName() + "(Candy) ";
    }
}