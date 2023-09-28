package other;
import java.util.*;

public class cwtask3 {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 10, 2, 10};
        System.out.println(sum(nums));
    }

	public static int sum(int[] numbers) {
        int sum = 0; 
        if (numbers != null && numbers.length != 0) 
        {
          int max = Arrays.stream(numbers).max().getAsInt();
          int min = Arrays.stream(numbers).min().getAsInt();
          int count = 0;
        
          for (int item: numbers) 
          { 
            if (item == min || item == max && count != 2) 
            {
              count += 1;
            } else {
              sum += item;
            }
          }
        }
        return sum;
    }
}
