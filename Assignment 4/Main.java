import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner console = new Scanner(System.in);
        String date;

        System.out.println("What is today's date? (MM/DD/YYYY)");
        date = console.nextLine();

        String day = date.substring(3, 5);
        String month = date.substring(0, 2);
        String year = date.substring(6, 9) + date.substring(9);

        ReceiptDate d = new ReceiptDate();
        d.setDay(day);
        d.setMonth(month);
        d.setYear(year);
        d.setDate();

        PurchasedItems items = new PurchasedItems();
        System.out.println("Would you like to browse available items at BestBuy? Yes(1)/No(0)");
        int response = console.nextInt();
        while (response == 1) {
            int choice = optionList(console);

            if (choice == 1) {
                items.addItem(new StoreItem("1406", "Samsung Smart TV", 849.99));
            }
            if (choice == 2) {
                items.addItem(new StoreItem("1407", "Nintendo Switch Console", 349.99));
            }

            if (choice == 3) {
                items.addItem(new StoreItem("1408", "MacBook Air Laptop", 1049.00));
            }

            if (choice == 4) {
                items.addItem(new StoreItem("1409", "Amazon Kindle", 89.99));
            }

            if (choice == 5) {
                items.addItem(new StoreItem("1410", "HP Deskjet Wireless Printer", 79.99));
            }
            System.out.println("Press 1 to view menu and purchase another item.");
            System.out.println("Press 0 to checkout and view receipt.");
            response = console.nextInt();
        }
        System.out.println("Goodbye!\n");
        ReceiptFactory factory = new ReceiptFactory();
        Receipt receipt = factory.getReceipt(items, d);
        receipt.prtReceipt();
    }

    public static int optionList(Scanner console) {
        System.out.println("Press a number to purchase an item: ");
        System.out.println("1 - Samsung Smart TV: $849.99\n" + "2 - Nintendo Switch Console: $348.99\n"
                + "3 - MacBook Air Laptop: $1049.00\n" + "4 - Amazon Kindle: $89.99\n"
                + "5 - HP Deskjet Wireless Printer: $79.99\n");
        int choice = console.nextInt();
        while (choice < 1 || choice > 5) {
            System.out.println("Not valid option: ");
            System.out.println();
            choice = console.nextInt();
        }
        return choice;
    }
}
