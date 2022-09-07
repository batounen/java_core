public class LongestRepetitiveSubstring {

    /*
    Longest Repetitive Substring
    	Write a program if some substring K that can be repeated N > 1 times to produce the input string exactly as it appears.
    	Your program should return the longest substring K, and
    	if there is none it should be return "There is no repetitive substring"

    	For Example is  str ="abcababcababcab"  			    output should be abcab
    				    str ="abcdefabcdef"     			    output should be abcdef
    					str ="abcdefabcdefabcdefabcdef"         output should be abcdefabcdef
    					str ="abcdefxabcdef"				    output should be "There is no repetitive substring"
     */

    public static void main(String[] args) {

        String str = "abcababcababcab";

        for (int i = str.length() - 1; i >= 0; i--) {
            String longest = str.substring(0, i);

            if (str.replace(longest, "").length() == 0) {
                System.out.println(longest);
                break;
            }
            if (i == 0) {
                System.out.println("There is no repetitive substring");
            }
        }

    }
}