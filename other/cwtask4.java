package other;

public class cwtask4 {
    public static void main(String[] args) 
    {
        int[] nums = new int[]{1, 2, 3, 4, -1, -2, -3, -4};
        int[] arr = new int[2];
        arr = countPositivesSumNegatives(nums);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) 
          {
            int[] result = new int[]{};
            return result;
          }
        int[] result = new int[]{0, 0};
      
        for (int item: input)
        {
            if (item > 0) 
            {
              result[0] += 1;  
            } else {
              result[1] += item;
            }
        }
        return result;
    }
}
