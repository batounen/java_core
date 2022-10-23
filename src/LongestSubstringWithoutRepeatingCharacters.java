import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    /*
    Given a string s, find the length of the longest substring without repeating characters.
    Example 1:
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
    Example 2:
        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
    Example 3:
        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    Constraints:
        0 <= s.length <= 5 * 10^4
        s consists of English letters, digits, symbols and spaces.
     */

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("jbpnbwwd"));
    }

    // OPTION 1 - 674 ms, faster than 5.00% & 144.9 MB, less than 5.12%
    public static int lengthOfLongestSubstring1(String s) {
        StringBuilder output = new StringBuilder();
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!output.toString().contains("" + s.charAt(j))) {
                    output.append(s.charAt(j));
                } else {
                    break;
                }
            }
            if (output.length() > longest) {
                longest = output.length();
            }
            output.setLength(0);
        }
        return longest;
    }


    // OPTION 2 - 7 ms, faster than 86.31% & 42.4 MB, less than 93.34%
    public static int lengthOfLongestSubstring2(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }


    // OPTION 3 - 11 ms, faster than 69.13% & 46.1 MB, less than 32.25%
    public static int lengthOfLongestSubstring3(String s) {
        HashSet<Character> hash_set = new HashSet<>();
        int left = 0, right = 0, max = 0;
        while (right < s.length()) {
            if (!hash_set.contains(s.charAt(right))) {
                hash_set.add(s.charAt(right));
                right++;
                max = Math.max(hash_set.size(), max);
            } else {
                hash_set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}