public class Suite extends Room {
    private static final double BASERATE = 100;

    public Suite() {
        description = "Suite";
    }
    @Override
    public double cost() {
        return BASERATE;
    }

    @Override
    public String toString() {
        return "Suite";
    }
}
