import java.util.ArrayList;

public class PurchasedItems {

    private ArrayList<StoreItem> items;

    public PurchasedItems() {
        items = new ArrayList<StoreItem>();
    }

    public void addItem(StoreItem item) {
        items.add(item);

    }

    public double getTotalCost() {
        double cost = 0;
        for (int i = 0; i < items.size(); i++) {
            cost = cost + items.get(i).getPrice();
        }
        return cost;
    }

    public boolean containsItem(String itemCode) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getCode().equals(itemCode))
                return true;
        }
        return false;
    }

    public int size() {
        return items.size();
    }

    public StoreItem get(int i) {
        return items.get(i);
    }
}
