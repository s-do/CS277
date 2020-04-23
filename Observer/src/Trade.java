/*Name: Selina Do and Long Nguyen
  Date: 04/21/2020
  Purpose: Represent the abstract concept of trading stock. A stock can either be buy or sold at a certain
            price by a certain owners.
  Inputs: None
  Outputs: None
*/

/** This class represent the abstract concept of trading (not a physical object)*/
public class Trade {
    /* name of trader */
    private Trader mTrader;
    /* type of transaction (buy/sell) */
    private String mType;
    /*amount stock will be sold/bought for */
    private double mAmount;
    /* name of stock */
    private String mStock;

    /**
     * Default constructor for Trade class
     */
    public Trade() {
        mTrader = new Trader("Jane Doe");
        mType = "buy";
        mAmount = 100.0;
        mStock = "TSLA";
    }

    /**
     * Custom constructor for Trade class
     * @param trader trader who owns a stock
     * @param type transaction of buying or selling a stock
     * @param amount price of stock
     * @param stock name of stock
     */
    public Trade(Trader trader, String type, double amount, Stock stock) {
        mTrader = trader;
        mType = type;
        mAmount = amount;
        mStock = stock.getStockName();
    }

    /**
     * String representation of Trade class
     * @return the name of the trader, which stock they bought/sold a stock, and price of the stock
     */
    @Override
    public String toString() {
        return mTrader.getTraderName() + " " + mType + " $" + mAmount + " Stock: " + mStock;
    }
}
