package other;

public class cwtask9 {
    public static void main(String[] args) {
        String[] strings = new String[]{"3 years old", "1 year old", "9 years old"};
        for (String string : strings) {
            System.out.println(howOld(string));
        }

    }

    public static int howOld(final String herOld) {
        for (int i = 0; i < herOld.length(); i++) {
          return herOld.charAt(i) >= '0' && herOld.charAt(i) <= '9' ? 
          Character.getNumericValue(herOld.charAt(i)) : -1;
        }
        return -1;
      }
}
