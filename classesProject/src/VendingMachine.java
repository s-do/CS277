/*Name: Selina Do and Long Nguyen
  Date: 03/04/20
  Purpose: Store all product objects in an ArrayList type object
  Inputs: None
  Outputs: None*/

import java.util.ArrayList;

public class VendingMachine {
    /* list of product objects */
    private ArrayList<Product> itemList;
    /* amount of money user puts into the VendingMachine */
    private double money;
    /* amount of money in the vending machine */
    private double machineMoney;

    /**
     * Null constructor for VendingMachine class
     */
    public VendingMachine() {
        itemList = new ArrayList<Product>();
    }

    /**
     * Adds a Product object into the VendingMachine list
     * @param item Product item to be added
     */
    public void addItem(Product item) {
        itemList.add(item);
    }

    /**
     * Removes a Product object from the VendingMachine list based on given index
     * @param itemIndex index where Product object will be removed from list
     * @return removed Product item
     */
    public Product removeItem(int itemIndex) {
        return itemList.remove(itemIndex);
    }

    /**
     * Removes a Product object from the VendingMachine list
     * @param product Product item to be removed
     */
    public void removeItem(Product product) {
        itemList.remove(product);
    }

    /**
     * Returns the Product at a given index
     * @param itemIndex index where item will be returned
     * @return Product item
     */
    public Product getItem(int itemIndex) {
        return itemList.get(itemIndex);
    }

    /**
     * Returns the number of items in the VendingMachine list
     * @return number of items
     */
    public int size() {
       return itemList.size();
    }

    /**
     * Amount of coins user adds into the VendingMachine
     * @param usrMoney coin user adds
     */
    public void addMoney(double usrMoney) {
        money += usrMoney;
    }

    /**
     * Returns the amount of money the user added
     * @return amount of money user added
     */
    public double getMoney(){
        return money;
    }

    /**
     * Returns the amount of money the machine has
     * @return amount of money in the machine
     */
    public double getMachineMoney() {
        return machineMoney;
    }

    /**
     * Changes the amount of money the machine has
     * @param machineMoney new money amount that the machine will have
     */
    public void setMachineMoney(double machineMoney) {
        this.machineMoney = machineMoney;
    }

    /**
     * Add the money from the user into the machine money's total
     * @param usrMoney money user will put into the machine
     */
    public void addMachineMoney(double usrMoney){
        machineMoney += usrMoney;
    }

    /**
     * Removes all money the user has in the machine
     * @return amount of money to be returned
     */
    public double removeMoney() {
        double returnMoney = money;
        money = 0;
        return returnMoney;
    }

    /**
     * Removes the amount of money from user when buying a product
     * @param cost cost of product
     * @return amount of money left after cost was subtracted
     */
    public double removeMoney(double cost) {
        money -= cost;
        return money;
    }

    /**
     * Removes the amount of money the machine has and returns it
     * @return amount of money is in the machine
     */
    public double removeMachineMoney() {
        double returnMoney = machineMoney;
        machineMoney = 0;
        return returnMoney;
    }

    /**
     * Checks if the user has enough moeny to buy a product
     * @param usrChoice number of the product user wants to buy
     * @return true if user has enough money and false if they don't
     */
    public boolean verifyMoney(int usrChoice) {
//        if (machineMoney >= itemList.get(usrChoice).getCost()) {
        if (money >= itemList.get(usrChoice).getCost()) {
            return true;
        }
        return false;
    }

    /**
     * Subtracts the from the user's and VendingMachine money and quantity when user buys a product
     * @param usrProduct product user wants to buy
     */
    public void buyProduct(Product usrProduct){
        usrProduct.removeQuantity();
        machineMoney += money;
        money = 0;
    }

    /**
     * String Representation of VendingMachine class
     * @return each item in the VendingMachine list as a string
     */
    public String toString() {
        String product = "";
        for (int i = 0; i < itemList.size(); i++){
            product +=  (i + 1) + ") " + itemList.get(i) + "\n";
        }
        return product;
    }

}