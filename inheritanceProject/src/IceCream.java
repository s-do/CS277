public abstract class IceCream extends DessertItem {
	protected double cost;

	public IceCream() {
		super();
		this.cost = 0;
	}

	public IceCream(String flavor, int Calories, double Cost) {
		super(flavor);
		this.calories = Calories;
		this.cost = Cost;
	}

	public double getCost() {
		return (int) Math.round(this.cost);
	}

	public String toString() {
		return this.name + "(IceCream) " + "calories: " + calories + " cost: " + cost;
	}

}
