public class MATaxComputation extends TaxComputationMethod {
    private String state_code = "MA";

    public boolean taxHoliday(ReceiptDate date) {
        return (date.getMonth() == "08" && (date.getDay() == "13" || date.getMonth() == "08" && date.getDay() == "14"));
    }

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        if (taxHoliday(date)) {
            return (items.getTotalCost());
        } else {
            return (items.getTotalCost() + items.getTotalCost() * 0.0625);
        }
    }

    public String getStateCode() {
        return state_code;
    }
}