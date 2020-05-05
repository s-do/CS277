public class DeluxeRoom extends Room {
    private static final double BASERATE = 75;

    public DeluxeRoom() {
        description = "Deluxe Room";
    }
    @Override
    public double cost() {
        return BASERATE;
    }

    @Override
    public String toString() {
        return "Deluxe room";
    }
}
