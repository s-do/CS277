public class Cookie extends DessertItem {
    private int amount;
    private double pricePerDozen = 50;


    public Cookie() {
        super();
        amount = 0;
    }

    //A customize constructor to create a type of cookie of this class
    //Price and calories are hard coded when the object is created
    public Cookie(String user_name, int user_amount, int calories, double pricePerDozen) {
        super(user_name);
        amount = user_amount;
        this.calories = calories;
        this.pricePerDozen = pricePerDozen;

    }

    //calculate price by amount of cookies
    //return cost in dollars (like $3.54)
    @Override
    public double getCost() {
        return Math.round(amount * pricePerDozen * 100.0) / 100.0 ;
    }

    public String toString() {
        return getName() + "(Cookie) " + "calories: " + getCalories();
    }
}

