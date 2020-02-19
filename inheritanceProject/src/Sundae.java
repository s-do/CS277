public class Sundae extends IceCream {
    private String topping;

    public Sundae() {
        super();
    }

    public Sundae(String flavor, int Calories, double Icecost, String Topping, double topCost) {
        //adding the icecream cost and the topping cost and saved it to the super cost
        super(flavor, Calories, (Icecost + topCost));
        this.topping = Topping;
    }

    //get the cost instance variable from the super class.
    public double getCost() {
        return Math.round(super.getCost() * 100) / 100.0;
    }

    public String toString() {
        return this.name + "(Sundae ) "+ "calories: " + calories + " cost: " + this.getCost();
    }


    //public String toString(0)
}
