public abstract class Decorator implements Receipt {
    private Receipt trailer;

    public Decorator() {
    }

    public Decorator(Receipt r, AddOn a) {
        trailer = r;

    }

    protected void callTrailer() {
        if (trailer != null)
            trailer.prtReceipt();
    }

    public abstract void prtReceipt();

}
