/*Name: Long Nguyen & Selina Do
 * Date: 02/19/20
 * Purpose: Icecream class to make Ice-cream object and for Sundae to inherit from
 * Inputs: None will be ask in the console but flavor, calories and
 * cost will need to be specified when create an object of this class
 * Output: None
 */
public class IceCream extends DessertItem {
	 private double cost;

	/**
	 * Null constructor for ice-cream class
	 */
	public IceCream() {
		super();
		this.cost = 0;
	}

	/**
	 * Initializes ice-cream data
	 */
	public IceCream(String flavor, int Calories, double Cost) {
		super(flavor);
		super.setCalories(Calories);
		this.cost = Cost;
	}

	/**
	 * Return the cost of Ice-cream
	 * @return cost of ice-cream*/
	public double getCost() {
		return Math.round(this.cost * 100) / 100.0;
	}

	/**
	 * Return calories of ice-cream
	 * @return calories of ice-cream*/
	public int getCalories() {
		return super.getCalories();
	}

	/**
	 * Override toString
	 */
	public String toString() {
		//return this.name + "(IceCream) " + "calories: " + calories + " cost: " + cost;
		if (cost == 0.0){
			return getName();
		}
		return getName() + "(IceCream) ";
	}

}
