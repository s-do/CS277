import java.io.*;
import java.util.Scanner;

public class fileIOtester {
    public static void main(String[] args) {
        File saleFile = new File("sales.txt");
        try {

            PrintWriter printWriter = new PrintWriter(saleFile);
            System.out.println("Input sales information");

            boolean contLoop = true;
            while (contLoop) {
                // Verifies that name of client is not blank
                System.out.println("Enter name: ");
                String name = getStringInput();
                while (name.length() <= 0) {
                    System.out.print("Enter name: ");
                    name = getStringInput();
                }

                // Verifies that service sold is not blank
                System.out.println("Enter type of service: ");
                String service = getStringInput();
                while (service.length() <= 0) {
                    System.out.print("Enter type of service: ");
                    service = getStringInput();
                }

                // Checks if service was sold
                boolean existingService = isService(service);
                while (!existingService) {
                    System.out.print("Enter an existing service: ");
                    service = getStringInput();
                    existingService = isService(service);
                }

                // Verifies that amount of sale is positive
                System.out.println("Enter amount of sale: ");
                double saleAmount = getAmount();
                while (saleAmount < 0) {
                    System.out.print("Enter amount of sale: ");
                    saleAmount = getAmount();
                }

                // Verifies that date of event is not blank
                System.out.println("Enter date of service: ");
                String date = getStringInput();
                while (date.length() <= 0) {
                    System.out.print("Enter date of service: ");
                    date = getStringInput();
                }

                //Add all user info to the file(appending)
                printWriter.println(name + ";" + service + ";" + saleAmount + ";"+ date);

                System.out.println("Do you want to enter more sales? (y/n): ");
                String enterSales = getStringInput();
                if (enterSales.equals("n") || enterSales.equals("N")){
                    contLoop = false;
                }

                else{
                    contLoop = true;
                }
            }
            printWriter.close();
        }
        catch (FileNotFoundException fnf){
            System.out.println("Sales file does not exist");
        }
        catch (UnknownTransactionException exception) {
            System.out.println("Service does not exist");
        }
    }


    public static String getStringInput() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        return userInput;
    }

    public static double getAmount(){
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        return amount;
    }

    //return true if the user Input is one of the provided service.
    public static boolean isService(String userInput) throws UnknownTransactionException{
        if (userInput.equals("Dinner") || userInput.equals("Lodging") || userInput.equals("Conference")
        || userInput.equals("Breakfast") || userInput.equals("Lunch")) {
            return true;
        }
        else{
            throw new UnknownTransactionException("Service does not exist");
        }
    }
}
