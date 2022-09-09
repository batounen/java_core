public class FindNumbersWithEvenNumberOfDigits {

    /*
    Given an array nums of integers, return how many of them contain an even number of digits.
    Example 1:
        Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore, only 12 and 7896 contain an even number of digits.
    Example 2:
        Input: nums = [555,901,482,1771]
        Output: 1
        Explanation:
        Only 1771 contains an even number of digits.
    Constraints:
    1 <= nums.length <= 500
    1 <= nums[i] <= 10^5
     */


    // OPTION 1 - 1 ms, faster than 99.84% & 41.9 MB, less than 91.93%
    public int findNumbers1(int[] nums) {
        int count = 0;
        for (int each : nums) {
            if (Integer.toString(each).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    // OPTION 2 - 2 ms, faster than 65.65% & 44.1 MB, less than 18.54%
    public int findNumbers2(int[] nums) {
        int count = 0;
        for (int each : nums) {
            if ((int) (Math.log10(each) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}