public class CamelCase {

    /*
    Camel Case
        Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
        Ex:
            Today is SUNDAY
            Output:
            todayIsSunday
     */

    public static void main(String[] args) {

        //OPTION 1
        String str = "Today is FRIDAY Brodas";
        String strLower = str.toLowerCase();
        StringBuilder camelCase = new StringBuilder();

        for (int i = 0; i < strLower.length(); i++) {
            if (strLower.charAt(i) == ' ') {
                camelCase.append(strLower.substring(i + 1, i + 2).toUpperCase());
                i++;
            } else {
                camelCase.append(strLower.charAt(i));
            }
        }
        System.out.println(camelCase);


        //OPTION 2 - Array
        String[] arrayOfStr = strLower.split(" ");
        StringBuilder arrayCamel = new StringBuilder();
        for (int i = 0; i < arrayOfStr.length; i++) {
            if (i > 0) {
                arrayCamel.append(arrayOfStr[i].substring(0, 1).toUpperCase()).append(arrayOfStr[i].substring(1));
            } else {
                arrayCamel.append(arrayOfStr[i]);
            }
        }
        System.out.println(arrayCamel);
    }
}