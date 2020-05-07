import java.util.ArrayList;

public class RoachColony {
    /* Name of roach colony */
    private String name;
    /* Population of roach colony */
    private int initPopulation;
    /* Growth rate of roach colony */
    private double growthRate;
    /* Room number for roach colony */
    private int roomNumber;
    /* Roach colony's room */
    private Room Room;

    /**
     * Default constructor of RoachColony class
     */
    public RoachColony(){
        name = "Snow";
        initPopulation = 100;
        growthRate = 0.5;
    }

    /**
     * Constructor that changes the default instances of the class
     * @param roachName name of roach colony
     * @param population amount of roaches in colony
     * @param rate growth rate of colony
     */
    public RoachColony(String roachName, int population, double rate){
        name = roachName;
        initPopulation = population;
        growthRate = rate;
    }

    /**
     * Gets the name of the roach colony
     * @return name of roach colony
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the roach colony
     * @param name name of roach colony
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the roach colony's room number
     * @return room number of colony
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the room number of roach colony
     * @param roomNumber room number of colony
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Gets the roach colony's room
     * @return roach colony's room
     */
    public Room getRoom() {
        return Room;
    }

    /**
     * Sets the roach colony's room
     * @return roach colony's room
     */
    public void setRoom(Room room) {
        Room = room;
    }

    /**
     * Reduces the roach population whenever there is a party
     */
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

    /**
     * String representation of roach colony
     * @return name of colony, population of colony, and colony's growth rate
     */
    @Override
    public String toString() {
        return "Roach colony name: " + name + ", Initial Population: " + initPopulation +
                ", Growth Rate: " + growthRate;
    }
}
