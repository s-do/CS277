import javax.imageio.IIOException;
import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FileFilter {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Missing a file. Add another one");
            System.exit(0);
        }
        String inputFilename = args[0];
        String outputFilename = args[1];
        String filterString = args[2];
        File importance = new File(inputFilename);
        File outputFile = new File(outputFilename);
        File filterWords = new File(filterString);


        try {
            Scanner inputScanner = new Scanner(importance);
            Scanner filterScanner = new Scanner(filterWords);
            //PrintWriter outputWriter = new PrintWriter(new FileWriter(outputFile, true));
            PrintWriter outputWriter = new PrintWriter(outputFile);

            ArrayList<String> importanceList = new ArrayList<>();

            while(inputScanner.hasNextLine()){
                importanceList.add(inputScanner.nextLine());
            }
            inputScanner.close();

            ArrayList<String> stringList = new ArrayList<>();

            while(filterScanner.hasNextLine()){
                stringList.add(filterScanner.nextLine());
            }
            filterScanner.close();
            System.out.println(stringList);

            for (int line = 0; line < importanceList.size(); line++) {
                for (int word = 0; word < stringList.size(); word++) {
                    boolean lineResult = importanceList.get(line).contains(stringList.get(word));
                    if (lineResult) {
                        outputWriter.println(importanceList.get(line));
                    }
                }
            }

            outputWriter.close();

        }

        catch(FileNotFoundException e) {
            System.out.println("The file was not found!");
        }
    }
}
