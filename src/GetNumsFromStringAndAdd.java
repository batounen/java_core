import java.util.ArrayList;
import java.util.Arrays;

public class GetNumsFromStringAndAdd {
    public static void main(String[] args) {
        String str = "Thereare500mangoes on30 trees in 5 gardens";       // need output = 535 (500+30+5)

        // OPTION 1
        StringBuilder output = new StringBuilder();
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                output.append(str.charAt(i));
            } else if (output.length() != 0 && str.charAt(i) == ' ') {
                total += Integer.parseInt(output.toString());
                output.setLength(0);
            }
        }
        System.out.println("total = " + total);


        // OPTION 2 - Wrapper class
        StringBuilder result = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if ((Character.isDigit(currentChar))) {
                result.append(currentChar);
            } else if (result.length() != 0 && !Character.isDigit(currentChar)) {
                sum += Integer.parseInt(result.toString());
                result.setLength(0);
            }
        }
        System.out.println("sum = " + sum);         // sum = 535


        // OPTION 3 - ArrayList
        ArrayList<String> s = new ArrayList<>(Arrays.asList(str.split(" ")));
        int sumOfAll = 0;
        for (String each : s) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < each.length(); i++) {
                if (Character.isDigit(each.charAt(i))) {
                    res.append(each.charAt(i));
                }
            }
            if (res.length() != 0) {
                sumOfAll += Integer.parseInt(res.toString());
            }
        }
        System.out.println("sumOfAll = " + sumOfAll);
    }
}