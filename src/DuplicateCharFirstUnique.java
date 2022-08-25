public class DuplicateCharFirstUnique {

    // Write a program that can return the index number of the first unique character.

    public static void main(String[] args) {

        String str = "AAABACCDEEAF";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += str.charAt(i);
                System.out.println("First unique character is: " + unique);
                break;
            }

        }
    }
}