public class StoreHeader {
    private String street_addr;
    private String state_code;
    private String zip_code;
    private String store_num;
    private String phone_num;

    public StoreHeader(String street_addr, String state_code, String zip_code, String store_num, String phone_num) {
        this.street_addr = street_addr;
        this.state_code = state_code;
        this.zip_code = zip_code;
        this.store_num = store_num;
        this.phone_num = phone_num;
    }

    public String getStateCode() {
        return state_code;
    }

    public String getStoreNum() {
        return store_num;
    }

    public String toString() {
        return (street_addr + " " + state_code + " " + zip_code + "\n" + "Store Number: "
                + store_num + "\n" + phone_num + "\n");
    }

}
