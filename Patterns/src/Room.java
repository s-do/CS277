import java.util.ArrayList;

/** An abstract class that represent a room**/

public abstract class Room {
    protected String description;
    //Fixme: this static in only works if amenities does not inherit from this class
/*    static int roomNumberCount = 100;
    private int roomNumber = roomNumberCount;*/
    private RoachColony customer;
    private ArrayList<String> amenitiesList;    //value at check-in

    public Room (){

    }

/*    public Room(int number) {
        roomNumber = number;
        *//*roomNumberCount = roomNumberCount + 1;*//*
    }*/

    public ArrayList<String> getAmenitiesList() {
        return amenitiesList;
    }

    public void setAmenitiesList(ArrayList<String> amenitiesList) {
        this.amenitiesList = amenitiesList;
    }

    public String getDescription() {
            return description;
    }

    public abstract double cost();
}
