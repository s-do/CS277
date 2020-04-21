/** This class represent a trader implement observer interface
 *  @private each trader has a name*/
public class Trader implements Observer{
    private String traderName;


    public Trader() {
        traderName = "John Doe";
    }

    public Trader (String name) {
        traderName = name;
    }
    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    @Override
    public void update(Object newState) {
        Trade newTrade = (Trade) newState;
        display(newTrade);
    }

    public void display(Trade latestTrade) {
        System.out.println(traderName + " was notified that: \nThe latest trade is: " + latestTrade);
    }
}
