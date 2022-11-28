public class ReceiptDate {

    private String day;
    private String month;
    private String year;
    private String date;

    public ReceiptDate(String d, String m, String y) {
        day = d;
        month = m;
        year = y;
    }

    public ReceiptDate() {

    }

    public void setDay(String d) {
        day = d;
    }

    public String getDay() {
        return day;
    }

    public void setMonth(String m) {
        month = m;
    }

    public String getMonth() {
        return month;
    }

    public void setYear(String y) {
        year = y;
    }

    public String getYear() {
        return year;
    }

    public void setDate() {
        date = this.month + "/" + this.day + "/" + this.year;
    }

    public String getDate() {
        return date;
    }
}
