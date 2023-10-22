package lectur3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList list = new ArrayList();
        // list.add(2890);
        // list.add("Hello");

        // for (Object o : list) {
        //     System.out.println(o);
        // }

        // int day = 29;
        // int month = 9;
        // int year = 1990;
        // Integer[] date = { day, month, year };
        // List<Integer> d = Arrays.asList(date);
        // System.out.println(d);

        // StringBuilder day = new StringBuilder("28");
        // StringBuilder month = new StringBuilder("9");
        // StringBuilder year = new StringBuilder("1990");
        // StringBuilder[] date = new StringBuilder[]{ day, month, year};
        // List<StringBuilder> d = Arrays.asList(date);
        // System.out.println(d);
        // date[1] = new StringBuilder("09");
        // System.out.println(d);

        // Character value = null;
        // // List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        // List<Character> list1 = new ArrayList<Character>();
        // list1.add('S');
        // list1.add('e');
        // list1.add('r');
        // list1.add('g');
        // list1.add('e');
        // list1.add('y');
        // System.out.println(list1);
        // list1.remove(1);
        // List<Character> list2 = List.copyOf(list1);
        // System.out.println(list2);

        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());
            // col.next();
            // col.remove();
        }
    }
}
