public class LongestPalindrome {

    /*
    Longest Palindrome
	Given a String array. Find the longest Palindrome String in your array.
		Ex:
		    Input: ["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		    Output: racecar
		Ex:
		    Input: ["abc", "dna", "kevin", "joe", "lamp"]
		    Output: No palindrome
     */
    public static void main(String[] args) {

        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        int palindromeLength = 0, palindromeCount = 0;
        String longestPalindrome = "";

        for (String eachWord : words) {
            String backwards = "";
            for (int j = eachWord.length() - 1; j >= 0; j--) {
                backwards += eachWord.charAt(j);
            }
            if (eachWord.equals(backwards) && eachWord.length() > palindromeLength) {
                palindromeLength = eachWord.length();
                longestPalindrome = eachWord;
                palindromeCount++;
            }
        }
        if (palindromeCount == 0) {
            System.out.println("No Palindrome in the given String array");
        } else {
            System.out.println("longestPalindrome = " + longestPalindrome);
        }

    }
}