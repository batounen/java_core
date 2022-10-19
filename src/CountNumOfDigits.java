public class CountNumOfDigits {

    /*
    Write a java program to count number of digits in a number
     */

    // String Way
    public static int numCounter1(int a) {
        return String.valueOf(a).length();
    }

    // Number way
    public static int numCounter2(int a) {
        int digit = 0;
        while (a > 0) {
            a /= 10;
            digit++;
        }
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(numCounter1(123098));
        System.out.println(numCounter2(12309));
    }

}