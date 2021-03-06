/*Name: Long Nguyen & Selina Do
 * Date: 02/19/20
 * Purpose: Test all the classes and their methods
 * Inputs: None
 * Output: Strings will be printed to the console for testing
 */

public class tester {
    public static void main(String[] args) {
        System.out.println("CANDY TEST: ");
        Candy candy = new Candy();
        System.out.println(candy.getWeight() + " lbs. @ " + candy.getPricePerLB() + "/lb.");
        System.out.println(candy + "                              " + candy.getCost() + "0");

        DessertItem candy1 = new Candy("Gummies", 1.5, 500, 7.25);
        //System.out.println(candy1.getWeight() + " lbs. @ " + candy1.getPricePerLB() + "/lb.");
        System.out.println(candy1 + "              " + candy1.getCost() + "\n");
        System.out.println(candy1 + "calories: " + candy1.getCalories() + "\n");

        Candy candy2 = new Candy("Lollipop", 2.5, 640, 8.25);
        System.out.println(candy2.getWeight() + " lbs. @ " + candy2.getPricePerLB() + "/lb.");
        System.out.println(candy2 + "             " + candy2.getCost() + "\n");
        System.out.println(candy2 + "calories: " + candy2.getCalories() + "\n");

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Cookie Test: ");
        Cookie cookie = new Cookie();
        System.out.println(cookie.getAmount() + " lbs. @ " + cookie.getPricePerDozen() + "/lb.");
        System.out.println(cookie + "                              " + cookie.getCost() + "0");

        Cookie cookie1 = new Cookie("ChocChip", 17, 250, 4.99);
        System.out.println(cookie1.getAmount() + " lbs. @ " + cookie1.getPricePerDozen() + "/lb.");
        System.out.println(cookie1 + "             " + cookie1.getCost() + "\n");
        System.out.println(cookie1 + "calories: " + cookie1.getCalories() + "\n");

        Cookie cookie2 = new Cookie("Oatmeal", 15, 240, 3.99);
        System.out.println(cookie2.getAmount() + " lbs. @ " + cookie2.getPricePerDozen() + "/lb.");
        System.out.println(cookie2 + "              " + cookie2.getCost() + "\n");
        System.out.println(cookie2 + "calories: " + cookie2.getCalories() + "\n");

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("ICECREAM TEST: ");
        IceCream iceCream = new IceCream();
        System.out.println(cookie + "                              " + cookie.getCost() + "0\n");

        IceCream iceCream1 = new IceCream("Vanilla", 500, 10.05);
        System.out.println(iceCream1 + "           " + iceCream1.getCost() + "\n");
        System.out.println(iceCream1 + "calories: " + iceCream1.getCalories() + "\n");

        IceCream iceCream2 = new IceCream("Chocolate", 500, 9.99);
        System.out.println(iceCream2 + "          " + iceCream2.getCost() + "\n");
        System.out.println(iceCream2 + "calories: " + iceCream2.getCalories() + "\n");

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("SUNDAE TEST: ");
        Sundae sundae = new Sundae();
        System.out.println(sundae);
        System.out.println(sundae.getTopping() + "                              " + sundae.getCost() + "0\n");

        Sundae sundae1 = new Sundae("Caramel", 600, 7.00, "HotFudge", 0.70 );
        System.out.println(sundae1 + "with");
        System.out.println(sundae1.getTopping() + "            " + sundae1.getCost() + "0\n");
        System.out.println(sundae1 + "calories: " + sundae1.getCalories() + "\n");

        Sundae sundae2 = new Sundae("BananaSplit", 560, 6.00, "Strawberries", 0.90);
        System.out.println(sundae2 + "with");
        System.out.println(sundae2.getTopping() + "        " + sundae2.getCost() + "0\n");
        System.out.println(sundae2 + "calories: " + sundae2.getCalories() + "\n");

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Output Receipt: ");

        System.out.println();
        // ArrayList with DessertItems
        Checkout sweetStuff = new Checkout(0.10);

        // adds to ArrayList
        sweetStuff.enterItem(candy2);
        sweetStuff.enterItem(cookie2);
        sweetStuff.enterItem(iceCream2);
        sweetStuff.enterItem(sundae2);
        sweetStuff.enterItem(candy1);
        sweetStuff.enterItem(cookie1);
        sweetStuff.enterItem(iceCream1);
        sweetStuff.enterItem(sundae1);

        // prints out the receipt
        System.out.println(sweetStuff);

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Max Test with Same DessertItem Types:");
        if (candy2.compareTo(candy1) == 1){
            System.out.println(candy2 + "with " + candy2.getCalories() + " calories is bigger than "
                            + candy1 + "with " + candy1.getCalories() + " calories.");
        }
        else if (candy2.compareTo(candy1) == -1){
            System.out.println(candy2 + "with " + candy2.getCalories() + " calories is less than "
                    + candy1 + "with " + candy1.getCalories() + " calories.");
        }
        else{
            System.out.println(candy2 + "with " + candy2.getCalories() + " calories is equal to "
                    + candy1 + "with " + candy1.getCalories() + " calories.");
        }


        if (cookie1.compareTo(cookie2) == 1){
            System.out.println(cookie1 + "with " + cookie1.getCalories() + " calories is bigger than "
                    + cookie2 + "with " + cookie2.getCalories() + " calories.");
        }
        else if (cookie1.compareTo(cookie2) == -1){
            System.out.println(cookie1 + "with " + cookie1.getCalories() + " calories is less than "
                    + cookie2 + "with " + cookie2.getCalories() + " calories.");
        }
        else {
            System.out.println(cookie1 + "with " + cookie1.getCalories() + " calories is equal to "
                    + cookie2 + "with " + cookie2.getCalories() + " calories.");
        }


        if (iceCream1.compareTo(iceCream2) == 1){
            System.out.println(iceCream1 + "with " + iceCream1.getCalories() + " calories is bigger than "
                    + iceCream2 + "with " + iceCream2.getCalories() + " calories.");
        }
        else if (iceCream1.compareTo(iceCream2) == -1){
            System.out.println(iceCream1 + "with " + iceCream1.getCalories() + " calories is less than "
                    + iceCream2 + "with " + iceCream2.getCalories() + " calories.");
        }
        else{
            System.out.println(iceCream1 + "with " + iceCream1.getCalories() + " calories is equal to "
                    + iceCream2 + "with " + iceCream2.getCalories() + " calories.");
        }


        if (sundae1.compareTo(sundae2) == 1){
            System.out.println(sundae1 + "with " + sundae1.getCalories() + " calories is bigger than "
                    + sundae2 + "with " + sundae2.getCalories() + " calories.");
        }
        else if (sundae1.compareTo(sundae2) == -1){
            System.out.println(sundae1 + "with " + sundae1.getCalories() + " calories is less than "
                    + sundae2 + "with " + sundae2.getCalories() + " calories.");
        }
        else {
            System.out.println(sundae1 + "with " + sundae1.getCalories() + " calories is equal to "
                    + sundae2 + "with " + sundae2.getCalories() + " calories.");
        }

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Max Test with Different DessertItem Types:");
        if (candy2.compareTo(cookie2) == 1){
            System.out.println(candy2 + "with " + candy2.getCalories() + " calories is bigger than "
                    + cookie2 + "with " + cookie2.getCalories() + " calories.");
        }
        else if (candy2.compareTo(cookie2) == -1){
            System.out.println(candy2 + "with " + candy2.getCalories() + " calories is less than "
                    + cookie2 + "with " + cookie2.getCalories() + " calories.");
        }
        else{
            System.out.println(candy2 + "with " + candy2.getCalories() + " calories is equal to "
                    + cookie2 + "with " + cookie2.getCalories() + " calories.");
        }


        if (sundae2.compareTo(iceCream2) == 1){
            System.out.println(sundae2 + "with " + sundae2.getCalories() + " calories is bigger than "
                    + iceCream2 + "with " + iceCream2.getCalories() + " calories.");
        }
        else if (sundae2.compareTo(cookie2) == -1){
            System.out.println(sundae2 + "with " + sundae2.getCalories() + " calories is less than "
                    + iceCream2 + "with " + iceCream2.getCalories() + " calories.");
        }
        else {
            System.out.println(sundae2 + "with " + sundae2.getCalories() + " calories is equal to "
                    + iceCream2 + "with " + iceCream2.getCalories() + " calories.");
        }


        if (candy1.compareTo(iceCream1) == 1){
            System.out.println(candy1 + "with " + candy1.getCalories() + " calories is bigger than "
                    + iceCream1 + "with " + iceCream1.getCalories() + " calories.");
        }
        else if (candy1.compareTo(iceCream2) == -1){
            System.out.println(candy1 + "with " + candy1.getCalories() + " calories is less than "
                    + iceCream1 + "with " + iceCream1.getCalories() + " calories.");
        }
        else{
            System.out.println(candy1 + "with " + candy1.getCalories() + " calories is equal to "
                    + iceCream1 + "with " + iceCream1.getCalories() + " calories.");
        }


        if (sundae1.compareTo(cookie1) == 1){
            System.out.println(sundae1 + "with " + sundae1.getCalories() + " calories is bigger than "
                    + cookie1 + "with " + cookie1.getCalories() + " calories.");
        }
        else if (sundae1.compareTo(sundae2) == -1){
            System.out.println(sundae1 + "with " + sundae1.getCalories() + " calories is less than "
                    + cookie1 + "with " + cookie1.getCalories() + " calories.");
        }
        else {
            System.out.println(sundae1 + "with " + sundae1.getCalories() + " calories is equal to "
                    + cookie1 + "with " + cookie1.getCalories() + " calories.");
        }

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("unsorted DessertList: ");
        for (int i = 0; i < sweetStuff.numberOfItems(); i++){
            DessertItem item = sweetStuff.get(i);
            System.out.println(item + "has " + item.getCalories() + " calories.");
        }

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("sorted DessertList: ");
        sweetStuff.sort();
        for (int i = 0; i < sweetStuff.numberOfItems(); i++){
            DessertItem item = sweetStuff.get(i);
            System.out.println(item + "has " + item.getCalories() + " calories.");
        }

        sweetStuff.clear();
        System.out.println("Amount of items after clearing the list: ");
        System.out.println("number of items:" + sweetStuff.numberOfItems());
    }

}
