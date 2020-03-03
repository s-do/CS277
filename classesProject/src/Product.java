public class Product {
    private String name;
    private double cost;

    public Product(){
        name = "product";
        cost = 0;
    }

    public Product(String pName, double price){
        name = pName;
        cost = price;
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

    public String toString() {
        return name + " @" + cost;
    }
}
