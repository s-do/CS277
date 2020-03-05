/* Name: Selina Do and Long Nguyen
   Date: 03/04/20Purpose: Makes product objects with a cost and quantity
   Inputs: None but in the tester name, cost, and quantity will be asked
        when creating an object of this class
   Outputs: None*/
public class Product {
    /* name of the product object */
    private String name;
    /* price of the product */
    private double cost;
    /* amount of each product */
    private int quantity;

    /**
     * Null constructor for the Product class
     */
    public Product(){
        name = "product";
        cost = 0;
        quantity = 0;
    }

    /**
     * Initializes product data to the user input in the tester
     * @param pName name of the product object
     * @param price price of the product object
     * @param userQuantity amount of each object
     */
    public Product(String pName, double price, int userQuantity){
        name = pName;
        cost = price;
        quantity = userQuantity;
    }

    /**
     * Returns the name of the product
     * @return name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Changes the name variable of the object
     * @param name new name of product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the cost of the object
     * @return cost of the object
     */
    public double getCost() {
        return cost;
    }

    /**
     * Changes the cost variable of the object
     * @param cost new cost of the object
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Returns the quantity of the object
     * @return quantity of the object
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Changes the quantity variable of th object
     * @param quantity new quantity of the object
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Subtracts from the quantity value by 1
     */
    public void removeQuantity(){
        quantity --;
    }

    /**
     * String representation of the product class
     * @return attributes of the product class as a string
     */
    public String toString() {
        return name + " @" + cost;
    }
}
