package other;

// import java.util.Arrays;

public class cwtask5 {
    public static void main(String[] args) {
       System.out.println(check(new Object[]{1, 2, 3}, 3));
       System.out.println(check(new Object[]{"kat", "lol", "morg"}, "hello")); 
    }
    
    public static boolean check(Object[] a, Object x) {
        boolean result = false;
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == x) 
            {
              result = true;  
            } 
        }
        return result;
    }


    // public static boolean check(Object[] a, Object x) { (lib: java.util.Arrays)
    //     return Arrays.asList(a).contains(x);
    // }
}
