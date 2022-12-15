import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        missingNums(new int[]{9, 6, 4, 5, 7, 0, 1, 20});
    }

    public static void missingNums(int[] arr) {
        Arrays.sort(arr);
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != 1) {
                temp = arr[i + 1] - arr[i];
                for (int j = 1; j < temp; j++) {
                    System.out.println("Missing number : " + (arr[i] + j));
                }
            }
        }
    }
}