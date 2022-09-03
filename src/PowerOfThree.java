public class PowerOfThree {

    /*
    Given an integer n, return true if it is a power of three. Otherwise, return false.
    An integer n is a power of three, if there exists an integer x such that n == 3^x.
    Example 1:
        Input: n = 27
        Output: true
        Explanation: 27 = 3^3
    Example 2:
        Input: n = 0
        Output: false
        Explanation: There is no x where 3^x = 0.
    Example 3:
        Input: n = -1
        Output: false
        Explanation: There is no x where 3^x = (-1).
    Constraints:
        -2^31 <= n <= 2^31 - 1
    Follow up: Could you solve it without loops/recursion?
     */


    // 24 ms, faster than 45.13% & 42.2 MB, less than 90.43%
    public static boolean isPowerOfThree1(int n) {
        if (n <= 0) {
            return false;
        } else {
            int i = 0;
            while (Math.pow(3, i) <= n) {
                if (Math.pow(3, i) == n) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }


    // 18 - 37 ms & 44 - 48 MB
    public static boolean isPowerOfThree2(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        return n % 3 == 0 && isPowerOfThree2(n / 3);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree1(27));
    }
}