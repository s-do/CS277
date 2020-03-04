import java.util.Scanner;

public class vendingTester {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Product candy1 = new Product("candy", 0.25, 5);
        Product cookie1 = new Product("cookie", 0.5, 5);
        Product chip1 = new Product("chip", 0.75, 5);

        machine.addItem(candy1);
        machine.addItem(cookie1);
        machine.addItem(chip1);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        Card userCard = new Card();
        int userChoice = -1;
        while (userChoice != 6) {
            printMenu();
            System.out.print("Enter a vending machine option: ");
            userChoice = getInput();

            // Shows products
            if (userChoice == 1) {
                System.out.println(machine);
            }
            // Choose between card and coins
            else if (userChoice == 2) {
                //printCoins();
                printPayment();
                int paymentOption = -1;
                while (paymentOption < 1 || paymentOption > 2) {
                    paymentOption = getInput();
                }

                if(paymentOption == 1) {
                    System.out.print("Choose a coin option: ");
                    char coin = getCoin();
                    Coin insertCoin = new Coin(convertCoin(coin));
                    insertCoin(machine, insertCoin);
                }
                else {
                    System.out.print("Enter name on card: ");
                    userCard.setName(scanner.nextLine());
                    System.out.print("Balance in card: ");
                    userCard.setBalance(scanner.nextDouble());
                    scanner.nextLine();
                    machine.addMoney(userCard.getBalance());
                    System.out.println(userCard);
                }
//                System.out.print("Choose a coin option: ");
//                char coin = getCoin();
//                Coin insertCoin = new Coin(convertCoin(coin));
//                insertCoin(machine, insertCoin);
            }
            // STILL NEEDS TO BE ADDED
            // Buy product
            else if (userChoice == 3) {
                System.out.println(machine);
                int product = -1;
                while (product < 1 || product > machine.size()) {
                    System.out.print("Choose a product: ");
                    product = getInput();
                }
                product--;
                //If the user have enough money, let them buy the item
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
                //removeCoins(machine);
                System.out.println("Amount removed from machine: " + machine.removeMachineMoney());
            }

            System.out.println("Current amount: " + machine.getMoney());
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

    public static void printPayment() {
        System.out.println("Choose a payment option: \n" +
                "1. Coins \n" +
                "2. Card  ");
    }

    /**
     * Obtain the user input as an integer
     */
    //separate the method from sout to reuse. 
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

    //convert user choice to the name for constructing an object
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

