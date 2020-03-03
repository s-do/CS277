import java.util.Scanner;

public class vendingTester {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Product candy1 = new Product("candy", 0.25);
        Product cookie1 = new Product("cookie", 0.5);
        Product chip1 = new Product("chip", 0.75);

        machine.addItem(candy1);
        machine.addItem(cookie1);
        machine.addItem(chip1);

        System.out.println(machine);

        /*machine.addMoney(0.75);
        machine.addMoney(0.25);
        System.out.println("add money into machine: " + machine.getMoney());

        //System.out.println("clear: " + machine.clearAccount());
        System.out.println("money after: " + machine.getMoney());

        System.out.println("verifying money: " + machine.verifyMoney(0));

        System.out.println("removing: " + machine.removeItem(1));
        System.out.println("after removing: " + machine);

        System.out.println(machine.getMoney());
        machine.removeMoney(0.10);
        System.out.println(machine.getMoney());*/

        System.out.println();

        while (true) {
            printMenu();
            int userChoice = getInput();
            // Shows products
            if (userChoice == 1){
                System.out.println(machine);
            }
            // Inserts coin
            if (userChoice == 2){
                printCoins();
                char coin = getCoin();
                Coin insertCoin = new Coin(coin);
                insertCoin(machine, insertCoin);
            }
            // STILL NEEDS TO BE ADDED
            // Buy product
            if (userChoice == 3){
                System.out.println("empty for now");
            }

            // Adds a new product to vending machine
            if (userChoice == 4){
                addProduct(machine);
            }

            // Removes coin
            if (userChoice == 5){
                removeCoins(machine);
            }


            if (userChoice == 6){
                break;
            }

            System.out.println("Amount inserted: " + machine.getMoney());
        }
    }

    /**
     * Print out the menu on what action the user want to perform
     */
    public static void printMenu(){
        System.out.println("---------------------------------");
        System.out.println("Vending Machine Options: \n" +
                           "1. Show products \n" +
                           "2. Insert Coin \n" +
                           "3. Buy \n" +
                           "4. Add product \n" +
                           "5. Remove coins \n" +
                           "6. Quit");
        System.out.println();
    }

    /**
     * Obtain the user input as an integer
     */
    public static int getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a vending machine option: ");
        int option = in.nextInt();
        return option;
    }

    /**
     * Prints out 4 types of coins
     */
    public static void printCoins() {
        System.out.println("---------------------------------");
        System.out.println("Coin Options: \n" +
                           "A) nickel @ 0.05 \n" +
                           "B) dime @ 0.1 \n" +
                           "C) quarter @ 0.25 \n" +
                           "D) dollar @ 1.0");
        System.out.println();
    }

    /**
     * Obtain the user input as an integer
     */
    public static char getCoin() {
        Scanner in = new Scanner(System.in);
        System.out.print("Choose a coin option: ");
        char coinOption = in.next().charAt(0);
        return coinOption;
    }

    /**
     * Adds coin into the machine based on the user coin choice
     * @param machine vending machine with products
     * @param insCoin coin user chose to insert
     */
    public static void insertCoin(VendingMachine machine, Coin insCoin) {
        machine.addMoney(insCoin.getValue());
    }

    // Prints out if user bought product or doesn't have enough money
    public static void buyProduct(VendingMachine machine, Product prod){
        /*if (machine.getMoney() < prod.getCost()){
            System.out.println("Insufficient money");
        }
        else{
            System.out.println("Purchased: " + prod);
        }*/
    }

    /**
     * Adds a new product into the vending machine
     * @param machine vending machine with products
     */
    public static void addProduct(VendingMachine machine){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String product = in.nextLine();

        System.out.print("Enter product price: ");
        double price = in.nextDouble();

        Product newProduct = new Product(product, price);

        machine.addItem(newProduct);
    }

    /**
     * Prints out how much money was removed from the machine
     * @param machine vending machine with products
     */
    public static void removeCoins(VendingMachine machine){
        double money = machine.getMoney();
        machine.removeMoney(money);
        System.out.println("Removed: " + money);
    }

}
