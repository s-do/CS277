import javax.xml.namespace.QName;

public class Candy extends DessertItem{
    private double weight;
    private double pricePerLB = 0.25;
    // double caloriesLb = 10;

    public Candy() {
        super();
        weight = 0.0;
        //pricePerLB = 0.0;
    }

    //A customize constructor to create a type of candy of this class
    //Price and calories are hard coded when the object is created
    public Candy(String name, double user_weight, int Calories, double PricePerLB){
        super(name);
        weight = user_weight;
        this.calories = Calories;
        this.pricePerLB = PricePerLB;
    }

    //orverriding the getCost() methods of the superclass
    @Override
/*    public double getCost() {
        //cost is calculated by weight * price
        return Math.round(weight * pricePerLB * 100.0) / 100.0;
    }*/

    public double getCost() {
        //cost is calculated by weight * price
        return Math.round(weight * pricePerLB * 100.0) / 100.0;
    }

    public String toString() {
        return getName() + "(Candy) " + "calories: " + getCalories();
    }
}