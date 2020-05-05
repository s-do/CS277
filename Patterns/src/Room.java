/** An abstract class that represent a room**/

public abstract class Room {
    protected String description;
    private RoachColony customer;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
