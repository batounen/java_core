import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class String_smallest {

    /*
    Remove one letter from a word so that resulting string will be as small as possible (alphabetically).
    Write a function solution that, given a string S consisting of N characters,
    returns alphabetically the smallest string that can be obtained by removing exactly one letter from S.
    Examples:
        1. Given S = "acb", by removing one letter, you can obtain "ac", "ab" or "cb".
                Your function should return "ab" (after removing 'c') since it is alphabetically smaller than "ac" and "bc".
        2. Given S = "hot", your function should return "ho", which is alphabetically smaller than "ht" and "ot".
        3. Given S = "codility", your function should return "cdility", which can be obtained by removing the second letter.
        4. Given S = "aaaa", your function should return "aaa". Any occurrence of 'a' can be removed.
     */

    public static void main(String[] args) {
        System.out.println(smallestString("codility"));
        System.out.println(smallestString("aaaa"));
        System.out.println(smallestString("hot"));
        System.out.println(smallestString("acb"));
    }

    public static String smallestString(String s) {
        List<String> allPossibleStrings = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    temp += "" + arr[j];
                }
            }
            allPossibleStrings.add(temp);
        }
        Collections.sort(allPossibleStrings);
        return allPossibleStrings.get(0);
    }

}
