public class Coin {
    private String type;
    private double value;

    public Coin(){
        type = "quarter";
        value = 0.25;
    }

    //separate constructor from user input.
    public Coin(char usrCoin){
        if (usrCoin == 'a' || usrCoin == 'A'){
            type = "nickel";
            value = 0.05;
        }
        else if (usrCoin == 'b' || usrCoin == 'B'){
            type = "dime";
            value = 0.1;
        }
        else if (usrCoin == 'c' || usrCoin == 'C'){
            type = "quarter";
            value = 0.25;
        }
        else if (usrCoin == 'd' || usrCoin == 'D'){
            type = "dollar";
            value = 1.0;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return type + "@" + value;
    }
}
