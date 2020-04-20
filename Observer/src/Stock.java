/** This class represent a stock implement the subject interface
 *  @private the name of the stock, the Traders that bought the stock, and the latest trade*/
import java.util.ArrayList;

public class Stock implements Subject{
    private String stockName;
    private ArrayList<Trader> traderList;
    private Trade latestTrade;

    public Stock() {
        stockName = "Gintama";
        traderList = new ArrayList<>();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public void addObserver(Observer o) {
        //traderList.add();
    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public void removeObserver(Observer o) {

    }
}
