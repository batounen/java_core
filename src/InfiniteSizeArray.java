public class InfiniteSizeArray {

    /*
    Amazon IQ - Medium level
    Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
    Source: Amazon Interview Experience.
    Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don't know size of array.
    If the array is infinite, that means we don't have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
    Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
    -> if it is greater than high index element then copy high index in low index and double the high index.
    -> if it is smaller, then apply binary search on high and low indices found.
     */


    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(searchTarget(arr, target));
    }


    public static int searchTarget(int[] nums, int target) {
        // start with the box of size 2 then keep doubling
        int start = 0, end = 1;
        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;          // end = previous end + sizeOfBox * 2
            start = temp;
        }
        return binarySearch(nums, target, start, end);
    }


    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}