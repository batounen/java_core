public class Palindrome {

    public static void main(String[] args) {

        //PALINDROME
        // given a String determine if it is palindrome. it means String is read the same forwards and backwards. EXAMPLE: ANNA LOL MOM LEVEL

        String word = "anna";
        String backwards = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            backwards += word.charAt(i);
        }
        System.out.println(backwards.equals(word) ? "Palindrome" : "Not Palindrome");


        // PALINDROME NUMBER
        int x = 1221, original = x, reversed = 0, digit;
        while (x >= 1) {
            digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(original == reversed ? "Number is Palindrome" : "Number is not Palindrome");

    }
}
