public class Coin {
    private String type;
    private double value;

    public Coin(){
        type = "quarter";
        value = 0.25;
    }

    public Coin(String coinType){
        if (coinType.equals("nickel")){
            value = 0.05;
        }
        else if (coinType.equals("dime")){
            value = 0.1;
        }
        else if (coinType.equals("quarter")){
            value = 0.25;
        }
        else if (coinType.equals("dollar")){
            value = 1.0;
        }
    }
}
