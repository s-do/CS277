/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: Extends the amenities class.
  The refill bar amenities that auto refill the room's bar with an extra cost of $5 per night.
  Inputs: The room type
  Outputs: Room with refill bar included
*/

public class RefillBar extends Amenities{
    /* Type of room */
    protected Room RoomType;
    /* Cost of amenity per night */
    private static final double COST = 5;

    /**
     * Constructor for refill bar
     * @param room type of room
     */
    public RefillBar(Room room) {
        RoomType = room;
    }

    /**
     * Calculates cost of room and refill bar amenity
     * @return cost of room and amenity
     */
    @Override
    public double cost() {
        return RoomType.cost() + COST;
    }

    /**
     * Gets description of room with refill bar amenity
     * @return string description of room with amenity
     */
    @Override
    public String getDescription() {
        return RoomType.getDescription() + " with Auto Refill Bar";
    }

    /**
     * String representation of refill bar plus room and its cost
     * @return string description of room plus amenity and its cost
     */
    @Override
    public String toString() {
        return this.getDescription() + " Cost: $" + this.cost();
    }
}
