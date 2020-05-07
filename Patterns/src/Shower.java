/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: Extends the amenities class.
  Prevent roach customers from dying with anti-insecticide shower which reduce the mortality rate to 25% at the cost
  of $25 per night.
  Inputs: Room Type
  Outputs: room with shower included.
*/
public class Shower extends Amenities {
    /* Type of room */
    protected Room RoomType;
    /* Cost of amenity per night */
    private static final double COST = 25;

    /**
     * Constructor for shower
     * @param room type of room
     */
    public Shower(Room room) {
        RoomType = room;
    }

    /**
     * Calculates cost of room and shower amenity
     * @return cost of room and amenity
     */
    @Override
    public double cost() {
        return RoomType.cost() + COST;
    }

    /**
     * Gets description of room with shower amenity
     * @return string description of room with amenity
     */
    @Override
    public String getDescription() {
        return RoomType.getDescription() + " with Resistant Shower";
    }

    /**
     * String representation of shower plus room and its cost
     * @return string description of room plus amenity and its cost
     */
    @Override
    public String toString() {
        return this.getDescription() + " Cost: $" + this.cost();
    }
}
