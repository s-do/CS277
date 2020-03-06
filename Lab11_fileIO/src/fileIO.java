import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileIO {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("ziptable.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("output.txt");
        while(in.hasNextLine()){
            out.println(in.nextLine());
        }
        in.close();
        out.close();
    }
}
