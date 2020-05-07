/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: A concrete class that represent a deluxe room that extends from the room abstract class and
  has a base cost of $75 and can be added with amenities. An upgrade from the regular room.
  Inputs: None
  Outputs: None
*/
public class DeluxeRoom extends Room {
    /* Price of a room per night */
    private static final double BASERATE = 75;

    /**
     * Constructor for deluxe room
     */
    public DeluxeRoom() {
        description = "Deluxe Room";
    }

    /**
     * Calculates cost of deluxe room per night
     * @return cost of deluxe room
     */
    @Override
    public double cost() {
        return BASERATE;
    }

    /**
     * String representation of deluxe type room
     * @return type of room as a string
     */
    @Override
    public String toString() {
        return "Deluxe room";
    }
}
