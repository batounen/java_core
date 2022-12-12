public class ValidPalindrome {

    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
    Example 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
    Example 2:
        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.
    Example 3:
        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.
    Constraints:
        1 <= s.length <= 2 * 105
        s consists only of printable ASCII characters.
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome1("race a car"));
        System.out.println(isPalindrome1("0P"));
    }

    // OPTION 1 - 9 ms, faster than 55.06% & 44.5 MB, less than 43.23%
    public static boolean isPalindrome1(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }


    // OPTION 2 - 1463 ms, faster than 5.00% & 371.6 MB, less than 12.96%
    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase();
        StringBuilder palindromeChecker = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                palindromeChecker.append(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i = palindromeChecker.length() - 1; i >= 0; i--) {
            str.append(palindromeChecker.charAt(i));
        }
        return palindromeChecker.toString().equals(str.toString());
    }


    // OPTION 3 - 6 ms, faster than 67.57% & 43.2 MB, less than 82.74%
    public boolean isPalindrome3(String s) {
        if (s != null) {
            s = s.toLowerCase();
        }
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            if (!Character.isLetterOrDigit(lc) || !Character.isLetterOrDigit(rc)) {
                if (Character.isLetterOrDigit(lc)) {
                    r--;
                } else {
                    l++;
                }
            } else {
                if (lc != rc) {
                    return false;
                } else {
                    l++;
                    r--;
                }
            }
        }
        return true;
    }


    // OPTION 4 - 752 ms & 424.3 MB
    public static boolean isPalindrome4(String s) {
        StringBuilder reverseS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                reverseS.append(s.charAt(i));
            }
        }
        int left = 0, right = reverseS.length() - 1;
        while (left < right) {
            if (("" + reverseS.charAt(left)).equalsIgnoreCase("" + reverseS.charAt(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }


    // OPTION 5 - 4 ms, faster than 90.28% & 43.8 MB, less than 60.53%
    public static boolean isPalindrome5(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (l < r && Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) {
                return false;
            }
        }
        return true;
    }

    // OPTION 6 - 33 ms, faster than 47% & 47.5 MB, less than 23%
    public static boolean isPalindrome6(String s) {
        // Convert string to lowercase and remove non-alphanumeric characters
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check if string is a palindrome
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;  // not a palindrome
            }
        }
        return true;  // is a palindrome
    }
}