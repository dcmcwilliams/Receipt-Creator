import java.util.*;
import java.io.*;

public class ReceiptFactory {

    private StoreHeader store_header;
    private TaxComputationMethod[] taxComputationsObjs;
    private AddOn[] addOns;
    private TaxComputationMethod tc;

    public ReceiptFactory() throws FileNotFoundException {
        TaxComputationMethod MD, MA, DE;
        AddOn rebate, coupon, holiday;
        String inFile = "config.txt";
        String[] info = new String[5];
        int count = 0;

        Scanner reader = new Scanner(new File(inFile));
        while (reader.hasNextLine()) {
            info[count] = reader.nextLine();
            count++;
        }
        reader.close();
        store_header = new StoreHeader(info[0], info[1], info[2], info[3], info[4]);
        taxComputationsObjs = new TaxComputationMethod[] {
                MD = new MDTaxComputation(),
                MA = new MATaxComputation(),
                DE = new DETaxComputation()
        };

        addOns = new AddOn[] {
                rebate = new Rebate1406(),
                coupon = new Coupon100Get10Percent(),
                holiday = new HolidayGreeting()
        };

        for (int i = 0; i < taxComputationsObjs.length; i++) {
            if (store_header.getStateCode().equals(taxComputationsObjs[i].getStateCode())) {
                tc = taxComputationsObjs[i];
            }
        }
    }

    public Receipt getReceipt(PurchasedItems items, ReceiptDate date) {
        Receipt receipt = new BasicReceipt(items, date);
        ((BasicReceipt) receipt).setDate(date);
        ((BasicReceipt) receipt).setStoreHeader(store_header);
        ((BasicReceipt) receipt).setTaxComputationMethod(tc);
        Decorator pre, post;

        for (AddOn a : addOns) {
            if (a.applies(items)) {
                if (a instanceof SecondaryHeading) {
                    receipt = new PreDecorator(a, receipt);
                }
                if (a instanceof Rebate || a instanceof Coupon) {
                    receipt = new PostDecorator(a, receipt);
                }
            }
        }
        return receipt;
    }

}
