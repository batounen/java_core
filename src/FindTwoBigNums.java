import java.util.Arrays;

public class FindTwoBigNums {

    // Find 2 biggest abs numbers from given array and return the sum

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1, 2, 5, -8, 10}));
    }

    private static int twoSum(int[] arr) {
        int sum = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Math.abs(arr[i]);
        }
        Arrays.sort(newArr);
        newArr = Arrays.stream(newArr).distinct().toArray();
        return newArr[newArr.length - 2] + newArr[newArr.length - 1];
    }

}