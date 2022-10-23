public class FrequencyOfCharacters {

    /*
        given a string determine how many times a char is in the string
          java:
            j - 1
            a - 2
            v - 1
     */

    public static void main(String[] args) {

        String str = "aaabbccccdddee";
        StringBuilder checked = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {            // outer: iterating one character at a time --> charAt(i)
            int counter = 0;                                // the counter should reset back to 0 for every character
            if (!checked.toString().contains("" + str.charAt(i))) {
                for (int j = 0; j < str.length(); j++) {    // inner: compare the character we are looking at( i ) with each other character in the String --> str.charAt(j)
                    if (str.charAt(i) == str.charAt(j)) {
                        counter++;
                    }
                }
                System.out.println(str.charAt(i) + " - " + counter);
                checked.append(str.charAt(i));                               // a won't be checked and run twice
            }
        }
    }
}