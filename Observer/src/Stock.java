/*Name: Selina Do and Long Nguyen
  Date: 04/21/2020
  Purpose: Represent Implement Subject interface and keep a list of the subscribers
  in order to notify them about the latest trade
  Inputs: None (put in stock name when construct the class)
  Outputs: None */
/** This class represent a stock implement the subject interface
 *  @private the name of the stock, the Traders that bought the stock, and the latest trade*/
import java.util.ArrayList;

public class Stock implements Subject{
    private String mStockName;
    private ArrayList<Observer> traderList;
    private Trade latestTrade;

    public Stock() {
        mStockName = "Gintama";
        traderList = new ArrayList<>();
    }

    public Stock (String stockName){
        mStockName = stockName;
        traderList = new ArrayList<>();
    }

    public String getStockName() {
        return mStockName;
    }

    public void setStockName(String stockName) {
        this.mStockName = stockName;
    }

    @Override
    public void addObserver(Observer trader) {
        traderList.add(trader);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : traderList) {
            observer.update(latestTrade);
        }
    }

    @Override
    public void removeObserver(Observer trader) {
        traderList.remove(trader);
    }

    /** Update latestTrade private variables to the latest trade
     *  then notify all subscriber in the list.*/
    public void addLatestTrade(Trade trade){
        latestTrade = trade;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Stock Name: " + mStockName;
    }
}
