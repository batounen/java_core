public class LongestCommonPrefix {

    /*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
        Example 1:
            Input: strs = ["flower","flow","flight"]
            Output: "fl"

        Example 2:
            Input: strs = ["dog","racecar","car"]
            Output: ""
            Explanation: There is no common prefix among the input strings.
     */

    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        System.out.println("longestCommonPrefix = " + longestCommonPrefix(s));

        System.out.println("longestPrefix = " + longestPrefix(s));
    }


    // OPTION 1 - 6 ms, faster than 26.66% & 41.9 MB, less than 72.51%
    private static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        } else {
            String prefix = "";
            for (int i = 1; i <= strs[0].length(); i++) {
                prefix = strs[0].substring(0, i);
                int count = 0;
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].startsWith(prefix)) {
                        count++;
                    }
                }
                if (count != strs.length - 1) {
                    prefix = strs[0].substring(0, i - 1);
                    break;
                }
            }
            return prefix;
        }
    }


    // OPTION 2 - Faster runtime
    public static String longestPrefix(String[] strs) {

        int ind = 0;
        while (ind < strs[0].length()) {
            char c = strs[0].charAt(ind);
            int i = 0;
            while (i < strs.length && strs[i].length() > ind && strs[i].charAt(ind) == c) {
                i++;
                continue;
            }
            if (i == strs.length) {
                ind++;
            } else {
                break;
            }
        }
        return strs[0].substring(0, ind);
    }
}