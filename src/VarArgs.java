public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(1,5,6,8,9));
    }

    private static int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}