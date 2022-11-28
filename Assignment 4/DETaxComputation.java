public class DETaxComputation extends TaxComputationMethod {

    private String state_code = "DE";

    public boolean taxHoliday(ReceiptDate date) {
        return false;
    }

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        if (taxHoliday(date)) {
            return 0.0;
        }
        return items.getTotalCost();
    }

    public String getStateCode() {
        return state_code;
    }
}
