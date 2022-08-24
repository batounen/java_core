public class DuplicateCharFirstDup {

    // Write a program that can return the first duplicated character from a string

    public static void main(String[] args) {

        String str = "abccccccdffddd";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("First duplicated character is: " + str.charAt(i));
                break;
            }

        }
    }
}