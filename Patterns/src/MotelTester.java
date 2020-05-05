public class MotelTester {
    public static void main(String[] args) {
        Room room = new RegularRoom();
        System.out.println(room.getDescription() + " $" + room.cost());

        Room room2 = new RegularRoom();
        room2 = new FoodBar(room2);
        room2 = new Spa(room2);
        room2 = new RefillBar(room2);
        System.out.println(room2.getDescription() + " $" + room2.cost());

        Room room3 = new RegularRoom();
        room3 = new Spa(room3);
        room3 = new Shower(room3);
        room3 = new FoodBar(room3);
        System.out.println(room3.getDescription() + " $" + room3.cost());

        RoachMotel motel = RoachMotel.getInstance();
        System.out.println(motel);
    }
}
