public class StoreItem {

    private String itemCode;
    private String itemDescription;
    private double itemPrice;

    public StoreItem(String code, String description, double price) {
        this.itemCode = code;
        this.itemDescription = description;
        this.itemPrice = price;
    }

    public String getCode() {
        return itemCode;
    }

    public String getDescription() {
        return itemDescription;
    }

    public double getPrice() {
        return itemPrice;
    }

    public void setCode(String code) {
        itemCode = code;
    }

    public void setDescription(String description) {
        itemDescription = description;
    }

    public void setPrice(double price) {
        itemPrice = price;
    }

}
