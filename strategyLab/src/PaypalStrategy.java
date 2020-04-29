public class PaypalStrategy implements PaymentStrategy{
    private String email;
    private String password;

    public PaypalStrategy () {
        email = "gintama@gmail.com";
        password = "12345";
    }
    public PaypalStrategy (String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment from Paypal: " + amount);
    }
}
