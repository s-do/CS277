public class Tester {
    public static void main(String[] args) {
        CartVisitor cartVisitor = new CartVisitor();

        Fruit peach = new Fruit("peach", 3, 2.50);
        Fruit apple = new Fruit("apple", 5, 0.82);
        Fruit banana = new Fruit("banana", 4, 0.95);

        Magazine mag1 = new Magazine("Scientific American", "10/21/20 ", 5.38);
        Magazine jump = new Magazine("Gintama", "10/21/08 ", 2.75);
        Magazine geo = new Magazine("National Geographic", "10/21/20 ", 7.35);

        System.out.println("Fruit: ");
        double peachP = peach.accept(cartVisitor);
        System.out.println("Fruit name: " + peach.getName() + "Price: " + peachP);
        double appleP = apple.accept(cartVisitor);
        System.out.println("Fruit name: " + apple.getName() + "Price: " + appleP);
        double bananaP = banana.accept(cartVisitor);
        System.out.println("Fruit name: " + banana.getName() + "Price: " +bananaP);

        System.out.println("");
        //System.out.println("Magazine: ");
        double mag1P = mag1.accept(cartVisitor);
        System.out.println("Magazine: " + mag1.getTitle() + "Date: " + mag1.getVdate() + "Price: " + mag1P);
        double jumpP = jump.accept(cartVisitor);
        System.out.println("Magazine: " + jump.getTitle() + "Date: " + jump.getVdate() + "Price: " + jumpP);
        double geoP = geo.accept(cartVisitor);
        System.out.println("Magazine: " + geo.getTitle() + "Date: " + geo.getVdate() + "Price: " + geoP);

        System.out.println("");

        double totalCost = peachP + appleP + bananaP + mag1P + jumpP + geoP;
        System.out.println("Total cost: " + totalCost);
    }

}
