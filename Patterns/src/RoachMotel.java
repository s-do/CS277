import java.util.ArrayList;
/** This class use the singleton pattern which make sure
 * there will be only one instance of it**/
public class RoachMotel {
    private static RoachMotel instance = new RoachMotel();
    private ArrayList<Integer> availableRoom = new ArrayList<>();
    private int roomCapacity = 5;

    //constructor is private to prevent making new instances using new
    private RoachMotel(){}

    public static RoachMotel getInstance() {
        return instance;
    }

    public void createRoom() {
        for (int i = 0; i < roomCapacity; i++) {
            availableRoom.add(100 + i);
        }
    }

    /** Method to check customer into a room (factory pattern)**/
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

    public double checkOut(RoachColony colony, int day, Payment paymentType){
        //calculate the total cost by multiplying the cost with number of days the customer stay
        //room1 = new FoodBar(room1);
        double totalCost = colony.getRoom().cost() * day;
        System.out.println("This is the total cost: " + totalCost);
        paymentType.pay(totalCost);
        //add the room to the available room list.
        availableRoom.add(colony.getRoomNumber());
        return totalCost;
    }

    public ArrayList<Integer> getAvailableRoom() {
        return availableRoom;
    }

    @Override
    public String toString() {
        return "Roach Motel available room: " + getAvailableRoom();
    }

    /*    @Override
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
    }*/
}
