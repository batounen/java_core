import java.util.Arrays;

public class SingleNumber {

    /*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
    Example 1:
        Input: nums = [2,2,1]
        Output: 1
    Example 2:
        Input: nums = [4,1,2,1,2]
        Output: 4
    Example 3:
        Input: nums = [1]
        Output: 1
    Constraints:
        1 <= nums.length <= 3 * 10^4
        -3 * 10^4 <= nums[i] <= 3 * 10^4
    Each element in the array appears twice except for one element which appears only once.
     */


    // 550 ms, faster than 5.48% & 42.2 MB, less than 95.47%
    public int singleNumber1(int[] nums) {
        for (int num1 : nums) {
            int count = 0;
            for (int num2 : nums) {
                if (num1 == num2) {
                    count++;
                }
            }
            if (count == 1) {
                return num1;
            }
        }
        return -1;
    }


    // 6 ms, faster than 42.90% & 42.1 MB, less than 98.68%
    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while (i < n - 1) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i += 2;
        }
        return nums[n - 1];
    }

    // 6 ms, faster than 62.73% & 42.2 MB, less than 92.34%
    public int singleNumber3(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length - 1; i += 2) {
            if (i == nums.length - 1) {
                return nums[i];
            }
            if(nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
