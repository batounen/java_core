import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondBiggestNumber {

    /*
    Second Biggest Number
    Given an Array of numbers. Find and print the 2nd biggest number.
    Note the 2nd biggest should be unique meaning it should be different from the max number
    Example:
        Input:
            [4,3,1,4,5,2,4,8,4,8]
        Output:
            5
     */

    public static void main(String[] args) {

        int[] nums = {4, 3, 1, 4, 5, 2, 4, 8, 4, 8};

        // OPTION 1
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[nums.length - 1]) {
                System.out.println("The second biggest number in the given array is " + nums[i]);
                break;
            }
        }


        // OPTION 2
        ArrayList<Integer> newNums = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int numCount = 0;
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    numCount++;
                }
            }
            if (numCount == 1) {
                newNums.add(nums[i]);
            }
        }
        System.out.println("Array of unique numbers before sort: " + newNums);
        Collections.sort(newNums);
        System.out.println("Array of unique numbers after sort: " + newNums);
        System.out.println("The second biggest number in the given array is " + (newNums.get(newNums.size() - 1)));
    }
}