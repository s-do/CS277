public class tester {
    public static void main(String[] args) {
        Candy candy1 = new Candy("vanilla", 2.39, 10, 0.57);
        Cookie chocolatechips = new Cookie("choco", 3, 100, 1.34);

        System.out.println("cany1: " + candy1);
        System.out.println("this is the cost: " + candy1.getCost());
        System.out.println("choco: " + chocolatechips);
        System.out.println("this is the cost: " + chocolatechips.getCost());




    }

}
