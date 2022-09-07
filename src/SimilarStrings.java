import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimilarStrings {

    /*
    Two strings are said to be similar if they are composed of the same characters. For example: "abaca" and "cba" are similar since both of them are composed of characters a b c. However "abaca" and "bcd" are not similar since they do not share all the same letters.
    Given an array of strings words of length n find the number of pairs of strings that are similar.
    Note:
        - Each string is composed of lowercase English characters only
        - Pairs are considered index wise i.e. two equal strings at different indices are counted as separated pairs
        - A pair at indices (i,j) is the same as the pair at (j,i)
    Example:
        Consider n = 3, words = ["xyz", "foo", "of"]
        Here the strings foo and of are similar because they are composed of the same characters ['o','f']. There are no other similar pairs so the answer is 1.
    Function description:
        countSimilarPairs has the following parameter:
        string words[n] an array of n strings
    Returns:
        long_int: the number of similar pairs
    Constraints:
        1 <= n <= 10^5
        The sum of the lengths of all strings does not exceed 10^6
     */


    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("xyz", "foo", "of", "yx", "bob", "ob"));
        System.out.println(countSimilarPairs(words));

    }


    public static long countSimilarPairs(List<String> words) {

        if (words.size() < 1 && words.size() > Math.pow(10, 5)) {
            return 0;
        }

        int totalLength = 0;
        for (String each : words) {
            totalLength += each.length();
        }
        if (totalLength > Math.pow(10, 6)) {
            return 0;
        }

        int countPairs = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("0")) {
                continue;
            }
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).equals("0")) {
                    continue;
                }
                int count = 0;
                for (int k = 0; k < words.get(j).length(); k++) {
                    if (!words.get(i).equals("0") && !words.get(j).equals("0") && words.get(i).contains("" + words.get(j).charAt(k))) {
                        count++;
                    }
                }
                if (count == words.get(j).length()) {
                    countPairs++;
                    words.set(i, "0");
                    words.set(j, "0");
                    continue;
                }
                System.out.println(words);
            }

        }
        return countPairs;
    }
}