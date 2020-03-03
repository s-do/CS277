public class Product {
    private String name;
    private double cost;
    private int quantity;

    public Product(){
        name = "product";
        cost = 0;
        quantity = 0;
    }

    public Product(String pName, double price, int userQuantity){
        name = pName;
        cost = price;
        quantity = userQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void removeQuantity(){
        quantity --;
    }
    public String toString() {
        return name + " @" + cost;
    }
}
