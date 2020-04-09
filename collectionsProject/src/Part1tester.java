/*Name: Selina Do and Long Nguyen
  Date: 04/08/2020
  Purpose: Test the efficiency of HashMap and TreeMap when adding, loading and searching
  Inputs: Data Structure type (Hash Map or Tree Map) and an input file that contain words that start with q
  Outputs: Loading time and searching time as well as where all the items are mapped to*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part1tester {
    public static void main(String[] args) {
        // command line argument for "q not followed by a u" file
        String inputFileName = args[0];
        File inputFile = new File(inputFileName);

        //Second command line argument to choose the data structure
        String dataStructure = args[1];

        File valueList = new File("alphabetPtValue.txt");

        try{

            Scanner wordValueList = new Scanner(valueList);

            // reads file into TreeMap data structure
            Scanner input = new Scanner(inputFile);
            Map<String, Integer> wordMap;
            Map<String, Integer> wordValueMap;

            if (dataStructure.equals("Tree") || dataStructure.equals("tree")) {
                wordMap = new TreeMap<>();
                wordValueMap = new TreeMap<>();
                System.out.println("Using TreeMap");
            }
            else {
                wordMap = new HashMap<>();
                wordValueMap = new HashMap<>();
                System.out.println("Using HashMap");
            }

            //Load the scrabble word face value into a separate map data structure
            while (wordValueList.hasNext()) {
                String wordLine = wordValueList.nextLine();
                String[] arrayLine = wordLine.split(", ");
                //map the character to the following integer value by splitting and converting to integer
                wordValueMap.put(arrayLine[0], Integer.parseInt(arrayLine[1]));
            }
            wordValueList.close();

            //Adding to Map with total value
            //Start loading time test:
            long startLoadTime = System.nanoTime();
            while (input.hasNext()){
                String word = input.nextLine();
                int wordValue = calValue(word,wordValueMap);
                wordMap.put(word, wordValue);
            }
            long estimatedEndTime = System.nanoTime();
            input.close();

            // calculates the loading time of TreeMap
            long estimatedLoadTime = estimatedEndTime - startLoadTime;

            System.out.println("Time for loading into Map " + estimatedLoadTime + " nano-seconds");

            // prints out each key/value pairs in TreeMap
            Set<String> keySet = wordMap.keySet();
            for (String key : keySet) {
                Integer value = wordMap.get(key);
                System.out.println(key + " --> " + value);
            }

            //Search Time test
            long startSearch = System.nanoTime();
            wordMap.get("quats");
            wordMap.get("quat");
            wordMap.get("qi");
            long stopSearch = System.nanoTime();
            System.out.println("Time for searching into Map " + (stopSearch - startSearch) + " nano-seconds");
        }
        catch (FileNotFoundException exception){
            System.out.println("Input file was not found");
        }
    }

    //Method to calculate the total value of a word
    public static int calValue(String word, Map charValue) {
        int totalValue = 0;
        //iterate through the word and check with the word face value save in Map
        for (int i = 0; i < word.length(); i++) {
            totalValue = totalValue +(int)charValue.get(word.substring(i,i+1));
        }
        return totalValue;
    }
}

