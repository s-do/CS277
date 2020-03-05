/** Name: Selina Do and Long Nguyen
 * Date: 03/04/20
 * Purpose: To stimulate a vending machine that allows a user to see the available products, add coins
 *          and buy a product
 * Inputs: Vending Machine, Coin, Card, Product, and menu option
 * Outputs: menu option user chose, product user bought, how much money user put into machine, how much
 *          money removed from the vending machine, and whether or not the user has sufficient funds
 */
import java.util.Scanner;

public class vendingTester {
    public static void main(String[] args) {
        // creates a VendingMachine ArrayList
        VendingMachine machine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);
        Card userCard = new Card();
        int userChoice = -1;

        while (userChoice != 6) {
            // Prints out options user can choose from
            printMenu();
            System.out.print("Enter a vending machine option: ");
            userChoice = getInput();

            // Shows products
            if (userChoice == 1) {
                System.out.println(machine);
            }
            // Choose between card and coins
            else if (userChoice == 2) {
                printPayment();
                int paymentOption = -1;
                while (paymentOption < 1 || paymentOption > 2) {
                    paymentOption = getInput();
                }
                // Coin option
                if(paymentOption == 1) {
                    printCoins();
                    System.out.print("Choose a coin option: ");
                    char coin = getCoin();
                    Coin insertCoin = new Coin(convertCoin(coin));
                    insertCoin(machine, insertCoin);
                }
                // Card option
                else {
                    System.out.print("Enter name on card: ");
                    userCard.setName(scanner.nextLine());
                    System.out.print("Balance in card: ");
                    userCard.setBalance(scanner.nextDouble());
                    scanner.nextLine();
                    machine.addMoney(userCard.getBalance());
                    System.out.println(userCard);
                }
            }

            // Buy product
            else if (userChoice == 3) {
                System.out.println(machine);
                int product = -1;
                while (product < 1 || product > machine.size()) {
                    System.out.print("Choose a product: ");
                    product = getInput();
                }
                product--;
                //If the user has enough money, let them buy the item
                if (machine.verifyMoney(product)) {
                    machine.buyProduct(machine.getItem(product));
                    System.out.println("Purchase: " + machine.getItem(product));
                    System.out.println("Change: " + machine.removeMoney());
                    //System.out.println("Machine money: " + machine.getMachineMoney());
                }
                //otherwise print out of stock or not enough fund if
                else if (machine.getItem(product).getQuantity() == 0){
                    System.out.println("Out of stock");
                }
                else {
                    System.out.println("Insufficient fund");
                }
            }

            // Adds a new product to vending machine
            else if (userChoice == 4) {
                addProduct(machine);
            }

            // Removes coin
            else if (userChoice == 5) {
                System.out.println("Amount removed from machine: " + machine.removeMachineMoney());
            }

            // Prints out amount of money user put into the VendingMachine
            System.out.println("Current user amount: " + machine.getMoney());
        }
    }

    /**
     * Print out the menu on what action the user want to perform
     */
    public static void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("Vending Machine Options: \n" +
                "1. Show products \n" +
                "2. Add Money \n" +
                "3. Buy \n" +
                "4. Add product \n" +
                "5. Remove coins \n" +
                "6. Quit");
        System.out.println();
    }

    /**
     * Prints out the different payments the user can choose from
     */
    public static void printPayment() {
        System.out.print("1. Coins \n" +
                "2. Card \n" +
                "Choose a payment option:  ");
    }

    /**
     * Obtain the user input as an integer
     */
    public static int getInput() {
        Scanner in = new Scanner(System.in);
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
        char coinOption = in.next().charAt(0);
        return coinOption;
    }

    /**
     * Converts user choice to the name for constructing an object
     * @param usrCoin coin user chose
     * @return string of the coin user chose
     */
    public static String convertCoin(char usrCoin) {
        if (usrCoin == 'a') {
            return "nickel";
        }
        else if(usrCoin == 'b'){
            return "dime";
        }
        else if(usrCoin == 'c'){
            return "quarter";
        }
        else{
            return "dollar";
        }
    }

    /**
     * Adds coin into the machine based on the user coin choice
     *
     * @param machine vending machine with products
     * @param insCoin coin user chose to insert
     */
    public static void insertCoin(VendingMachine machine, Coin insCoin) {
        machine.addMoney(insCoin.getValue());
    }

    /**
     * Adds a new product into the vending machine
     *
     * @param machine vending machine with products
     */
    public static void addProduct(VendingMachine machine) {
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

