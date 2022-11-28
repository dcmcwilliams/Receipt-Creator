public class BasicReceipt implements Receipt {
    private StoreHeader store_header;
    private PurchasedItems items;
    private TaxComputationMethod tc;
    private ReceiptDate date;

    public BasicReceipt(PurchasedItems items, ReceiptDate date) {
        this.items = items;
        this.date = date;
    }

    public void setStoreHeader(StoreHeader h) {
        this.store_header = h;
    }

    public void setTaxComputationMethod(TaxComputationMethod tc) {
        this.tc = tc;
    }

    public void setDate(ReceiptDate date) {
        this.date = date;
    }

    public void prtReceipt() {
        System.out.println(this.store_header);
        System.out.println("Receipt for " + this.date.getDate() + ":");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(
                    items.get(i).getCode() + " " + items.get(i).getDescription() + ": $" + items.get(i).getPrice());
        }
        System.out.println("\nSubtotal: $" + items.getTotalCost());
        double total = tc.computeTax(items, date);
        System.out.printf("Total with tax: $" + "%.2f", total);
    }
}
