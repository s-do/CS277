import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> itemList;
    private double money;
    private double machineMoney;

    public VendingMachine() {
        itemList = new ArrayList<Product>();
    }

    public void addItem(Product item) {
        itemList.add(item);
    }

    public Product removeItem(int itemIndex) {
        return itemList.remove(itemIndex);
    }

    public void removeItem(Product product) {
        itemList.remove(product);
    }

    //adding coin
    public void addMoney(double usrMoney) {
        money += usrMoney;
    }

    public double getMoney(){
        return money;
    }

    public double getMachineMoney() {
        return machineMoney;
    }

    public void setMachineMoney(double machineMoney) {
        this.machineMoney = machineMoney;
    }

    public void addMachineMoney(double usrMoney){
        machineMoney += usrMoney;
    }

    public double removeMoney() {
        double returnMoney = money;
        money = 0;
        return returnMoney;
    }

    public double removeMoney(double cost) {
        //double returnMoney = money;
        money -= cost;
        return money;
    }

    //buying product
    public boolean verifyMoney(int usrChoice) {
        if (money >= itemList.get(usrChoice).getCost()) {
            //removeMoney(itemList.get(usrChoice).getCost());
            return true;
        }
        return false;
    }

    public String toString() {
        String product = "";
        for (int i = 0; i < itemList.size(); i++){
            product +=  (i + 1) + ") " + itemList.get(i) + "\n";
        }
        return product;
    }

}