/*Name: Selina Do and Long Nguyen
  Date: 04/08/2020
  Purpose: Test the efficiency of ArrayList and LinkList when iterating, loading, accesing a random item, inserting
  Inputs: Data Structure type (ArrayList or Link List)
  Outputs: List of items inside the list, which random elements was retrieved, items at an index chosen by the user
  run time of each operations: iteration, loading, retrieving, inserting, retrieving random item.*/
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
            //add 100 items to myList
            while (itemScanner.hasNext()) {
                myList.add(itemScanner.nextLine());
            }

            //create a forward list iterator and iterate forward
            long startIterateTime = System.nanoTime();
            ListIterator<String> listIterator = myList.listIterator();
            System.out.print("List of items: [");
            while (listIterator.hasNext()) {
                System.out.print(listIterator.next());
                System.out.print(", ");
            }
            System.out.print("]");
            System.out.println("");

            //Create a backward list iterator and iterate backward
            ListIterator<String> backwardIterator = myList.listIterator(myList.size());
            System.out.print("List of Items backward: [");
            while (backwardIterator.hasPrevious()) {
                System.out.print(backwardIterator.previous());
                System.out.print(", ");
            }
            System.out.print("]");
            System.out.println("");
            long endIterateTime = System.nanoTime();


            //Ask the user for amount of players
            System.out.println("Enter the number of players: ");
            int amountPlayers = getInt();

            //create a number of teams using user input
            List<List<String>> outerList = new ArrayList<>();
            //Create n number of list for the user to add later
            for (int i = 0; i < amountPlayers; i++){
                //Create multiple LinkedList if the user arguments is LinkedList
                if (args[0].equals("LinkedList")) {
                    outerList.add(new LinkedList<String>());
                }
                //Otherwise create ArrayLists
                else {
                    outerList.add(new ArrayList<String>());
                }
            }

            System.out.println("Outer array List: " + outerList);


            long startTeamTime = System.nanoTime();
            //Add 100 items to each mini list inside the outer list
            //Iterate the outer list to access mini list inside
            for (int i = 0; i < outerList.size(); i++) {
                Scanner testScanner = new Scanner(itemFile);

                //add 100 items to each list
                while (testScanner.hasNext()){
                    String testvar = testScanner.nextLine();
                    outerList.get(i).add(testvar);
                    //Shuffle the list every time an item is added
                    Collections.shuffle(outerList.get(i));
                }
                testScanner.close();
            }
            long endTeamTime = System.nanoTime();
            System.out.println("Outer List added: " + outerList);

            //Ask the user for the index to remove and insert items
            System.out.println("Enter a position to insert items: ");
            int userPosition = getInt();

            //retrieve an item at the user position from all the list
            long startRetrieveTime = System.nanoTime();
            for (int i = 0; i < outerList.size(); i++) {
                System.out.println("Item retrieved: " + outerList.get(i).get(userPosition));
            }
            long endRetrieveTime = System.nanoTime();

            //Insert an item at the user position
            long startInsertTime = System.nanoTime();
            for (int i = 0; i < outerList.size(); i++) {
                outerList.get(i).add(userPosition, "Hello World");
            }
            long endInsertTime = System.nanoTime();

            System.out.println("After inserting: " + outerList);

            //Obtain a random number between 1 - 100
            Random rand = new Random();
            int randomNumber = rand.nextInt(101);

            //Retrieve the item from the random position
            long startRandomTime = System.nanoTime();
            for (int i = 0; i < outerList.size(); i++) {
                System.out.println("Item at "+ randomNumber + " is: " + outerList.get(i).get(randomNumber));
            }
            long endRandomTime = System.nanoTime();

            System.out.println("");
            System.out.println("Iterate forward and backward time: " + (endIterateTime - startIterateTime) + " ns");
            System.out.println("Time to load to teams: " + (endTeamTime - startTeamTime) + " ns");
            System.out.println("Retrieving time: " + (endRetrieveTime - startRetrieveTime) + " ns");
            System.out.println("Inserting time: " + (endInsertTime - startInsertTime) + " ns");
            System.out.println("Retrieve random item time: " + (endRandomTime - startRandomTime) + " ns");
        }
        catch (FileNotFoundException exception) {
            System.out.println("Oops! No File was found.");
        }
    }

    /**
     * Gets user input
     * @return integer that user entered
     */
    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        int userInput = -1;
        while (userInput < 0) {
            userInput = scanner.nextInt();
        }
        return userInput;
    }
}
