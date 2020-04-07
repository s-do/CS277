import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part1tester {
    public static void main(String[] args) {
        // command line argument for "q not followed by a u" file
        String inputFileName = args[0];
        File inputFile = new File(inputFileName);

        // used to time results for loading time of TreeMap
        long startLoadTime = System.nanoTime();

        try{
            // reads file into TreeMap data structure
            Scanner input = new Scanner(inputFile);
            Map<String, Integer> tree = new TreeMap<>();
            //Map<String, Integer> hash = new HashMap<>();

            while (input.hasNext()){
                String word = input.nextLine();
                tree.put(word, 0);
                //hash.put(word, 0);
            }
            input.close();

            // calculates the loading time of TreeMap
            long estimatedLoadTime = System.nanoTime() - startLoadTime;

            System.out.println("Using TreeMap:");
            System.out.println("Time for loading into Map " + estimatedLoadTime + " nano-seconds");

            // prints out each key/value pairs in TreeMap
            Set<String> keySet = tree.keySet();
            for (String key : keySet) {
                Integer value = tree.get(key);
                System.out.println(key + " --> " + value);
            }

        }
        catch (FileNotFoundException exception){
            System.out.println("Input file was not found");
        }
    }
}

