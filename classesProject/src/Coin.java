/*Name: Selina Do and Long Nguyen
  Date: 03/04/20
  Purpose: an object that store the value of the user input
  Inputs: None
  Outputs: None*/


public class Coin {
    private String type;
    private double value;

    /**Null constructor for the coin class
     * */
    public Coin(){
        type = "quarter";
        value = 0.25;
    }

    /** Initializes type of coin
     * @param usrCoin type of coin to be created */
    public Coin(String usrCoin){
        if (usrCoin == "nickel"){
            type = "nickel";
            value = 0.05;
        }
        else if (usrCoin == "dime"){
            type = "dime";
            value = 0.1;
        }
        else if (usrCoin == "quarter"){
            type = "quarter";
            value = 0.25;
        }
        else if (usrCoin == "dollar"){
            type = "dollar";
            value = 1.0;
        }
    }

    /** Return the type of the coin */
    public String getType() {
        return type;
    }

    /** Return the value of the coin*/
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type + "@" + value;
    }
}
