public class Sundae extends IceCream {
    private String topping;

    public Sundae() {
        super();
    }

    public Sundae(String flavor, int Calories, double Icecost, String Topping, double topCost) {
        super(flavor, Calories, (Icecost + topCost));
        this.topping = Topping;
    }

    public double getCost() {
        return (int) Math.round(this.getCost() * 100);
    }

    public String toString() {
        return this.name + "(Sundae ) "+ "calories: " + calories + " cost: " + this.getCost();
    }


    //public String toString(0)
}
