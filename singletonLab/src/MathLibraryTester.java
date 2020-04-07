import org.w3c.dom.ls.LSOutput;

public class MathLibraryTester {
    public static void main(String[] args) {
        MathLibrary math1 = MathLibrary.getInstance();
        MathLibrary math2 = MathLibrary.getInstance();

        System.out.println("math 1: " + math1);
        System.out.println("math 1 hash: " + math1.hashCode());
        System.out.println("math 2: " + math2);
        System.out.println("math 2 hash: " + math2.hashCode());
    }



}
