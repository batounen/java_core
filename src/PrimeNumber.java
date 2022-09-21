public class PrimeNumber {

    /*
    Prime number
        Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
        Ex:
            Input:
                11
            Output:
                prime
        Ex:
            Input:
                10
            Output:
                not prime
     */

    public static void main(String[] args) {

        // OPTION 1
        int num = 8, count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && num != 1) {
            System.out.println("Number is Prime: " + num);
        } else {
            System.out.println("Number is Not Prime: " + num);
        }


        // OPTION 2
        int n = 12;
        boolean isPrime = true;
        if (n < 2) {
            System.out.println("Not prime");
            System.exit(0);
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }


    // OPTION 3
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int a = 2;
        while (a * a <= n) {
            if (n % a == 0) {
                return false;
            }
            a++;
        }
        return a * a > n;           // the algo checked till sqrt of the number that means no number was able to divide n evenly. Thus no need to check further.
    }
}