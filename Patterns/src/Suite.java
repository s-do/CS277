/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: A concrete class that represent a suit that extends from the room abstract class and
  has a base cost of $100 and can be added with amenities. The most high-end room that the motel
  offer which might drain your wallet if you stayed for a few nights.
  Inputs: None
  Outputs: None
*/
public class Suite extends Room {
    /* Price of a room per night */
    private static final double BASERATE = 100;

    /**
     * Constructor for suite room
     */
    public Suite() {
        description = "Suite";
    }

    /**
     * Calculates cost of suite room per night
     * @return cost of suite room
     */
    @Override
    public double cost() {
        return BASERATE;
    }

    /**
     * String representation of suite type room
     * @return type of room as a string
     */
    @Override
    public String toString() {
        return "Suite";
    }
}
