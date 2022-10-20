public class DivisibilityCheck {

    /*
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
     */

    // 2, 3, 5 -    Codility, Test or Coders
    // 2, 3 -       CodilityTest
    // 2, 3 and 5 - CodilityTestCoders

    public static void main(String[] args) {
        printNums(99);
    }

    public static void printNums(int n) {
        for (int i = 1; i <= n; i++) {
            String temp = "";
            if (i % 2 == 0) {
                temp += "Codility";
            }
            if (i % 3 == 0) {
                temp += "Test";
            }
            if (i % 5 == 0) {
                temp += "Coders";
            }
            if (!temp.isEmpty()) {
                System.out.println(temp);
            } else {
                System.out.println(i);
            }
        }
    }
}