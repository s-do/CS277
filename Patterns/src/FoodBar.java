public class FoodBar extends Amenities{
    /* Type of room */
    protected Room RoomType;
    /* Cost of amenity per night */
    private static final double COST = 10;

    /**
     * Constructor for food bar
     * @param room type of room
     */
    public FoodBar(Room room) {
        RoomType = room;
    }

    /**
     * Gets description of room with food bar amenity
     * @return string description of room with amenity
     */
    @Override
    public String getDescription() {
        return RoomType.getDescription() + " with FoodBar";
    }

    /**
     * Calculates cost of room and food bar amenity
     * @return cost of room and amenity
     */
    @Override
    public double cost() {
        return RoomType.cost() + COST;
    }

    /**
     * String representation of food bar plus room and its cost
     * @return string description of room plus amenity and its cost
     */
    @Override
    public String toString() {
        return this.getDescription() + " Cost: $" + this.cost();
    }
}
