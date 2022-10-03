public class Array_LargestSumContiguousSubarray {

    /*
    Largest Sum Contiguous Subarray
    Write a program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.
     */

    public static int largestSum(int[] arr) {
        int length = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] > max) {
                    max = arr[i] + arr[j];
                    length = j - i + 1;
                }
            }
        }
        return length;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(largestSum(nums));
    }
}