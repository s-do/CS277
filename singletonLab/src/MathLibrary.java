public class MathLibrary {
    private static MathLibrary instance = new MathLibrary();
//    private static MathLibrary instance;
    private MathLibrary() { }

    public static MathLibrary getInstance() {
        return instance;
    }

//    public static MathLibrary getInstance() {
//        if (instance == null)
//            instance = new MathLibrary();
//
//        return instance;
//    }

    public int someMathMethod() {
        return -1;
    }

    public double anotherMathMethod() {
        return 0;
    }

    public String toString() {
        return "this is the instance of math ";
    }
}