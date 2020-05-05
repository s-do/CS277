import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

public class RoachMotelTester {

    public static void main(String[] args) {
        /*Room room1 = new RegularRoom();
        System.out.println(room1.getDescription() + " $" + room1.cost());

        Room room2 = new DeluxeRoom();
        System.out.println(room2.getDescription() + " $" + room2.cost());

        Room room3 = new Suite();
        System.out.println(room3.getDescription() + " $" + room3.cost());

*//*        System.out.println("Room1: " + room1.getRoomNumber());
        System.out.println("Room2: " + room2.getRoomNumber());
        System.out.println("Room3: " + room3.getRoomNumber());*//*
        room2 = new FoodBar(room2);
        room2 = new Spa(room2);
        room2 = new RefillBar(room2);
        boolean value = room2 instanceof Spa;
        System.out.println("Value of instance: " + value);

*//*        Room room4 = new RegularRoom();
        System.out.println("Room4: " + room4.getRoomNumber());*//*
        System.out.println(room2.getDescription() + " $" + room2.cost());

        //Fixme: this wil create a room with 2 spa how to reset the room afterward.
        room2 = new Spa(room2);
        System.out.println("After " + room2.getDescription() + " $" + room2.cost());

        room2 = new DeluxeRoom();
        System.out.println("after of after: " + room2.getDescription());

        room3 = new Shower(room3);
        System.out.println(room3.getDescription() + " $" + room3.cost());

        room2 = new Suite();
        System.out.println(room2.getDescription() + " $" + room2.cost());

        RoachMotel roachMotel = RoachMotel.getInstance();
        System.out.println("Creating room!");
        roachMotel.createRoom();

        System.out.println("Available room: " + roachMotel.getAvailableRoom());

        RoachColony colony1 = new RoachColony();
        RoachColony colony2 = new RoachColony();
        RoachColony colony3 = new RoachColony();
        RoachColony colony4 = new RoachColony();
        RoachColony colony5 = new RoachColony();
        RoachColony colony6 = new RoachColony();
        ArrayList<String> amenities1 = new ArrayList<>();
        amenities1.add("Shower");
        amenities1.add("RefillBar");
        Room room4 = roachMotel.checkIn(colony1, "Suite", amenities1);
        System.out.println("Room 4 after check in: " + room4);

        Room room5 = roachMotel.checkIn(colony2, "Suite", amenities1);
        Room room6 = roachMotel.checkIn(colony3, "Suite", amenities1);
        Room room7 = roachMotel.checkIn(colony4, "Suite", amenities1);
        Room room8 = roachMotel.checkIn(colony5, "Suite", amenities1);
        Room room9 = roachMotel.checkIn(colony6, "Suite", amenities1);

        System.out.println("");
        System.out.println("Room1: " + room1.getRoomNumber());
        System.out.println("Room2: " + room2.getRoomNumber());
        System.out.println("Room3: " + room3.getRoomNumber());
        System.out.println("Room4: " + room4.getRoomNumber());
        System.out.println("Room5: " + room5.getRoomNumber());
        System.out.println("Room6: " + room6.getRoomNumber());
        System.out.println("Room7: " + room7.getRoomNumber());
        System.out.println("Room8: " + room8.getRoomNumber());
        System.out.println("Room9: " + room9.getRoomNumber());
        ArrayList<String> testList = new ArrayList<>();
        testList.add("hello");
        testList.add("gin");
        testList.add("otae");
        System.out.println("Before: " + testList);
        System.out.println("");
        String name = testList.get(0);
        System.out.println("name value: " + name);
        name = "Tsukuyo";
        System.out.println("modified name: " + name);*/

/*        Room room1 = new RegularRoom(101);
        System.out.println("room1: " + room1.getRoomNumber());
        room1 = new FoodBar(room1);
        System.out.println(room1.getDescription() + " room num: " + room1.getRoomNumber());*/

        RoachMotel roachMotel = RoachMotel.getInstance();
        roachMotel.createRoom();
        RoachColony rc1 = new RoachColony();
        RoachColony rc2 = new RoachColony();
        RoachColony rc3 = new RoachColony();
        RoachColony rc4 = new RoachColony();
        RoachColony rc5 = new RoachColony();
        RoachColony rc6 = new RoachColony();

        ArrayList<String> amenities2 = new ArrayList<>();
        amenities2.add("Shower");
        amenities2.add("FoodBar");
        amenities2.add("RefillBar");
        amenities2.add("Spa");

        ArrayList<String> amenities3 = new ArrayList<>();
        amenities3.add("Spa");
        Room room1 = roachMotel.checkIn(rc1, "Deluxe", amenities2);
        System.out.println(room1.getDescription() + room1.cost());
        System.out.println("Amenities list of room 1: " + room1.getAmenitiesList());
        Room room2 = roachMotel.checkIn(rc2, "Suit", amenities3);
        System.out.println(room2.getDescription() + room2.cost());
        Room room3 = roachMotel.checkIn(rc3, "Regular", amenities2);
        System.out.println(room3.getDescription() + room3.cost());
        Room room4 = roachMotel.checkIn(rc4, "Deluxe", amenities3);
        System.out.println(room4.getDescription() + room4.cost());
        Room room5 = roachMotel.checkIn(rc5, "Suit", amenities3);
        System.out.println(room5.getDescription() + room5.cost());
        System.out.println("Amenities list of room 5: " + room1.getAmenitiesList());


        Room room6 = roachMotel.checkIn(rc6, "Regular", amenities3);
        if (room6 != null) {
            System.out.println(room6.getDescription() + room6.cost());
        }
    }
}
