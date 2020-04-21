// a concrete instance of an ice cream
public class Vanilla extends Dessert{
    public static final double COST = 1.25;

    public Vanilla(){
        description = "Creamy vanilla";
    }

    @Override
    public double cost() {
        return COST;
    }
}
