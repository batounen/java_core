public class DuplicateCharacters {

    /*
    Duplicate characters
    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.
    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE
        -> the characters A C and E are found in the String multiple times so they are duplicates

    variations:
        Write a program that can return the first duplicated character from a string
        Write a program that can return the index number of the first unique character.
     */

    public static void main(String[] args) {

        String str = "abccccccdffddd";
        StringBuilder duplicates = new StringBuilder();
        StringBuilder unique = new StringBuilder();
        int count;

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 && duplicates.indexOf("" + str.charAt(i)) == -1) {
                duplicates.append(str.charAt(i));
                System.out.println(str.charAt(i) + " was duplicated " + count + " times.");
            }
            if (count == 1) {
                unique.append(str.charAt(i));
            }
        }
        System.out.println(unique + " are the unique characters.");
    }
}