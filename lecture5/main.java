package lecture5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        // Integer a = 123;
        // System.out.println(a.hashCode());
        // System.out.println("z".hashCode());

        // Map<Integer, String> db = new HashMap<>();
        // db.putIfAbsent(1, "one");
        // db.put(2, "two");
        // db.put(null, "!null");

        // System.out.println(db);
        // System.out.println(db.get(44));

        // System.out.println(db);
        // System.out.println(db.containsValue("one"));

        // System.out.println(db.containsKey(1));
        // System.out.println(db.keySet());
        // System.out.println(db.values());

        // Map<Integer, String> db = new HashMap<>();
        // db.putIfAbsent(1, "one");
        // db.put(2, "two");
        // db.put(3, "three");
        // System.out.println(db);

        // for (var item : db.entrySet()) {
        //     System.out.printf("[%d: %s]", item.getKey(), item.getValue());
        // }

        // TreeMap<Integer, String> tMap = new TreeMap<>();
        // tMap.put(1, "one");
        // tMap.put(6, "six");
        // tMap.put(4, "four");
        // tMap.put(3, "three");
        // tMap.put(2, "two");
        // System.out.println(tMap);
        // System.out.println(tMap.descendingKeySet());
        // System.out.println(tMap.descendingMap());

        // Map<Integer, String> linkMap = new LinkedHashMap<>();
        // linkMap.put(11, "one one");
        // linkMap.put(1, "one");
        // linkMap.put(2, "two");
        // System.out.println(linkMap);

        // Map<Integer, String> map = new HashMap<>();
        // map.put(11, "one one");
        // map.put(2, "two");
        // map.put(1, "one");
        // System.out.println(map);

        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "two");
        table.put(11, "one one");
        table.put(2, "one");
        System.out.println(table);
        // table.put(null, "one"); -- java.lang.NullPointerException 
    }
}