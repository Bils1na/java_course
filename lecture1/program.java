// public class program {
//     static public void main(String[] args) {

//     }
// }

package lecture1;
import java.util.Scanner;
/**
 * program
 */


public class program {
    static int t = 123;
    public static void main(String[] args) {
        // String s = "2";

        // short age = 10;
        // int salary = 123456;

        // float e = 2.7f;
        // double pi = 3.1415d;

        // char ch = '1';

        // int a = 13;
        // double d = a;

        // boolean flag1 = 123 <= 234;

        // System.out.println(flag1);

        // boolean flag2 = 123 >= 234 || flag1;

        // System.out.println(flag2);

        // boolean flag3 = flag1 ^ flag2;

        // System.out.println(flag3);


        // String msg = "Hello, World!";

        // System.out.println(msg);

        // System.out.println(d);
        // System.out.println(s); // this is comment
        // System.out.println(age);
        // System.out.println(salary);
        // System.out.println(e);
        // System.out.println(pi);
        // System.out.println(ch);
        // ch = 'a';
        // System.out.println(ch);


        // var i = 123;

        // System.out.println(i);
        
        // var dou = 123.456;

        // System.out.println(dou);
        // System.out.println(getType(i));
        // System.out.println(getType(dou));

        // int digit = 123_123;

        // System.out.println(Integer.MIN_VALUE);

        // String strng = "qwer";
        // System.out.println(strng.charAt(1));

        // int dig = 123;
        // dig++;
        // System.out.println(dig++);
        // System.out.println(++dig);

        // dig = --dig-dig--;
        // System.out.println(dig);

        // boolean f = 123 != 234;
        // System.out.println(f);

        // int t = 18;
        // int g = 2;
        // // 10010
        // // a = a << 1;
        // System.out.println(t >> 1);
        // // 1001

        // t = 5;
        // System.out.println(t | g);
        // // 101
        // // 010
        // // 111

        // System.out.println(t & g);
        // // 101
        // // 010
        // // 000

        // System.out.println(t ^ g);
        // // 101
        // // 010
        // // 111

        // boolean a = true;
        // boolean b = true;

        // System.out.println(a & b);
        // // 1
        // // 0
        // // 0

        // System.out.println(a && b);

        // String s = "qww1"; // 5, 0..4
        // // boolean b = s.length() >= 5 || s.charAt(4) == '1';
        // boolean b = s.length() >= 5 | s.charAt(4) == '1';

        // System.out.println(b);

        // int[] arr = new int[10];
        // System.out.println(arr.length);

        // arr = new int[] {1, 2, 3, 4, 5};
        // System.out.println(arr.length);

        // int[]arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);
        // int[] arr;
        // int brr[];
        
        // arr. 
        // int[] arr[] = new int[3][5];
        
        // for (int[] line : arr) {
        //     for (int item : line) {
        //         System.out.printf("%d", item);
        //     }
        //     System.out.println();
        // }
        // int[][] arr = new int[3][5];
        // for (int i = 0; i < arr.length; i++){
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("%d ", arr[i][j]);
        //     }
        //     System.out.println();
        // }

        // int i = 123; double d = i;
        // System.out.println(i);
        // System.out.println(d);

        // d = 3.1415; i = (int)d;
        // System.out.println(d);
        // System.out.println(i);

        // d = 3.9415; i = (int)d;
        // System.out.println(d);
        // System.out.println(i);

        // byte b = Byte.parseByte("123");
        // System.out.println(b);

        // b = Byte.parseByte("1234");
        // System.out.println(b);

        // byte b = Byte.parseByte("1211");
        // System.out.println(b);

        // int[] a = new int[10];
        // double[] d = a;

    //     Scanner iScanner = new Scanner(System.in);
    // // //    System.out.printf("name: ");
    // // //    String name = iScanner.nextLine();
    // // //    System.out.printf("Hello, %s!", name);
    // // //    iScanner.close();
    // //     System.out.printf("int a: ");
    // //     int x = iScanner.nextInt();
    // //     System.out.printf("double a: ");
    // //     double y = iScanner.nextDouble();
    // //     System.out.printf("%d + %f = %f", x, y, x + y);
    // //     iScanner.close();
    //     System.out.printf("int a: ");
    //     boolean flag = iScanner.hasNextInt();
    //     System.out.println(flag);
    //     int i = iScanner.nextInt();
    //     System.out.println(i);
    //     iScanner.close();

            // int a = 1, b = 2;
            // int c = a + b;
            // String res = a + " + " + b + " = " + c;
            // System.out.println(res);

        // String s = "qwe";
        // int a = 123;
        // String q = s + a;

        // System.out.println(q);

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi);
        // System.out.printf("%.2f\n", pi);
        // System.out.printf("%.3f\n", pi);
        // System.out.printf("%e\n", pi);
        // System.out.printf("%.2e\n", pi);
        // System.out.printf("%.3e\n", pi);

        
        // int b = 111;
        // {
        //     int a = 222;
        //     System.out.println(a+b);
        // }

        // int a = 132;
        // System.out.println(a);

        lib.sayHi();

    }

    // static void sayHi() {
    //     System.out.println("hi");
    // }
    // static String getType(Object o) {
    //     return o.getClass().getSimpleName();
    // }
    
}

