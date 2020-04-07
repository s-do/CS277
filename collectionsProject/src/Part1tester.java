import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//DONT KNOW HOW TO RUN TREEMAP AND HASHMAP SEPARATELY

public class Part1tester {
    public static void main(String[] args) {
        // command line argument for "q not followed by a u" file
        String inputFileName = args[0];
        File inputFile = new File(inputFileName);
        //Second command line argument to choose the data structure
        String dataStructure = args[1];

        File valueList = new File("alphabetPtValue.txt");

        // used to time results for loading time of TreeMap?
        long startLoadTime = System.nanoTime();

        try{

            Scanner wordValueList = new Scanner(valueList);

            // reads file into TreeMap data structure
            Scanner input = new Scanner(inputFile);
            Map<String, Integer> wordMap;
            Map<String, Integer> wordValueMap;
            if (dataStructure == "Tree") {
                wordMap = new TreeMap<>();
                wordValueMap = new TreeMap<>();
                System.out.println("Using TreeMap");
            }
            else {
                wordMap = new HashMap<>();
                wordValueMap = new HashMap<>();
                System.out.println("Using HashMap");
            }
            while (wordValueList.hasNext()) {
                //wordValueMap.put(wordValueList.next(), wordValueList.nextInt());
                String wordLine = wordValueList.nextLine();
                //System.out.println(wordLine);
                String[] arrayLine = wordLine.split(", ");
//                System.out.println(arrayLine[0]);
//                System.out.println(arrayLine[1]);
                wordValueMap.put(arrayLine[0], Integer.parseInt(arrayLine[1]));
            }
            Set<String> valueSet = wordValueMap.keySet();
            System.out.println("Value set: ");
            for (String key : valueSet) {
                Integer value = wordValueMap.get(key);
                System.out.println(key + "-->" + value);
            }



            while (input.hasNext()){
                String word = input.nextLine();
                int wordValue = calValue(word,wordValueMap);
                wordMap.put(word, wordValue);
                //hash.put(word, 0);
            }
            input.close();

            // calculates the loading time of TreeMap
            long estimatedLoadTime = System.nanoTime() - startLoadTime;

            //System.out.println("Using TreeMap:");
            System.out.println("Time for loading into Map " + estimatedLoadTime + " nano-seconds");

            // prints out each key/value pairs in TreeMap
            Set<String> keySet = wordMap.keySet();
            for (String key : keySet) {
                Integer value = wordMap.get(key);
                System.out.println(key + " --> " + value);
            }

        }
        catch (FileNotFoundException exception){
            System.out.println("Input file was not found");
        }
    }
    public static int calValue(String word, Map charValue) {
        int totalValue = 0;
        for (int i = 0; i < word.length(); i++) {
            totalValue = totalValue +(int)charValue.get(word.substring(i,i+1));
        }
        return totalValue;
    }
}

