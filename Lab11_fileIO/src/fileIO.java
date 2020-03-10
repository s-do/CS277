import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileIO {
    public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Usage: inputFile outputFile");
            System.exit(0);
        }
        System.out.print("Input file: ");
        String inputFileName = args[0];
        System.out.println(args[0]);
        System.out.print("Output file: ");
        String outputFileName = args[1];
        System.out.println(args[1]);
        
        File inputFile = new File(inputFileName);
        try(
                Scanner in = new Scanner(inputFile);
                PrintWriter out = new PrintWriter(outputFileName);){
            while(in.hasNextLine()) {
                out.println(in.nextLine());
            }
            in.close();
            out.close();
        } catch (FileNotFoundException fnf){
            System.out.println(fnf.getMessage());
        }
    }
}
