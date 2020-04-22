/*Name: Selina Do and Long Nguyen
  Date: 04/21/2020
  Purpose: Represent a traders who owns stocks
  Inputs: None
  Outputs: None */

/** This class represent a trader implement observer interface
 *  @private each trader has a name
 */
public class Trader implements Observer{
    private String traderName;

    /**
     * Default constructor for Trader class
     * */
    public Trader() {
        traderName = "John Doe";
    }

    /**
     * Custom constructor for Trader class
     * @param name the name of the trader
     */
    public Trader (String name) {
        traderName = name;
    }

    /**
     * Method to access the private instance of a trader object
     * @return the trader name
     */
    public String getTraderName() {
        return traderName;
    }

    /**
     * Assign a new value for the private instance of the Trader object
     * @param traderName the new trader name
     */
    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    @Override
    /**
     * Print the latest trade to the command line
     */
    public void update(Object newState) {
        Trade newTrade = (Trade) newState;
        display(newTrade);
    }

    /**
     * Print the object Trade
     * @param latestTrade the Trade object to be printed*/
    public void display(Trade latestTrade) {
        System.out.println(traderName + " was notified that: \nThe latest trade is: " + latestTrade);
    }
}
