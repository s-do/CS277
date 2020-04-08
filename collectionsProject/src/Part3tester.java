import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part3tester {
    public static void main(String[] args) {
        List<String> myList = null;
        if (args.length == 0)
            System.out.println("Usage: datatype");
        else {
            if (args[0].equals("LinkedList")) {
                myList = new LinkedList<String>();
                System.out.println("Using LinkedList");
            } else {
                myList = new ArrayList<String>();
                System.out.println("Using ArrayList");
            }
        }

        File itemFile = new File("items.txt");
        try {
            Scanner itemScanner = new Scanner(itemFile);
            while (itemScanner.hasNext()) {
                myList.add(itemScanner.nextLine());
            }
            itemScanner.close();

            //create a forward list iterator
            ListIterator<String> listIterator = myList.listIterator();
            System.out.print("List of items: [");
            while (listIterator.hasNext()) {
                System.out.print(listIterator.next());
                // FIXME: 4/7/2020 Last Item will have a trailing comma!
                System.out.print(", ");
            }
            System.out.print("]");
            System.out.println("");

            //Create a backward list iterator and iterate backward
            ListIterator<String> backwardIterator = myList.listIterator(myList.size());
            System.out.print("List of Items backward: [");
            while (backwardIterator.hasPrevious()) {
                System.out.print(backwardIterator.previous());
                // FIXME: 4/7/2020 Last item will have a trailing comma!
                System.out.print(", ");
            }
            System.out.print("]");
            System.out.println("");

            //Ask the user for amount of players
            System.out.println("Enter the number of players: ");
            int amountPlayers = getPlayers();

            //create a number of teams using user input
            // FIXME: 4/7/2020 Create an n amount of lists base on the users index and access them later
            for (int i = 0; i < amountPlayers; i++){
                System.out.println("");
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("Oops! No File was found.");
        }
    }
    public static int getPlayers(){
        Scanner scanner = new Scanner(System.in);
        int userInput = -1;
        while (userInput > 0) {
            userInput = scanner.nextInt();
        }
        return userInput;
    }
}
