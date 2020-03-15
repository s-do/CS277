import java.io.*;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        String inputFileName = args[0];
        File inputFile = new File(inputFileName);
        System.out.println("input file: " + inputFileName);
        try {
            Scanner input = new Scanner(inputFile);

            while (input.hasNext()){
                String sentence = input.nextLine();
                String[] sentenceContent = sentence.split(";");
                PrintWriter printWriter = new PrintWriter( new FileWriter(sentenceContent[1] + ".txt", true));
                printWriter.println(sentence);
                System.out.println(sentence);
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
