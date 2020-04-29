public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String CardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy() {
        name = "John";
        CardNumber = "987654321";
        cvv = "123";
        dateOfExpiry = "04/28/2020";
    }

    public CreditCardStrategy(String name, String CardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.CardNumber = CardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment amount from credit card: " + amount);
    }
}
