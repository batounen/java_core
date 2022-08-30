import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */


    // OPTION 1 - 56 ms & 45.5 MB memory
    private int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }


    // OPTION 2 - 37 ms & 44.6 MB memory
    private int[] sumTwo(int[] nums, int target) {

        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int minus = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == minus) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }


    // OPTION 3 - MAP - 3 ms 45.9 MB memory
    public int[] sumOfTwo(int[] nums, int target) {

        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (myMap.containsKey(remainder)) {
                return new int[]{myMap.get(remainder), i};
            }
            myMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}