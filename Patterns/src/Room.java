import java.util.ArrayList;

/** An abstract class that represent a room **/

public abstract class Room {
    /* description of the room */
    protected String description;
    /* roach colony inside room */
    private RoachColony customer;
    /* list of amenities in room (value at check-in) */
    private ArrayList<String> amenitiesList;

    //fixme: idk what to put here
    public Room (){
    }

    /**
     * Gets the list of amenities in room
     * @return list of amenities in room
     */
    public ArrayList<String> getAmenitiesList() {
        return amenitiesList;
    }

    /**
     * Sets the list of amenities in room
     * @param amenitiesList list of amenities
     */
    public void setAmenitiesList(ArrayList<String> amenitiesList) {
        this.amenitiesList = amenitiesList;
    }

    /**
     * Gets description of room
     * @return string description of room
     */
    public String getDescription() {
            return description;
    }

    /**
     * Calculates cost of room per night
     * @return cost of room
     */
    public abstract double cost();

    /**
     * String representation room
     * @return room as a string
     */
    @Override
    public String toString() {
        return "Room description: " + description +
                ", Customer: " + customer +
                ", Amenities list: " + amenitiesList;
    }
}
