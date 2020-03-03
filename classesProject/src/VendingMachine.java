import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> itemList;
    private double money;

    public VendingMachine() {
        itemList = new ArrayList<Product>();
    }

    public void addItem(Product item) {
        itemList.add(item);
    }

    public Product removeItem(int itemIndex) {
        return itemList.remove(itemIndex);
    }

    //adding coin
    public void addMoney(double usrMoney) {
        money += usrMoney;
    }

    public void removeMoney(double usrMoney) {
        money -= usrMoney;
    }

    public double getMoney(){
        return money;
    }

    public double clearAccount() {
        double returnMoney = money;
        money = 0;
        return returnMoney;
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
            product += itemList.get(i) + "\n";
        }
        return product;
    }

}