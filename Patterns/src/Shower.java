public class Shower extends Amenities {
    protected Room RoomType;
    private static final double COST = 25;

    public Shower(Room room) {
        RoomType = room;
    }

    @Override
    public double cost() {
        return RoomType.cost() + COST;
    }

    @Override
    public String getDescription() {
        return RoomType.getDescription() + " with Resistant Shower";
    }

    @Override
    public String toString() {
        return RoomType + " with Shower";
    }
}
