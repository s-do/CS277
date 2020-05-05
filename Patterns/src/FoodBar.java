public class FoodBar extends Amenities{
    protected Room RoomType;
    private static final double COST = 10;

    public FoodBar(Room room) {
        RoomType = room;
    }
    @Override
    public String getDescription() {
        return RoomType.getDescription() + " with FoodBar";
    }

    @Override
    public double cost() {
        return RoomType.cost() + COST;
    }

    @Override
    public String toString() {
        return this.getDescription() + " Cost: $" + this.cost();
    }
}
