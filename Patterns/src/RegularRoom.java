/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: A concrete class that represent a regular price room that extends from the room abstract class and
  has a base cost of $50 and can be added with amenities
  Inputs: None
  Outputs: None
*/
public class RegularRoom extends Room {
    /* Price of a room per night */
    private static final double BASERATE = 50;

    /**
     * Constructor for regular room
     */
    public RegularRoom() {
        description = "Regular room";
    }

    /**
     * Calculates cost of regular room per night
     * @return cost of regular room
     */
    @Override
    public double cost() {
        return BASERATE;
    }

    /**
     * String representation of regular type room
     * @return type of room as a string
     */
    @Override
    public String toString() {
        return "Regular room";
    }
}
