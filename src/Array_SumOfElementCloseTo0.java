import java.util.Set;
import java.util.TreeSet;

public class Array_SumOfElementCloseTo0 {

    /*
    Return the sum of the two elements closest to zero
     */

    public static void main(String[] args) {
        System.out.println(addTwo(new int[]{0, 11, 23, 65, 4987, 88, 9, 5, 4, 6, -120, 0}));
    }

    public static int addTwo(int[] arr) {

        int sum = 0;
        Set<Integer> disctances = new TreeSet<>();

        for (int each : arr) {
            disctances.add(Math.abs(each));
        }

        int i = 0;
        for (int each : disctances) {
            if (i == 3) {
                break;
            }
            if (each != 0) {
                sum += each;
            }
            i++;
        }
        return sum;
    }
}