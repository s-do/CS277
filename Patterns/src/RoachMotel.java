import java.util.ArrayList;
/** This class use the singleton pattern which make sure
 * there will be only one instance of it**/
public class RoachMotel {
    private static RoachMotel instance = new RoachMotel();
    private ArrayList<Room> availableRoom = new ArrayList<>();
    private ArrayList<Room> occupiedRoom = new ArrayList<>();
    int NumberRooms = 5;

    //constructor is private to prevent making new instances using new
    private RoachMotel(){}

    public static RoachMotel getInstance() {
        return instance;
    }

    public void createRoom() {
        availableRoom.add(new RegularRoom());
        availableRoom.add(new RegularRoom());
        availableRoom.add(new RegularRoom());
        availableRoom.add(new RegularRoom());
        availableRoom.add(new RegularRoom());

    }

    /** Method to check customer into a room (factory pattern)**/
    public Room checkIn(RoachColony customer, String roomType,
                        ArrayList<String> amenitiesList) {
        Room customerRoom = null;
        //Only check in if there are available rooms ( or not empty)
        if (!availableRoom.isEmpty()) {
            //change the first room in the list to the type customer want
            customerRoom = availableRoom.get(0);

            if (roomType.equals("Suite")) {
                customerRoom = new Suite();
            }
            else if (roomType.equals("Deluxe")){
                customerRoom = new DeluxeRoom();
            }
            else if (roomType.equals("Regular")){
                customerRoom =  new RegularRoom();
            }

            //iterate through the amenities and add them
            for (String amenity : amenitiesList) {
                if (amenity.equals("FoodBar")){
                    customerRoom = new FoodBar(customerRoom);
                }
                else if (amenity.equals("Spa")){
                    customerRoom = new Spa(customerRoom);
                }
                else if (amenity.equals("RefillBar")){
                    customerRoom = new RefillBar(customerRoom);
                }
                else if (amenity.equals("Shower")) {
                    customerRoom = new Shower(customerRoom);
                }
            }
            //Add the room that is assigned to a customer to the occupied list
            occupiedRoom.add(customerRoom);
            //remove the room that already assigned to a customer
            availableRoom.remove(0);
        }
        //print the motel is full otherwise
        else {
            System.out.println("The motel is full!!!");
        }
        System.out.println("Available after: " + availableRoom);
        System.out.println("Occupied Room: " + occupiedRoom);
        return customerRoom;
    }

    public ArrayList<Room> getAvailableRoom() {
        return availableRoom;
    }

    @Override
    public String toString() {
        String roomNumList = "[";
        int startRoom = 100;
        for (int i = 1; i < NumberRooms + 1; i++){
            int roomNum = startRoom + i;
            if (i == NumberRooms){
                roomNumList += Integer.toString(roomNum) + "]";
            }
            else {
                roomNumList += Integer.toString(roomNum) + ", ";
            }
        }

        return "RoachMotel{" + "roomList=" + roomList + ", Available rooms: "
                + roomNumList + '}';
    }
}
