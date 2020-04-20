/** This class represent a trader implement observer interface
 *  @private each trader has a name*/
public class Trader implements Observer{
    private String traderName;

    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    @Override
    public void update(Object newState) {

    }
}
