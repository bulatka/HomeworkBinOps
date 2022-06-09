public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String res1 = bins.mult("10101010101000", "101111");
        String res2 = bins.sum("10101010101000", "101111");
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(bins.sum(res1, res2));
        System.out.println(bins.mult(res1, res2));
    }
}