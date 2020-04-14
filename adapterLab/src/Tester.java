public class Tester {
    public static void main(String[] args) {

        MilesClient mile = new MilesClient();
        KilometersAdaptee kilo = new KilometersAdaptee();
        MtoKAdapter adapter = new MtoKAdapter();
        System.out.println("Miles Test: ");
        System.out.println("Result of 10mph for 2 hrs: " + mile.distance(10,2) + "miles");
        System.out.println("");
        System.out.println("Kilometer Test: ");
        System.out.println("Result of 16kph for 2 hrs: " + kilo.distancek(16,2) + "km");
        System.out.println("");
        System.out.println("Adapter Test: ");
        System.out.println("Result of 10mph for 2hrs: " + adapter.distancek(10,2) + "miles");

    }
}
