public class LetsEat {
    public static void main(String[] args) {

        IceCreamShop dairyQueen = new DairyQueen();

        IceCream cone;
        cone = dairyQueen.orderCone("Chocolate");
        System.out.println("Enjoying some " + cone.getDescription() + " which costs " + cone.cost());
        System.out.println("");

        IceCream cone2;
        cone2 = dairyQueen.orderCone("Vanilla");
        System.out.println("Enjoying some " + cone2.getDescription() + " which costs " + cone2.cost());
        System.out.println("");

        IceCream cone3;
        cone3 = dairyQueen.orderCone("Strawberry");
        cone3.eat();
        System.out.println("Enjoying some " + cone3.getDescription() + " which costs " + cone3.cost());
        System.out.println("");
        //Add toping
        Dessert vanillaCherry = dairyQueen.orderCone("Vanilla");
        vanillaCherry = new Cherry(vanillaCherry);
        System.out.println("Enjoying some " + vanillaCherry.getDescription() + " which costs " + vanillaCherry.cost());
        System.out.println("");

        Dessert chocoWhippedCream = dairyQueen.orderCone("Chocolate");
        chocoWhippedCream = new WhippedCream(chocoWhippedCream);
        chocoWhippedCream = new HotFudge(chocoWhippedCream);
        System.out.println("Enjoying some " + chocoWhippedCream.getDescription() + " which costs " + chocoWhippedCream.cost());
    }
}
