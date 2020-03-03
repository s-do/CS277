import java.util.Scanner;

public class vendingTester {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Product candy1 = new Product("candy", 0.25,5);
        Product cookie1 = new Product("cookie", 0.5,5);
        Product chip1 = new Product("chip", 0.75,5);

        machine.addItem(candy1);
        machine.addItem(cookie1);
        machine.addItem(chip1);

        System.out.println(machine);

        System.out.println();

        int userChoice = -1;
        while (userChoice != 6) {
            printMenu();
            userChoice = getInput();

            // Shows products
            if (userChoice == 1){
                System.out.println(machine);
            }
            // Inserts coin
            else if (userChoice == 2){
                printCoins();
                char coin = getCoin();
                Coin insertCoin = new Coin(coin);
                insertCoin(machine, insertCoin);
            }
            // STILL NEEDS TO BE ADDED
            // Buy product
            else if (userChoice == 3){

                //buyProduct(machine,);
            }

            // Adds a new product to vending machine
            else if (userChoice == 4){
                addProduct(machine);
            }

            // Removes coin
            else if (userChoice == 5){
                //removeCoins(machine);
                System.out.println("Amount removed: " + machine.removeMoney());
            }

            System.out.println("Current amount: " + machine.getMoney());
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

    //separate the method from sout to reuse. 
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
    public static void buyProduct(VendingMachine machine, Product product){
        if (machine.getMoney() < product.getCost()){
            System.out.println("Insufficient money");
        }
        else{
            product.removeQuantity();
            machine.removeMoney(product.getCost());
            System.out.println("Purchased: " + product);
        }
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
        in.nextLine();

        System.out.print("Enter a quantity: ");
        int quantity = in.nextInt();
        in.nextLine();
        Product newProduct = new Product(product, price, quantity);

        machine.addItem(newProduct);
    }

}
