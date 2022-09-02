public class ExcelSheetColumnNumber {

    /*
    Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
    For example:
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28
        ...
    Example 1:
        Input: columnTitle = "A"
        Output: 1
    Example 2:
        Input: columnTitle = "AB"
        Output: 28
    Example 3:
        Input: columnTitle = "ZY"
        Output: 701
    Constraints:
        1 <= columnTitle.length <= 7
        columnTitle consists only of uppercase English letters.
        columnTitle is in the range ["A", "FXSHRXW"].
     */


    // 1 ms, faster than 100.00% & 43.1 MB, less than 21.07%
    public static int titleToNumber1(String columnTitle) {
        if (columnTitle.length() < 1 || columnTitle.length() > 7) {
            return -1;
        }

        int n = columnTitle.length();
        int columnNum = 0;

        for (int i = 0; i < n; i++) {
            int currentColumn = columnTitle.charAt(i) - 'A' + 1;
            columnNum = columnNum * 26 + currentColumn;
        }
        return columnNum;
    }


    // OPTION 2 - 2 ms, faster than 80.62% & 42.9 MB, less than 37.18%
    public static int titleToNumber2(String columnTitle) {

        if (columnTitle.length() < 1 || columnTitle.length() > 7) {
            return -1;
        }

        int columnNum = 0;

        for (char c : columnTitle.toCharArray()) {
            columnNum *= 26;
            columnNum += c - 'A' + 1;
        }
        return columnNum;
    }


    public static void main(String[] args) {
        System.out.println(titleToNumber1("ZY"));
    }
}

/*
LINE 60 explanation:
One way to think about it, you know char will give you an ASCII value of 'A'. What would ASCII 'A' - 'A' be? 0. Therefore, if each uppercase letter increment also increments the value, 'B' - 'A' gives you '1' with 'C' - 'A' giving you 2 and so on.

We have to add +1 since the problem starts it's values at 1 and not 0 which is what 'A' - 'A' would give us. Also note, this only works since we are only working with uppercase letters. If we had to compensate for lowercase, this technique would have to change.
 */