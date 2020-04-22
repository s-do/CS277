/*Name: Selina Do and Long Nguyen
  Date: 04/21/2020
  Purpose: Represent Implement Subject interface and keep a list of the subscribers
            in order to notify them about the latest trade
  Inputs: None (put in stock name when construct the class)
  Outputs: None */

import java.util.ArrayList;
/** This class represent a stock implement the subject interface
 *  @private the name of the stock, the Traders that bought the stock, and the latest trade
 */
public class Stock implements Subject{
    private String mStockName;
    private ArrayList<Observer> traderList;
    private Trade latestTrade;

    /**
     * Default constructor of Stock class
     */
    public Stock() {
        mStockName = "Gintama";
        traderList = new ArrayList<>();
    }

    /**
     * Custom constructor of Stock class
     * @param stockName name of stock
     */
    public Stock (String stockName){
        mStockName = stockName;
        traderList = new ArrayList<>();
    }

    /**
     * Method to access the private instance of a Stock object
     * @return name of stock
     */
    public String getStockName() {
        return mStockName;
    }

    /**
     * Assigns a new value for the private instance of the Stock object
     * @param stockName new stock name
     */
    public void setStockName(String stockName) {
        this.mStockName = stockName;
    }

    /**
     * Adds a trader to the list of traders
     * @param trader trader to be added to the list
     */
    @Override
    public void addObserver(Observer trader) {
        traderList.add(trader);
    }

    /**
     * Notifies trader of the most recent trade
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : traderList) {
            observer.update(latestTrade);
        }
    }

    /**
     * Removes a trader from the list of traders
     * @param trader trader to be removed from the list
     */
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

    /**
     * String representation of stock
     * @return name of stock as a string
     */
    @Override
    public String toString() {
        return "Stock Name: " + mStockName;
    }
}
