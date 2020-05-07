/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: The interface implement factory pattern to create room base on input at Run time.
  Inputs: None
  Outputs: None
*/

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
