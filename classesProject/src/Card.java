public class Card {
    private double balance;
    private String name;

    public Card() {
        name = "Nova";
        balance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card(String usrName, double Balance) {
        balance = Balance;
        name = usrName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void subtractBalance(double cost) {
        balance -= cost;
    }

    @Override
    public String toString() {
        return "Name on Card: " + name + " balance: " + balance;
    }
}