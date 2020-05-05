public class RoachColony {
    private String name;
    private double initPopulation;
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

    @Override
    public String toString() {
        return "Name: " + name + " Population: " + initPopulation + " Growth rate: " + growthRate;
    }
}
