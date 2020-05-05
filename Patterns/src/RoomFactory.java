import java.util.ArrayList;

public class RoomFactory extends RoomMakerAbstract{

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
