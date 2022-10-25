import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.
     */

    public static void main(String[] args) {
        System.out.println("romanToInt(\"MMCML\") = " + romanToInt("MMCML"));
    }


    // OPTION 1 - Mapping - 9 ms & 46.7 MB memory
    private static int romanToInt(String s) {

        Map<Character, Integer> myMap = new HashMap<>();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && myMap.get(s.charAt(i)) > myMap.get(s.charAt(i - 1))) {
                result += myMap.get(s.charAt(i)) - 2 * myMap.get(s.charAt(i - 1));      // if the char at i value is more than i-1 the addition was wrong so take out twice to minus that number
            } else {
                result += myMap.get(s.charAt(i));
            }
        }
        return result;
    }
}