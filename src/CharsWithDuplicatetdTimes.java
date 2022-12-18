import java.util.Arrays;
import java.util.Collections;

public class CharsWithDuplicatetdTimes {

    // String approach
    public static String countDuplicate1(String s) {
        StringBuilder output = new StringBuilder();
        int count;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (!output.toString().contains("" + s.charAt(i))) {
                output.append(s.charAt(i));
                output.append(count);
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(countDuplicate1("aaabbtttpppp"));                 // a3b2t3p4}
    }

}