public class Array_SumOfLeftEqualToRight {

    /*
    Given an array of integers, write a function to return the item in the array,
    where the sum of all items on its left is equal to the sum of the ones on the right.
    For example :
            Given [4, 9, 1, 3, 6, 4]
            your function should give item 1, because 4 + 9 = 3 + 6 + 4
     */

    public static void main(String[] args) {
        System.out.println(sumLeftRight1(new int[]{-1, 6, 4, 9, 1, 0, 6, 13}));
        System.out.println(sumLeftRight2(new int[]{-1, 6, 4, 9, 1, 0, 6, 13}));
    }

    public static int sumLeftRight1(int[] arr) {

        int mid = -1;
        for (int i = 1; i < arr.length; i++) {
            mid = arr[i];
            int left = 0, right = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j < i) {
                    left += arr[j];
                } else if (j > i) {
                    right += arr[j];
                }
            }
            if (left == right) {
                return mid;
            }
        }
        return mid;
    }

    public static int sumLeftRight2(int[] arr) {
        int left = 0, right = arr.length - 1, leftTotal = 0, rightTotal = 0;
        while (left < right) {
            leftTotal += arr[left++];
            rightTotal += arr[right--];
            if (leftTotal == rightTotal) {
                return arr[left + 1];
            }
        }
        return -1;
    }

}