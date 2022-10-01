import java.util.LinkedHashMap;
import java.util.Map;

public class AddUpToSum {

    /*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10
            Output: {8=2, 7=3}
     */

    public static Map<Integer, Integer> sumOfTwo(int[] arr, int target) {

        Map<Integer, Integer> sum = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num1 = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int num2 = arr[j];
                if ((num1 + num2) == target) {
                    sum.put(num1, num2);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfTwo(new int[]{1, 2, 3, 8, 7, 15, 3, 4, 6}, 10));            // {2=8, 3=7, 7=3, 4=6}
    }
}