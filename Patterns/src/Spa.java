/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: Extends the amenities class.
  Help customers relax after a long day and have a good time with the Spa feature at the cost of $20 per night.
  Inputs: Room Type
  Outputs: Room with Spa included
*/

public class Spa extends Amenities{
    /* Type of room */
    protected Room RoomType;
    /* Cost of amenity per night */
    private static final double COST = 20;

    /**
     * Constructor for spa
     * @param room type of room
     */
    public Spa(Room room) {
        RoomType = room;
    }

    /**
     * Gets description of room with spa amenity
     * @return string description of room with amenity
     */
    @Override
    public String getDescription() {
        return RoomType.getDescription() + " with Spa";
    }

    /**
     * Calculates cost of room and spa amenity
     * @return cost of room and amenity
     */
    @Override
    public double cost() {
        return RoomType.cost() + COST;
    }

    /**
     * String representation of spa plus room and its cost
     * @return string description of room plus amenity and its cost
     */
    @Override
    public String toString() {
        return this.getDescription() + " cost: $" + cost();
    }
}
