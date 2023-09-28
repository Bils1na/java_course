package other;

public class cwtask6 {
    public static void main(String[] args) {
        Boolean[] arr = new Boolean[]{true, true, false, true, false, true};
        System.out.println(countSheeps(arr));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) return 0;
        int sum = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++)
        {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i])
            {
              sum++;
            }
        }
        return sum;
    }
}
