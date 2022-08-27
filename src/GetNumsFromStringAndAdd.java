import java.util.ArrayList;
import java.util.Arrays;

public class GetNumsFromStringAndAdd {

    public static void main(String[] args) {

        String str = "Thereare500mangoes on30 trees in 5 gardens";       // need output = 535 (500+30+5)

        // OPTION 1
        String output = "";
        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                output += str.charAt(i);
            } else if (!output.isEmpty() && str.charAt(i) == ' ') {
                total += Integer.parseInt(output);
                output = "";
            }
        }
        System.out.println(total);


        // OPTION 2 - Wrapper class
        String result = "";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if ((i == str.length() - 1) && Character.isDigit(current)) {
                result += "" + current;
                sum += Integer.parseInt(result);
            } else if (Character.isDigit(current)) {
                result += "" + current;
            } else if (!result.isEmpty() && !Character.isDigit(current)) {
                sum += Integer.parseInt(result);
                result = "";
            }

        }
        System.out.println("sum = " + sum);         // sum = 535


        // OPTION 3 - ArrayList
        ArrayList<String> s = new ArrayList<>(Arrays.asList(str.split(" ")));
        int sumOfAll = 0;

        for (String each : s) {
            String res = "";
            for (int i = 0; i < each.length(); i++) {
                if (Character.isDigit(each.charAt(i))) {
                    res += "" + each.charAt(i);
                }
            }
            if (!res.isEmpty()) {
                sumOfAll += Integer.parseInt(res);
            }
        }
        System.out.println("sumOfAll = " + sumOfAll);
    }
}