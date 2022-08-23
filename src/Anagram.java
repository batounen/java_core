import java.util.Arrays;

public class Anagram {

    /*
    Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
    Ex:
        listen
        silent
    The letters of the two words are the same so they are anagram
     */

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        // OPTION 1 - Char Array
        char[] first = s1.toLowerCase().strip().toCharArray();
        Arrays.sort(first);

        char[] second = s2.toLowerCase().strip().toCharArray();
        Arrays.sort(second);

        if (Arrays.equals(first, second)) {
            System.out.println("Given words are Anagram");
        } else {
            System.out.println("Given words are not Anagram");
        }

        // OPTION 2 - String Array
        String str1 = "listen";
        String str2 = "silent";

        String[] letters1 = str1.split("");
        Arrays.sort(letters1);
        String[] letters2 = str2.split("");
        Arrays.sort(letters2);

        System.out.println(Arrays.equals(letters1, letters2));          // true

    }
}