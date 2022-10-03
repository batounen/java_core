public class Array_Reverse {

    // Write a function that can reverse an array

    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        return reversed;
    }
}