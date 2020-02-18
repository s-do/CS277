public class tester {
    public static void main(String[] args) {
        Candy candy1 = new Candy("vanilla", 2.30, 10, 0.89);
        Cookie chocolatechips = new Cookie("choco", 3, 100, 1.34);
        Checkout sweetStuff = new Checkout(0.10);

        sweetStuff.enterItem(candy1);
        sweetStuff.enterItem(chocolatechips);

        System.out.println("cany1: " + candy1);
        System.out.println("this is the cost of candy: " + candy1.getCost());
        System.out.println("choco: " + chocolatechips);
        System.out.println("this is the cost: " + chocolatechips.getCost());

        System.out.println("this is the total cost of all items: " + sweetStuff.totalCost());
        System.out.println("this is the amount of tax: " + sweetStuff.totalTax());

/*        double test = 5.9;
        int test2 = (int) Math.round(5.9);
        System.out.println("this is cast: " + (int) test);
        System.out.println("rounding test: " + test2);*/

/*        Sundae sun1 = new Sundae("Straw", 140, 2.39, "caramel", 10.23);
        System.out.println("sundae: " + sun1);*/
    }

}
