public class CartVisitor implements ShoppingCartVisitor {

    @Override
    public double visit(Magazine mag) {
/*        System.out.println("Title: " + mag.getTitle());
        System.out.println("Issue Date: " + mag.getVdate());*/

        if (mag.getPrice() > 5) {
            return Math.round((mag.getPrice() - (mag.getPrice() * 0.1)) * 100.0) / 100.0;
        }
        return mag.getPrice();
    }

    @Override
    public double visit(Fruit fruit) {
/*        System.out.println("Name of fruit: " + fruit.getName());*/
        return Math.round((fruit.getPrice() * fruit.getAmount()) * 100.0) / 100.0;
    }
}
