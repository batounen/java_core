import java.util.Arrays;

public class ReverseString {

    /*
    Write a function that reverses a string. The input string is given as an array of characters s.
    You must do this by modifying the input array in-place with O(1) extra memory.
        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]
     */


    // OPTION 1 - 1-2 ms, 58 MB memory
    // swap method created to reassign elements. Here used a temp variable to store temporarily one of the swapping elements
    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    public static void main(String[] args) {

        char[] input = {'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < input.length / 2; i++) {
            swap(input, i, input.length - 1 - i);
        }
        System.out.println("input.toString() = " + Arrays.toString(input));         // input.toString() = [o, l, l, e, h]


        // Faster runtime solution
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int left = 0, right = s.length - 1;

        char temp = ' ';

        while(left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));
    }
}