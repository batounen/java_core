public class SnakeCase {

    /*
    Convert PascalCase to snake_case
           write a method that get pascal case and convert to pascal case to snake case and return it
           "TestController"  --> "test_controller"
           "MoviesAndBooks"  --> "movies_and_books"
           "App7Test"        --> "app7_test"
           "1"               --> "1"
     */

    public static void main(String[] args) {
        System.out.println(snakeCase("MoviesAndBooks"));
    }


    public static String snakeCase(String str) {
        String result = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result += "_" + str.charAt(i);
            } else {
                result += str.charAt(i);
            }
        }
        return result.toLowerCase();
    }
}