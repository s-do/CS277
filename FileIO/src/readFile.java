import java.io.*;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter a file to read from: ");
            System.exit(0);
        }
        String inputFileName = args[0];
        File inputFile = new File(inputFileName);
        System.out.println("input file: " + inputFileName);
        try {
            Scanner input = new Scanner(inputFile);

            while (input.hasNext()){
                //Read in new line from the text file and save it into a variable
                String sentence = input.nextLine();
                //Split the line and save it into an array
                String[] sentenceContent = sentence.split(";");
                //create a printWriter object that takes in the second index of the array which is the service needed
                //create a file if there isn't one, if already exist, add to the file.
                PrintWriter printWriter = new PrintWriter( new FileWriter(sentenceContent[1] + ".txt", true));
                //Write the sentence to the file.
                printWriter.println(sentence);
                printWriter.close();
            }
            input.close();
        }
        catch (FileNotFoundException exception){
            System.out.println("Input file was not found");
        }
        catch (IOException exception) {
            System.out.println("Input output exception");
        }
    }
}
