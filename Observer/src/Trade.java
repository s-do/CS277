/** This class represent the abstract concept of trading (not a physical object)*/
public class Trade {
    private Trader mTrader;
    private String mType;
    private double mAmount;
    private String mStock;      //get the stock name

    //FixMe: this constructor is a little sketch because it take in object stock but only save the name of the stock
    public Trade( Trader trader, String type, double amount, Stock stock) {
        mTrader = trader;
        mType = type;
        mAmount = amount;
        mStock = stock.getStockName();
    }

    //FixMe: Not sure how to display the name of the stock therefore a private instance is used
    @Override
    public String toString() {
        return "Trader: " + mTrader.getTraderName() + "type: " + mType + " amount: $" + mAmount + "Stock: " + mStock;
    }
}
