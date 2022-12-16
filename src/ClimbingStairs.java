import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {

    /*
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    Example 1:
        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
    Example 2:
        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step

        Constraints: 1 <= n <= 45
     */

    // 0 ms, faster than 100.00% & 41.5 MB, less than 8.04%
    public static int climbStairs1(int n) {
        int[] dp = new int[n + 1];
        if (n == 1) {
            return 1;
        }
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // 0 ms, faster than 100.00% & 38.8 MB, less than 97.85%
    public static int climbStairs2(int n) {
        if (n <= 3) {
            return n;
        }
        List<Integer> ways = new ArrayList<>();
        ways.add(1);
        ways.add(2);
        int i = 2;
        while (i < n) {
            ways.add(ways.get(i - 2) + ways.get(i - 1));
            i++;
        }
        return ways.get(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("climbStairs1 = " + climbStairs1(45));
        System.out.println("climbStairs2 = " + climbStairs1(45));
    }
}