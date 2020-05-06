import java.util.ArrayList;

public class RoachColony {
    private String name;
    private int initPopulation;
    private double growthRate;
    private int roomNumber;
    private Room Room;

    public RoachColony(){
        name = "Snow";
        initPopulation = 100;
        growthRate = 0.5;
    }

    public RoachColony(String roachName, int population, double rate){
        name = roachName;
        initPopulation = population;
        growthRate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room getRoom() {
        return Room;
    }

    public void setRoom(Room room) {
        Room = room;
    }

    //FIXME: make sure to round
    public void party(){
        // Gets the list of amenities
        ArrayList<String> amenities = Room.getAmenitiesList();
        initPopulation = (int) Math.round(initPopulation + (initPopulation*growthRate));
        // Checks if amenities list has a resistant shower
        boolean hasShower = false;
        for (String i: amenities){
            if (i.equals("Shower")){
                hasShower = true;
            }
        }
        // Roach population is reduced by 25%
        if (hasShower){
            initPopulation = (int) Math.round(initPopulation - (initPopulation/4));
        }
        // Roach population is reduced by 50%
        else{
            initPopulation = (int) Math.round(initPopulation/2);
        }
    }

    @Override
    public String toString() {
        return "Roach colony name: " + name + ", Initial Population: " + initPopulation +
                ", Growth Rate: " + growthRate;
    }
}
