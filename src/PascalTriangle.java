import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.
    Example 1:
        Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    Example 2:
        Input: numRows = 1
        Output: [[1]]
    Constraints:
        1 <= numRows <= 30
     */

    // OPTION 1 - 1 ms, faster than 73.38% & 42.3 MB, less than 9.62%
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        ArrayList<Integer> rows = new ArrayList<>();
        if (numRows >= 1 && numRows <= 30) {
            for (int i = 0; i < numRows; i++) {
                rows.add(0, 1);
                for (int j = 1; j < rows.size() - 1; j++) {
                    rows.set(j, rows.get(j) + rows.get(j + 1));
                    //System.out.println("in: " + rows);
                }
                //System.out.println("out: " + rows);
                pascal.add(new ArrayList<Integer>(rows));
            }
            return pascal;
        }
        return null;
    }

    // OPTION 2 - 1 ms, faster than 73.38% & 42.2 MB, less than 22.72%
    public static List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generatePascal(5));
    }
}