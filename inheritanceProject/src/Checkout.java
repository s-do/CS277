//Checkout class to print receipt and stuff

import java.util.ArrayList;
import java.util.Collections;

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

    public DessertItem get(int i){
        return itemList.get(i);
    }

    //clear the list of items
    public void clear() {
        itemList.clear();
    }

    //sort method for Checkout class
    public void sort() {
        Collections.sort(itemList);
    }

    //totalCost() return the total in cents
    public double totalCost() {
        //total cost will be in cents and without tax
        double total = 0;
        for(DessertItem item : itemList) {
            total = total + (item.getCost());
        }
        //round the total cost to the closet int
        return Math.round(total * 100.0) / 100.0;
    }

    //return the total tax in cents
    public double totalTax() {
        double total_cost = this.totalCost();
        //round the total tax amount to the closet int
        return Math.round(total_cost * taxRate * 100.0) / 100.0;
    }
    public String toString() {
        double costTax = this.totalCost() + this.totalTax();
        String dessert = "Number of items: " + this.numberOfItems() + "\n"
                + "Total cost: " + this.totalCost() + "\n"
                + "Total tax: " + this.totalTax() + "\n"
                + "Cost + Tax: " + costTax + "\n"
                + " \n"
                + "           L&S Dessert Shop" + "\n"
                + "           ----------------" + "\n";
        for (DessertItem item: itemList){
            if (item instanceof Candy){
                dessert += ((Candy) item).getWeight() + " @ " + ((Candy) item).getPricePerLB() + "/dz. \n"
                        + item + "                  " + item.getCost() + "\n";
            }
            if (item instanceof  Cookie){
                dessert += ((Cookie) item).getAmount() + " lbs. @ " + ((Cookie) item).getPricePerDozen() + "/lb. \n"
                        + item + "                  " + item.getCost() + "\n";
            }
            if (item instanceof IceCream){
                if (item instanceof Sundae){
                    dessert += item + "with\n" + ((Sundae) item).getTopping() + "            " + item.getCost() + "0\n";
                }
                else{
                    dessert += item + "              " + item.getCost() + "\n";
                }
            }
        }
        dessert += "\n" + "Tax: " + totalTax() + "\nTotal cost: " + costTax;
        return dessert;
    }

}
