/*Name: Long Nguyen & Selina Do
 * Date: 02/19/20
 * Purpose: An ArrayList type object that will store all the dessert items
 * and have methods that calculate their cost and the tax that came with them.
 * Inputs: Tax rate might be added in the instantiation of this object. Otherwise, the default tax is 10%
 * Output: None
 */

import java.util.ArrayList;
import java.util.Collections;

public class Checkout {
    /* list of DessertItems */
    private ArrayList<DessertItem> itemList;
    /* tax rate that will be applied to receipt */
    private double taxRate;

    /**
     * Null constructor for Sundae class
     */
    public Checkout() {
        itemList = new ArrayList<DessertItem>();
        this.taxRate = 0.1;
    }

    //Constructor with tax rate in the parameter

    /**
     * Initializes Sundae data
     * @param taxRate amount of tax that will be put on the total cost of the DessertItems
     */
    public Checkout(double taxRate) {
        itemList = new ArrayList<DessertItem>();
        this.taxRate = taxRate;
    }

    //Methods for adjusting tax rate
    /**
     * Change the default tax rate
     * @param taxRate rate of tax */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    //return the tax rate
    /**
     * Return rate of tax
     * @return rate of tax*/
    public double getTaxRate() {
        return taxRate;
    }

    //return the size of the list
    /**
     * Return number of item in the checkout list
     * @return number of items
     */
    public int numberOfItems() {
        return itemList.size();
    }

    //add items into the itemList
    /**
     * Add an item to the list
     * @param item Dessert item to be added to list*/
    public void enterItem(DessertItem item) {
        itemList.add(item);
    }

    /**
     * Return the item in the checkout list
     * @param i index of ArrayList that will be used to get element
     * @return item in checkout list
     */
    public DessertItem get(int i){
        return itemList.get(i);
    }

    //clear the list of items
    /**
     * Clear the checkout list
     */
    public void clear() {
        itemList.clear();
    }

    //sort method for Checkout class
    /**
     * Sort the checkout list base on item's calories
     */
    public void sort() {
        Collections.sort(itemList);
    }

    //totalCost() return the total in cents
    /**
     * Return the total cost of all items in the checkout list before tax
     * @return total cost of all items in the list before tax*/
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
    /**
     * Return amount of tax on all items
     * @return amount of tax
     */
    public double totalTax() {
        double total_cost = this.totalCost();
        //round the total tax amount to the closet int
        return Math.round(total_cost * taxRate * 100.0) / 100.0;
    }

    /**
     * Override toString
     */
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
