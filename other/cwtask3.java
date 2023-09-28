package other;
import java.util.*;

public class cwtask3 {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 10, 2, 5, 23, 11};
        System.out.println(sum(nums));
    }

	public static int sum(int[] numbers) {
		int max = Arrays.stream(numbers).max().getAsInt();
		int min = Arrays.stream(numbers).min().getAsInt();
		int sum = 0;
		
		for (int item: numbers) {
            sum += item == max || item == min ? 0 : item; 
        }

        return sum;
	}
}
