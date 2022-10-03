import java.util.Arrays;

public class Array_MergeTwoArrays {

    /*
    Write a return method that can concat two arrays
     */

    public static int[] arrayMerger(int[] arr1, int[] arr2) {
        int[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
        int len = arr1.length;
        for (int each : arr2) {
            result[len++] = each;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayMerger(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9})));
    }
}