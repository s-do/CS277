public class IceCream extends DessertItem {
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
		return (int) Math.round(this.cost * 100);
	}

	public int getCalories() {
		return this.calories;
	}

	public String toString() {
		return this.name + "(IceCream) " + "calories: " + calories + " cost: " + cost;
	}

}
