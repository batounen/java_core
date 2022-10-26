public class SumOfDigits {

    public static void main(String[] args) {
        // Example: 2561 -> 2+5+6+1=14
        int n = 2561;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}