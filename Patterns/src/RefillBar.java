public class RefillBar extends Amenities{
    protected Room RoomType;
    private static final double COST = 5;

    public RefillBar(Room room) {
        RoomType = room;
    }

    @Override
    public double cost() {
        return RoomType.cost() + COST;
    }

    @Override
    public String getDescription() {
        return RoomType.getDescription() + " with Auto Refill Bar";
    }

    @Override
    public String toString() {
        return this.getDescription() + " Cost: $" + this.cost();
    }
}
