public class ShoppingTester {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item soap = new Item("soap", 2);
        Item iceCream = new Item("ice-cream", 4);
        Item candy = new Item("candy", 1);

        cart.addItem(soap);
        cart.addItem(iceCream);
        cart.addItem(candy);

        System.out.println("Sum of items: " + cart.calculateTotal());

        cart.pay(new CreditCardStrategy("John Doe", "245614361234",
                "456", "04/29/2020"));

        cart.pay(new PaypalStrategy("John@gmail.com", "JavaIsNice"));
    }
}
