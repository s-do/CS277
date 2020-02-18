public class Cookie extends DessertItem {
    private int amount;
    private double pricePerDozen;


    public Cookie() {
        super();
        amount = 0;
        pricePerDozen = 0;
    }

    //A customize constructor to create a type of cookie of this class
    //Price and calories are hard coded when the object is created
    public Cookie(String flavor, int user_amount, int Calories, double PricePerDozen) {
        super(flavor);
        amount = user_amount;
        this.calories = Calories;
        this.pricePerDozen = PricePerDozen;

    }

    //calculate price by amount of cookies
    //return cost in dollars (like $3.54)
    @Override
    public double getCost() {
        return Math.round(amount * pricePerDozen * 100.0) / 100.0;
    }

    public String toString() {
        return getName() + "(Cookie) " + "calories: " + getCalories();
    }
}

