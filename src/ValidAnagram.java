import java.util.Arrays;

public class ValidAnagram {

    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true
    Example 2:
        Input: s = "rat", t = "car"
        Output: false
    Constraints:
        1 <= s.length, t.length <= 5 * 10^4
        s and t consist of lowercase English letters.
    Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
     */


    // 3 ms, faster than 95.09% & 42.7 MB, less than 90.21%
    public static boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}