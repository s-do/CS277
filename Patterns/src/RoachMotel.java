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

}
