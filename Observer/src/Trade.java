/** This class represent the abstract concept of trading (not a physical object)*/
public class Trade {
    private Trader mTrader;
    private double mAmount;

    public Trade( Trader trader, double amount) {
        mTrader = trader;
        mAmount = amount;
    }

    @Override
    public String toString() {
        return "Trader: " + mTrader.getTraderName() + " amount: $" + mAmount;
    }
}
