import java.util.Arrays;

public class MajorityElement {

    /*
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.
    Example 1:
        Input: nums = [3,2,3]
        Output: 3
    Example 2:
        Input: nums = [2,2,1,1,1,2,2]
        Output: 2
    Constraints:
        n == nums.length
        1 <= n <= 5 * 10^4
        -10^9 <= nums[i] <= 10^9
    Follow-up: Could you solve the problem in linear time and in O(1) space?
     */


    // OPTION 1 - 2224 ms, faster than 5.02% & 56.4 MB, less than 35.08%
    public int majorityElement1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }


    // OPTION 2 - 2 ms, faster than 89.71% & 45.8 MB, less than 94.96%
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    // OPTION 3 - 8 ms, faster than 39.54% & 55.9 MB, less than 56.58%
    public int majorityElement3(int[] nums) {
        int answer = nums[0], count = 1;
        for (int eachNum : nums) {
            if (eachNum == answer) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    answer = eachNum;
                    count = 1;
                }
            }
        }
        return answer;
    }
}