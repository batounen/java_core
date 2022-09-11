import java.util.Arrays;

public class FindFirstAndLastPositionElementSortedArray {

    /*
    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.
    Example 1:
        Input: nums = [5,7,7,8,8,10], target = 8
        Output: [3,4]
    Example 2:
        Input: nums = [5,7,7,8,8,10], target = 6
        Output: [-1,-1]
    Example 3:
        Input: nums = [], target = 0
        Output: [-1,-1]
    Constraints:
        0 <= nums.length <= 10^5
        -10^9 <= nums[i] <= 10^9
        nums is a non-decreasing array.
        -10^9 <= target <= 10^9
     */


    // OPTION 1 - 0 - 1 ms, faster than 39.52% - 100.00% & 45.2 MB, less than 98.49%
    public static int[] searchRange1(int[] nums, int target) {

        int startIndex = -1, endIndex = -1;
        int[] result = {startIndex, endIndex};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                startIndex = i;
                result[0] = startIndex;
                break;
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                endIndex = j;
                result[1] = endIndex;
                break;
            }
        }
        return result;
    }


    // OPTION 2 - 2 ms, faster than 8.43% & 47.4 MB, less than 41.07%
    public static int[] searchRange2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] res = new int[]{-1, -1};
        while (left <= right) {
            if (nums[left] != target) {
                left++;
            } else {
                res[0] = left;
            }
            if (nums[right] != target) {
                right--;
            } else {
                res[1] = right;
            }
            if (res[0] != -1 && res[1] != -1) {
                break;
            }
        }
        return res;
    }


    // OPTION 3 - Binary Search concept - 1 ms, faster than 39.52% & 47.1 MB, less than 68.69%
    public static int[] searchRange3(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = search(nums, target, true);
        if (result[0] != -1) {
            result[1] = search(nums, target, false);
        }
        return result;
    }

    public static int search(int[] nums, int target, boolean findFirstIndex) {      // boolean is asking if we need to go left to check more occurrence or not.
        int start = 0, end = nums.length - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange2(nums, 8)));
        System.out.println(Arrays.toString(searchRange3(nums, 8)));

    }
}