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
