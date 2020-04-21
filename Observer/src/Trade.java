/** This class represent the abstract concept of trading (not a physical object)*/
public class Trade {
    private Trader mTrader;
    private String mType;
    private double mAmount;
    private String mStock;      //get the stock name

    public Trade( Trader trader, String type, double amount, Stock stock) {
        mTrader = trader;
        mType = type;
        mAmount = amount;
        mStock = stock.getStockName();
    }

    @Override
    public String toString() {
        return mTrader.getTraderName() + " " + mType + " $" + mAmount + " Stock: " + mStock;
    }
}
