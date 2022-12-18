public class ReverseStringPartOnly {

    // String approach
    public static String reverseString(String s) {
        String reversed = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                temp += s.charAt(i);
            } else if (Character.isDigit(s.charAt(i))) {
                for (int j = temp.length() - 1; j >= 0; j--) {
                    reversed += temp.charAt(j);
                }
                reversed += s.charAt(i);
                temp = "";
            }
        }
        if (!temp.isEmpty()) {
            for (int i = temp.length() - 1; i >= 0 ; i--) {
                reversed += temp.charAt(i);
            }
        }
        return reversed;
    }

    // StringBuilder approach
    public static String reverseString2(String s) {
        StringBuilder originalText = new StringBuilder(s);
        StringBuilder reversed = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < originalText.length(); i++) {
            char each = originalText.charAt(i);
            if (Character.isLetter(each)) {
                temp.append(each);
            } else if (Character.isDigit(each)) {
                reversed.append(temp.reverse());
                temp.setLength(0);
                reversed.append(each);
            }
        }
        if (temp.length() != 0) {
            reversed.append(temp.reverse());
        }
        return reversed.toString();
    }


    public static void main(String[] args) {
        System.out.println(reverseString("test12pop90java989python"));               // tset12pop90avaj989nohtyp
        System.out.println(reverseString2("test12pop90java989python"));              // tset12pop90avaj989nohtyp
    }

}
