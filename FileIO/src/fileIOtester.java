import java.io.*;
import java.util.Scanner;


public class fileIOtester {
    public static void main(String[] args) {
        try {
            File infoFile = new File("sales.txt");
            PrintWriter printWriter = new PrintWriter(new FileWriter(infoFile,true));

            String name = "";
            while (name.length() < 0) {
                System.out.println("Enter your name: ");
                name = getName();
            }

            System.out.println("Enter type of service: ");
            String service = getService();

            if (service.equals("Conference")) {
                throw new UnknownTransactionException("No such service available");
            }

            double saleAmount = 0;
            while (saleAmount < 0) {
                System.out.println("Enter amount of sale: ");
                saleAmount = getAmount();
            }

            String date = "";
            while (date.length() < 0) {
                System.out.println("Enter date of service: ");
                date = getDate();
            }

            //Add all user info to the file(appending)
            printWriter.printf(name, ";", service, ";",saleAmount, ";", date);
        }
        catch (FileNotFoundException fnf){
            System.out.println("Sales file does not exist");
        }
        catch (IOException exception) {
            //e.printStackTrace();
            System.out.println("Could not open file");
        }


    }

    public static String getName() {
        return "";
    }

    public static String getService() {
        return "";
    }

    public static double getAmount(){
        return 0;
    }

    public static String getDate() {
        return "";
    }

    //return true if the user Input is one of the provided service.
    public static boolean isService(String userInput){
        return true;
    }
}
