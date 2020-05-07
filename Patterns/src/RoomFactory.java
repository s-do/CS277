/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: Make the required room base on the customer request which is known at Runtime.
  Inputs: Required room type, and the list of amenities to be added.
  Outputs: The room required with or without amenities.
*/
import java.util.ArrayList;

/**
 * A factory pattern that makes rooms
 */
public class RoomFactory extends RoomMakerAbstract{
    /**
     * Makes rooms for the hotel
     * @param roomType type of room
     * @param amenitiesList list of amenities
     * @return type of room with amenities
     */
    @Override
    public Room makeRoom(String roomType, ArrayList<String> amenitiesList) {
        Room customerRoom = null;
        //Only check in if there are available rooms ( or not empty)
        //change the first room in the list to the type customer want

        if (roomType.equals("Suite")) {
            customerRoom = new Suite();
        } else if (roomType.equals("Deluxe")) {
            customerRoom = new DeluxeRoom();
        } else {
            customerRoom = new RegularRoom();
        }

        //iterate through the amenities and add them. Wrap the room obj with the amenities.
        for (String amenity : amenitiesList) {
            if (amenity.equals("FoodBar")) {
                customerRoom = new FoodBar(customerRoom);
            } else if (amenity.equals("Spa")) {
                customerRoom = new Spa(customerRoom);
            } else if (amenity.equals("RefillBar")) {
                customerRoom = new RefillBar(customerRoom);
            } else if (amenity.equals("Shower")) {
                customerRoom = new Shower(customerRoom);
            }
        }
        return customerRoom;
    }
}
