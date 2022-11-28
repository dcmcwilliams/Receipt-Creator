public class Coupon100Get10Percent implements Coupon {
    public boolean applies(PurchasedItems items) {
        if (items.getTotalCost() > 100.00) {
            return true;
        }
        return false;
    }

    public String getLines() {
        return "Coupon has been accepted; 10% off on next purchase.";
    }

}
