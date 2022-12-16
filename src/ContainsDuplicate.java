import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    Example 1:
        Input: nums = [1,2,3,1]
        Output: true
    Example 2:
        Input: nums = [1,2,3,4]
        Output: false
    Example 3:
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
    Constraints:
        1 <= nums.length <= 105
        -10^9 <= nums[i] <= 10^9
     */


    // 23 ms, faster than 28.50% & 69 MB, less than 60.77%
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


    // 6 ms, faster than 97.37% & 54.7 MB, less than 93.10% (some runs were 10-27 ms)
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for (int each : nums) {
            if (list.contains(each)) {
                return true;
            } else {
                list.add(each);
            }
        }
        return false;
    }

    // 8 ms, faster than 87% & 54.8 MB, less than 89%
    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        return numSet.size() < nums.length;
    }
}