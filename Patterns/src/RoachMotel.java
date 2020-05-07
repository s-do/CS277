import java.util.ArrayList;
/** This class use the singleton pattern which make sure
 * there will be only one instance of it**/
public class RoachMotel {
    /* instance of a roach motel*/
    private static RoachMotel instance = new RoachMotel();
    /* list of rooms available in motel*/
    private ArrayList<Integer> availableRoom = new ArrayList<>();
    /* number of rooms in motel */
    private int roomCapacity = 5;

    /**
     * Constructor is private to prevent making new instances using new
     */
    private RoachMotel(){}

    /**
     * Gets the instance of the roach motel
     * @return roach motel instance
     */
    public static RoachMotel getInstance() {
        return instance;
    }

    /**
     * Creates the rooms in the motel
     */
    public void createRoom() {
        for (int i = 0; i < roomCapacity; i++) {
            availableRoom.add(100 + i);
        }
    }

    /**
     * Method to check customer into a room (factory pattern)
     * @param customer roach colony
     * @param roomType type of room
     * @param amenitiesList list of amenities roaches want
     * @return room of colony with its type and amenities
     */
    public Room checkIn(RoachColony customer, String roomType,
                        ArrayList<String> amenitiesList) {

        Room customerRoom = null;
        RoomFactory roomFactory = new RoomFactory();
        //Only check in if there are available rooms ( or not empty)
        if (!availableRoom.isEmpty()) {
            //change the first room in the list to the type customer want
            customerRoom = roomFactory.makeRoom(roomType, amenitiesList);
            //Set the amenities list in the newly created room to the one that customer pass in
            customerRoom.setAmenitiesList(amenitiesList);
            customer.setRoom(customerRoom);
            customer.setRoomNumber(availableRoom.get(0));
            //remove the room that already assigned to a customer
            availableRoom.remove(0);
        }
        //print the motel is full otherwise
        else {
            System.out.println("The motel is full!!!");
        }
        //System.out.println("Available after: " + availableRoom);
        return customerRoom;
    }

    /**
     * Checks customer out of a room
     * @param colony roach colony
     * @param day number for days roaches stayed
     * @param paymentType type of payment used
     * @return total cost of colony's stay at motel
     */
    public double checkOut(RoachColony colony, int day, Payment paymentType){
        //calculate the total cost by multiplying the cost with number of days the customer stay
        double totalCost = colony.getRoom().cost() * day;
        System.out.println("This is the total cost: " + totalCost);
        paymentType.pay(totalCost);
        //add the room to the available room list.
        availableRoom.add(colony.getRoomNumber());
        return totalCost;
    }

    /**
     * Gets the list of available rooms
     * @return list of available rooms
     */
    public ArrayList<Integer> getAvailableRoom() {
        return availableRoom;
    }

    /**
     * String representation of roach motel
     * @return string description of the motel's list of available rooms
     */
    @Override
    public String toString() {
        return "Roach Motel available room: " + getAvailableRoom();
    }
}
