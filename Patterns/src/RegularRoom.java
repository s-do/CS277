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
