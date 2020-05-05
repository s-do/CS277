/** An abstract class that represent a room**/

public abstract class Room {
    protected String description;
    //Fixme: this static in only works if amenities does not inherit from this class
/*    static int roomNumberCount = 100;
    private int roomNumber = roomNumberCount;*/
    private RoachColony customer;

    public Room() {
        /*roomNumberCount = roomNumberCount + 1;*/
    }

/*    public int getRoomNumber() {
        return roomNumber;
    }*/

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
