public class ReverseInteger {

    /*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
     */

    public static void main(String[] args) {

        // 2 power of 31 is max of int
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);     // 2147483647
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);     // -2147483648
        System.out.println("reversed: " + reverse(1534236469));
        System.out.println("reversed: " + reverse(-321));

        // String with loop
        System.out.println("reverseInt(9011) = " + reverseInt(9011));

        // StringBuilder
        System.out.println("reverseInteger(5989) = " + reverseInteger(5989));

    }

    // OPTION 1 - 1-2 ms, 40-41 MB memory
    public static int reverse(int x) {
        int original = Math.abs(x), digit, reversed = 0;
        while (original > 0) {
            digit = original % 10;
            original /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && digit > 7) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && digit < -8) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        if (x < 0) {
            reversed *= -1;
        }
        return reversed;
    }


    // String with loop approach without int limitation
    private static int reverseInt(int x) {
        String s = Integer.toString(x);
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return Integer.parseInt(reversed.toString());
    }


    // StringBuilder method
    private static int reverseInteger(int x) {
        StringBuilder str = new StringBuilder(Integer.toString(x)).reverse();
        return Integer.parseInt(str.toString());
    }
}