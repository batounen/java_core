import java.util.HashSet;

public class HappyNumber {

    /*
    Write an algorithm to determine if a number n is happy.
    A happy number is a number defined by the following process:
        Starting with any positive integer, replace the number by the sum of the squares of its digits.
        Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
        Those numbers for which this process ends in 1 are happy.
    Return true if n is a happy number, and false if not.
    Example 1:
        Input: n = 19
        Output: true
        Explanation:
        12 + 92 = 82
        82 + 22 = 68
        62 + 82 = 100
        12 + 02 + 02 = 1
    Example 2:
        Input: n = 2
        Output: false
    Constraints:
        1 <= n <= 2^31 - 1
     */


    // 1 ms, faster than 98.78% & 39.3 MB, less than 97.27%
    public static boolean isHappy1(int n) {

        if (n < 1 || n > Integer.MAX_VALUE) {
            return false;
        }

        HashSet<Integer> list = new HashSet<>();

        int total, digit;
        while (list.add(n)) {                   // when change while loop condition to n != 0 -> Time Limit Exceeded
            total = 0;
            while (n > 0) {
                digit = n % 10;
                total += digit * digit;
                n /= 10;
            }
            if (total == 1) {
                return true;
            } else {
                n = total;
            }
        }
        return false;
    }

    // Time Limit Exceeded
    public static boolean isHappy2(int n) {

        if (n < 1 || n > Integer.MAX_VALUE) {
            return false;
        }

        int total = 0;
        String num = String.valueOf(n);

        while (total != 1) {
            total = 0;
            for (int i = 0; i < num.length(); i++) {
                total += Math.pow(Integer.parseInt("" + num.charAt(i)), 2);
            }
            num = String.valueOf(total);
            if (total == 1) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isHappy2(19));
        System.out.println(isHappy1(19));
    }
}