import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

public class RoachMotelTester {

    public static void main(String[] args) {

        RoachMotel roachMotel = RoachMotel.getInstance();
        roachMotel.createRoom();
        System.out.println("initial rooms: " + roachMotel.getAvailableRoom());
        RoachColony rc1 = new RoachColony();
        RoachColony rc2 = new RoachColony("Smith", 131, 0.6);
        RoachColony rc3 = new RoachColony();
        RoachColony rc4 = new RoachColony();
        RoachColony rc5 = new RoachColony();
        RoachColony rc6 = new RoachColony();
        RoachColony rc7 = new RoachColony();
        RoachColony rc8 = new RoachColony();

        ArrayList<String> amenities2 = new ArrayList<>();
        amenities2.add("Shower");
        amenities2.add("FoodBar");
        amenities2.add("RefillBar");
        amenities2.add("Spa");

        ArrayList<String> amenities3 = new ArrayList<>();
        amenities3.add("Spa");


        Room room1 = roachMotel.checkIn(rc1, "Deluxe", amenities2);
        System.out.println("Room1: " + room1.getDescription() + room1.cost());
        System.out.println(roachMotel);
        System.out.println("Amenities list of room 1: " + room1.getAmenitiesList());
        Room room2 = roachMotel.checkIn(rc2, "Suit", amenities3);
        System.out.println("Room2: " + room2);
        System.out.println(roachMotel);
        Room room3 = roachMotel.checkIn(rc3, "Regular", amenities2);
        System.out.println("Room3: " + room3.getDescription() + room3.cost());
        System.out.println(roachMotel);
        Room room4 = roachMotel.checkIn(rc4, "Deluxe", amenities3);
        System.out.println("Room4: " + room4);
        System.out.println(roachMotel);
        Room room5 = roachMotel.checkIn(rc5, "Suit", amenities3);
        System.out.println("Room5: " + room5.getDescription() + room5.cost());
        System.out.println(roachMotel);
        System.out.println("Amenities list of room 5: " + room1.getAmenitiesList());


        Room room6 = roachMotel.checkIn(rc6, "Regular", amenities3);
        System.out.println(roachMotel);
        if (room6 != null) {
            System.out.println(room6.getDescription() + room6.cost());
        }
        Room room7 = roachMotel.checkIn(rc7, "Suite", amenities3);
        System.out.println(roachMotel);

        MasterRoach masterRC1 = new MasterRoach("Jack", "123", "1234567890", "04/21/12");
        roachMotel.checkOut(rc1, 2, masterRC1);
        System.out.println(roachMotel);

        Room room8 = roachMotel.checkIn(rc8, "Deluxe", amenities2);
        System.out.println("Room8: " + room8);
        System.out.println(roachMotel);

        RoachPal palRC3 = new RoachPal(rc3.getName(), "noice@gmail.com");
        double cost3 = roachMotel.checkOut(rc3, 3, palRC3);

        System.out.println("");
        System.out.println("Test roach: ");
        System.out.println(rc1);
        System.out.println(rc2);

    }
}
