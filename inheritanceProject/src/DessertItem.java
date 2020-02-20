/*Name: Long Nguyen & Selina Do
 * Date: 02/19/20
 * Purpose: The supper class of the project so that other dessert items
 * can inherit properties and method from this class
 * Inputs: None
 * Output: None
 */
public abstract class DessertItem implements Comparable {
    /*name of DessertItem object */
    protected String name;
    /*calories of the DessertItem object */
    private int calories;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }

    /**
     * Initializes DessertItem data
     * @param name name of DessertItem
     */
    public DessertItem(String name) {
        this.name = name;
    }

    /**
     * Sets the name of the DessertItem
     * @param name name that will be set to the DessertItem
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }

    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract double getCost();

    //added calories methods

    /**
     * Change calories of DessertItem
     * @param calories calorie value that will be set to the DessertItem
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Return calories of DessertItem
     * @return calories of DessertItem
     */
    public int getCalories() {
        return calories;
    }

    //override compareTo method.
    @Override
    /**
     * Compare between different dessert items
     * @param item the item to be compared with
     * @return int 1 if it is larger, -1 if it is smaller, 0 if they are equal
     */
    public int compareTo(Object item) {
        if (this.getCalories() > ((DessertItem) item).getCalories()) {
            return 1;
        } else if (this.getCalories() < ((DessertItem) item).getCalories()) {
            return -1;
        } else {
            return 0;
        }
    }

    //find the larger between the items, return 1 if item1 is larger than item2.
    /**
     * Compare between 2 items and return the larger object
     * @param item1 first item
     * @param item2 second item
     * @return larger object
     */
    public static DessertItem max(DessertItem item1, DessertItem item2) {
        if (item1.compareTo(item2) > 0) {
            return item1;
        }
        else if (item1.compareTo(item2) < 0) {
            return item2;
        }
        else {
            return item1;
        }
    }
}
