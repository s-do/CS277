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
