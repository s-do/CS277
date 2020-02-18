public class tester {
    public static void main(String[] args) {
        Candy candy1 = new Candy("vanilla", 2.30, 10, 0.89);
        Cookie chocolatechips = new Cookie("choco", 3, 100, 1.34);
        IceCream vanilla = new IceCream("vanilla", 200, 0.75);
        Sundae sundae1 = new Sundae("Chocolate", 300, 1.50, "Caramel", 5.5);
        IceCream ice2 = new IceCream("strawberry", 150, 6.75);
        Checkout sweetStuff = new Checkout(0.10);

        sweetStuff.enterItem(candy1);
        sweetStuff.enterItem(chocolatechips);
        sweetStuff.enterItem(vanilla);
        sweetStuff.enterItem(sundae1);
        sweetStuff.enterItem(ice2);

        System.out.println("candy calories: " + candy1.getCalories());

        System.out.println("cany1: " + candy1);
        System.out.println("this is the cost of candy: " + candy1.getCost());
        System.out.println("choco: " + chocolatechips);
        System.out.println("this is the cost of choco cookiew: " + chocolatechips.getCost());
        System.out.println("Icecrem: " + vanilla);
        System.out.println("ice 1 cost: " + vanilla.getCost());
        System.out.println("Ice 2: " + ice2);
        System.out.println("ice 2 cost: " + ice2.getCost());
        System.out.println("Sundae: " + sundae1);
        System.out.println("sundae cost: " + sundae1.getCost());

        System.out.println("this is the total cost of all items: " + sweetStuff.totalCost());
        System.out.println("this is the amount of tax: " + sweetStuff.totalTax());

        System.out.println("result: " + chocolatechips.compareTo(vanilla));

/*        double test = 5.9;
        int test2 = (int) Math.round(5.9);
        System.out.println("this is cast: " + (int) test);
        System.out.println("rounding test: " + test2);*/

/*        Sundae sun1 = new Sundae("Straw", 140, 2.39, "caramel", 10.23);
        System.out.println("sundae: " + sun1);*/
    }

}
