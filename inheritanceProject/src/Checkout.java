//Checkout class to print receipt and stuff

import java.util.ArrayList;

public class Checkout {
    private ArrayList<DessertItem> itemList;
    private double taxRate;

    public Checkout() {
        itemList = new ArrayList<DessertItem>();
        this.taxRate = 0.1;
    }

    public Checkout(double taxRate) {
        this.taxRate = taxRate;
    }

    //Methods for adjusting tax rate
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    //return the tax rate
    public double getTaxRate() {
        return taxRate;
    }

    //return the size of the list
    public int numberOfItems() {
        return itemList.size();
    }

    //add items into the itemList
    public void enterItem(DessertItem item) {
        itemList.add(item);
    }

    //clear the list of items
    public void clear() {
        itemList.clear();
    }

/*    public int totalCost() {
        int total = 0;
        for(DessertItem item : itemList) {
            total = total + item.getCost();
        }
    }*/
}
