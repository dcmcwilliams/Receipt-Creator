public abstract class TaxComputationMethod {

    private String state_code;

    public abstract double computeTax(PurchasedItems items, ReceiptDate date);

    public abstract boolean taxHoliday(ReceiptDate date);

    public String getStateCode() {
        return state_code;
    }

}
