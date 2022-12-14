public class Palindrome {

    public static void main(String[] args) {

        //PALINDROME
        // given a String determine if it is palindrome. it means String is read the same forwards and backwards. EXAMPLE: ANNA LOL MOM LEVEL
        String word = "anna";
        StringBuilder backwards = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            backwards.append(word.charAt(i));
        }
        System.out.println(backwards.toString().equals(word) ? "Palindrome" : "Not Palindrome");


        // PALINDROME NUMBER
        int x = 1221, original = x, reversed = 0, digit;
        while (x > 0) {
            digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(original == reversed ? "Number is Palindrome" : "Number is not Palindrome");
    }

    // StringBuilder approach
    public boolean isPalindrome(int x) {
        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}
