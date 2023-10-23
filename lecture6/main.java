package lecture6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        // set.add(1);
        // System.out.println(set.contains(1));
        // set.add(null);
        // System.out.println(set);
        // for (var integer : set) {
        //     System.out.println(integer);
        // }
        // set.clear();
        // System.out.println(set);

        // var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        // var u = new HashSet<Integer>(a); u.addAll(b);
        // var r = new HashSet<Integer>(a); r.retainAll(b);
        // var s = new HashSet<Integer>(a); s.removeAll(b);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(u);
        // System.out.println(r);
        // System.out.println(s);
        // boolean res = a.addAll(b);

        Worker w1 = new Worker();
        w1.firstName = "Name_1";
        w1.lastNname = "LastName_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Name_1";
        w4.lastNname = "LastName_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Name_2";
        w2.lastNname = "LastName_2";
        w2.salary = 200;
        w2.id = 2000;

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));

    }
}
