public class MDTaxComputation extends TaxComputationMethod {
    private String state_code = "MD";

    public boolean taxHoliday(ReceiptDate date) {
        return false;
    }

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        if (taxHoliday(date)) {
            return 0.0;
        }
        return (items.getTotalCost() + items.getTotalCost() * 0.06);
    }

    public String getStateCode() {
        return state_code;
    }
}
