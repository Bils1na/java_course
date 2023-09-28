package other;

public class cwtask2 {
    public static void main (String[] args ) {
        for (int i = 1; i < 11; i++) {
            int price = saleHotdogs(i);
            System.out.println(price);
        }
        
    }

    public static int saleHotdogs(final int n){
        return n < 5 ? 100 * n : n >= 5 && n < 10 ? 95 * n : 90 * n;
  }
}
