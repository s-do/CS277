public class Suite extends Room {
    private static final double BASERATE = 100;

    public Suite() {
        description = "Suite, drain you money type of room";
    }
    @Override
    public double cost() {
        return BASERATE;
    }

    @Override
    public String toString() {
        return "Suite, give me all your money";
    }
}
