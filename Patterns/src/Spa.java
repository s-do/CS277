public class Spa extends Amenities{
    protected Room RoomType;
    private static final double COST = 20;


    public Spa(Room room) {
        RoomType = room;
    }
    @Override
    public String getDescription() {
        return RoomType.getDescription() + " with Spa";
    }

    @Override
    public double cost() {
        return RoomType.cost() + COST;
    }
}
