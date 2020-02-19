import javax.management.DescriptorAccess;

public abstract class DessertItem implements Comparable {

    protected String name;
    private int calories;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }
    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }

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
    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    //override compareto method.
    @Override
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
