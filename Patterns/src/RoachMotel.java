import java.util.ArrayList;

public class RoachMotel {
    private static RoachMotel instance = new RoachMotel();
    ArrayList<String> roomList = new ArrayList<>();
    int NumberRooms = 5;

    //constructor is private to prevent making new instances using new
    private RoachMotel(){}

    public static RoachMotel getInstance() {
        return instance;
    }

    public static void createRooms(){

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
