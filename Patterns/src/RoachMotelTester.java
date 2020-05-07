/*Name: Selina Do and Long Nguyen
  Date: 05/07/2020
  Purpose: Test the functionality of the motel including the factory patterns, and the strategy pattern. Also test
  the Decorator pattern with the check-in method().
  Inputs: None
  Outputs: None
*/
import java.util.ArrayList;

public class RoachMotelTester {

    public static void main(String[] args) {
        RoachMotel roachMotel = RoachMotel.getInstance();
        roachMotel.createRoom();
        System.out.println(roachMotel);
        System.out.println("initial rooms: " + roachMotel.getAvailableRoom());

        RoachColony rc1 = new RoachColony("First colony", 100, 2);
        ArrayList<String> amenities = new ArrayList<>();
        amenities.add("Shower");
        amenities.add("FoodBar");
        amenities.add("RefillBar");
        amenities.add("Spa");
        Room room1 = roachMotel.checkIn(rc1, "Suite", amenities);
        System.out.println(room1);
        System.out.println(rc1);
        System.out.println("After party:");
        rc1.party();
        System.out.println(rc1);
        System.out.println(roachMotel);
        System.out.println();

        RoachColony rc2 = new RoachColony("Second colony", 1000, 0.2);
        ArrayList<String> amenities2 = new ArrayList<>();
        amenities2.add("Shower");
        Room room2 = roachMotel.checkIn(rc2, "Deluxe", amenities2);
        System.out.println(room2);
        System.out.println(rc2);
        System.out.println("After party:");
        rc2.party();
        System.out.println(rc2);
        System.out.println(roachMotel);
        System.out.println();

        System.out.println("Second colony check out:");
        MasterRoach rc2Card = new MasterRoach("colony 2", "374", "0420850243", "05/28");
        double costRC2 = roachMotel.checkOut(rc2,3, rc2Card);
        System.out.println(room2.getDescription() + ", Cost: $" + costRC2);
        System.out.println(roachMotel);
        System.out.println();

        RoachColony rc3 = new RoachColony("Third colony", 300, 0.3);
        ArrayList<String> amenities3 = new ArrayList<>();
        amenities3.add("FoodBar");
        Room room3 = roachMotel.checkIn(rc3, "Regular", amenities3);
        System.out.println(room3);
        System.out.println(rc3);
        System.out.println("After party:");
        rc3.party();
        System.out.println(rc3);
        System.out.println(roachMotel);
        System.out.println();

        RoachColony rc4 = new RoachColony("Fourth colony", 400, 0.4);
        ArrayList<String> amenities4 = new ArrayList<>();
        amenities4.add("RefillBar");
        Room room4 = roachMotel.checkIn(rc4, "Regular", amenities4);
        System.out.println(room4);
        System.out.println(rc4);
        System.out.println(roachMotel);
        System.out.println();

        RoachColony rc5 = new RoachColony("Fifth colony", 500, 0.5);
        ArrayList<String> amenities5 = new ArrayList<>();
        amenities5.add("RefillBar");
        Room room5 = roachMotel.checkIn(rc5, "Deluxe", amenities5);
        System.out.println(room5);
        System.out.println(rc5);
        System.out.println(roachMotel);
        System.out.println();

        RoachColony rc6 = new RoachColony("Sixth colony", 600, 0.6);
        ArrayList<String> amenities6 = new ArrayList<>();
        amenities6.add("Spa");
        Room room6 = roachMotel.checkIn(rc6, "Deluxe", amenities6);
        System.out.println(room6);
        System.out.println(rc6);
        System.out.println(roachMotel);
        System.out.println();

        RoachColony rc7 = new RoachColony("Seventh colony", 700, 0.7);
        ArrayList<String> amenities7 = new ArrayList<>();
        amenities7.add("Spa");
        Room room7 = roachMotel.checkIn(rc7, "Deluxe", amenities7);
        System.out.println(roachMotel);
        System.out.println();

        System.out.println("Third colony check out:");
        RoachPal rc3Card = new RoachPal("colony 3","colony3@gmail.com");
        double costRC3 = roachMotel.checkOut(rc3,3, rc3Card);
        System.out.println(room2.getDescription() + ", Cost: $" + costRC3);
        System.out.println(roachMotel);
        System.out.println();

        room7 = roachMotel.checkIn(rc7, "Deluxe", amenities7);
        System.out.println(room7);
        System.out.println(rc7);
        System.out.println(roachMotel);
        System.out.println();

        RoachColony rc8 = new RoachColony("Eigth colony", 800, 0.8);
        ArrayList<String> amenities8 = new ArrayList<>();
        amenities8.add("Spa");
        amenities8.add("FoodBar");
        Room room8 = roachMotel.checkIn(rc8, "Suite", amenities8);
        System.out.println(roachMotel);
    }
}
