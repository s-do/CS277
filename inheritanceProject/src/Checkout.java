//Checkout class to print receipt and stuff

import java.util.ArrayList;

public class Checkout {
    private ArrayList<DessertItem> itemList;
    private double taxRate;

    public Checkout() {
        itemList = new ArrayList<DessertItem>();
        this.taxRate = 0.1;
    }

    //Constructor with tax rate in the parameter
    public Checkout(double taxRate) {
        itemList = new ArrayList<DessertItem>();
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

    //totalCost() return the total in cents
    public int totalCost() {
        //total cost will be in cents and without tax
        double total = 0;
        for(DessertItem item : itemList) {
            //multiply the cost of the item by 100 to convert to cents
            total = total + (item.getCost() * 100);
        }
        //round the total cost to the closet int
        return (int) Math.round(total);
    }

    //return the total tax in cents
    public int totalTax() {
        int total_cost = this.totalCost();
        //round the total tax amount to the closet int
        return (int) (Math.round(total_cost * taxRate));
    }
}
