package other;

public class cwtask7 {

    public static void main(String[] args) {
        System.out.println(isLove(2, 3));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 && flower2 % 2 == 0) || (flower1 % 2 != 0 && flower2 % 2 != 0) ? false : true;
    }
}
