public class PostDecorator extends Decorator {

    private AddOn a;

    public PostDecorator(AddOn a, Receipt r) {
        super(r, a);
        this.a = a;
    }

    public void prtReceipt() {
        callTrailer();
        System.out.println(a.getLines());
    }
}
