import java.util.Arrays;

public class MissingNumber {

    /*
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
    Example 1:
        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
    Example 2:
        Input: nums = [0,1]
        Output: 2
        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
    Example 3:
        Input: nums = [9,6,4,2,3,5,7,0,1]
        Output: 8
        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
    Constraints:
        n == nums.length
        1 <= n <= 10^4
        0 <= nums[i] <= n
        All the numbers of nums are unique.
     */


    // 0 ms, faster than 100.00% & 42.6 MB, less than 99.33%
    public static int missingNumber1(int[] nums) {

        int total1 = 0, total2 = 0;
        for (int each : nums) {
            total1 += each;
        }
        for (int i = 0; i <= nums.length; i++) {            // or math formula -> n * (n + 1) / 2
            total2 += i;
        }
        return total2 - total1;
    }


    // 413 ms & 50.7 MB
    public static int missingNumber2(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == nums[j]) {
                    count++;
                }
            }
            if (count == 0) {
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        System.out.println(missingNumber2(new int[]{3, 0, 1}));
    }
}