package other;

public class cwtask8 {
    public static void main(String[] args) {
        int taskEight = liters(3.0);
        System.out.println(taskEight);
    }

    public static int liters(double time)  {
        return (int)Math.floor(time * 0.5);
  }
}