import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part2tester {
    public static void main(String[] args) {
        String inputFileName = args[0];
        File inputFile = new File(inputFileName);
        //Second command line argument to choose the set type
        String dataStructure = args[1];

        try{

            // reads file into set
            Scanner input = new Scanner(inputFile);
            Set<String> setType;

            if (dataStructure.equals("Tree")) {
                setType = new TreeSet<>();
                System.out.println("Using Tree Set:");
            }
            else {
                setType = new HashSet<>();
                System.out.println("Using Hash Set:");
            }

            // Inserts all words from file into set
            long startLoadTime = System.currentTimeMillis();
            while (input.hasNext()){
                String word = input.next();
                setType.add(word);
            }
            long estimatedEndTime = System.currentTimeMillis();
            input.close();

            // Calculates the loading time for set
            long estimatedLoadTime = estimatedEndTime - startLoadTime;
            System.out.println("Elapsed time for loading = " + estimatedLoadTime + " milliseconds");

            // Searches for a word from the novel file 100 times
            long startSearch = System.currentTimeMillis();
            for (int i = 0; i < 100; i++){
                for (String word: setType){
                    if (word.equals("Alice")){
                        continue;
                    }
                }
            }

            long stopSearch = System.currentTimeMillis();
            System.out.println("Search time: " + (stopSearch - startSearch) + " milliseconds");

        }
        catch (FileNotFoundException exception){
            System.out.println("Input file was not found");
        }
    }
}
