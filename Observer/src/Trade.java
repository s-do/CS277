/*Name: Selina Do and Long Nguyen
  Date: 04/21/2020
  Purpose: Represent the abtract concept of trading stock. A stock can either be buy or sold at a certain
   price by a certain owners.
  Inputs: None
  Outputs: None */

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
