import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> itemList;

    public VendingMachine() {
        itemList = new ArrayList<Product>();
    }

    public void addItem(Product item) {
        itemList.add(item);
    }

/*    public Product removeItem(Product item) {
        return itemList.remove(item);
    }*/
}