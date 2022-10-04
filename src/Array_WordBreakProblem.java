import java.util.ArrayList;
import java.util.List;

public class Array_WordBreakProblem {

    /*
    Word Break Problem
    Given an input string and a dictionary of words, find out if the input string can be segmented
    into a space-separated sequence of dictionary words. See following examples for more details.
    This is a famous Google interview question, also being asked by many other companies nowadays.
    Consider the following dictionary
        {i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
        Input:  ilike
        Output: Yes
        The string can be segmented as "i like".
        Input:  ilikesamsung
        Output: Yes
        The string can be segmented as "i like samsung" or "i like sam sung".
     */

    public static List<String> wordBreak1(String[] dictionary, String str) {
        List<String> output = new ArrayList<>();
        for (int i = 1; i < dictionary.length; i++) {
            if (str.contains(dictionary[i])) {
                str = str.replace(dictionary[i], "");
                output.add(dictionary[i]);
            }
            if (str.length() == 1 && str.charAt(0) == 'i') {
                output.add(0, "i");
                break;
            }
        }
        return output;
    }


    public static String wordBreak2(String[] dictionary, String str) {
        for (int i = 1; i < dictionary.length; i++) {
            if (str.contains(dictionary[i])) {
                str = str.replace(dictionary[i], "");
            }
            if (str.length() == 1 && str.charAt(0) == 'i') {
                return "Yes";
            }
        }
        return "No";
    }


    public static void main(String[] args) {
        System.out.println(wordBreak1(new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"}, "ilikesamsung"));
        System.out.println(wordBreak2(new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"}, "ilikesamsung"));
    }
}