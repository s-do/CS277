public class WhippedCream extends IceCreamDecorator {
    protected Dessert flavor;
    public static final double COST = 0.25;

    public WhippedCream(Dessert flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return flavor.getDescription() + " with a whipped cream";
    }

    @Override
    public double cost() {
        return flavor.cost() + COST;
    }
}
