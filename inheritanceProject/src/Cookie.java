public class Cookie extends DessertItem {
    private int amount;
    private double pricePerC = 0.50;


    public Cookie() {
        super();
        amount = 0;
    }

    //A customize constructor to create a type of cookie of this class
    //Price and calories are hard coded when the object is created
    public Cookie(String user_name, int user_amount, int calories, double pricePerC) {
        super(user_name);
        amount = user_amount;
        this.calories = calories;
        this.pricePerC = pricePerC;

    }

    //calculate price by amount of cookies.
    @Override
    public double getCost() {
        int costCent = (int) Math.round(amount * pricePerC);
        double costDollar = costCent / 100.0;
        return costDollar;
    }

    public String toString() {
        return getName() + "(Cookie) " + "calories: " + getCalories();
    }
}

