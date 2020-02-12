public abstract class Candy extends DessertItem{
    private double weight;
    private double pricePerLB;

    public Candy() {
        weight = 0.0;
        pricePerLB = 0.0;
    }

    public Candy(double w, double lb){
        weight = w;
        pricePerLB = lb;
    }

    @Override
    public double getCost() {
        return 0;
    }
}
