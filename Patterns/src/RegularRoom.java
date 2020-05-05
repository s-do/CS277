public class RegularRoom extends Room {
    private static final double BASERATE = 50;

    public RegularRoom() {
        description = "Regular room with ok price";
    }

    @Override
    public double cost() {
        return BASERATE;
    }

    @Override
    public String toString() {
        return "Regular room is bank for your buck";
    }
}