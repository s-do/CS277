import java.util.ArrayList;

public abstract class RoomMakerAbstract {
    /**
     * Makes rooms for the hotel
     * @param roomType type of room
     * @param amenitiesList list of amenities
     * @return type of room with amenities
     */
    public abstract Room makeRoom(String roomType, ArrayList<String> amenitiesList);


}
